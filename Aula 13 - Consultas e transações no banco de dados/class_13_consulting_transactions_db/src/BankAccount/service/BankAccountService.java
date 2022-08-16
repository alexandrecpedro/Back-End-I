package BankAccount.service;

import BankAccount.model.BankAccount;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;
import java.text.NumberFormat;

public class BankAccountService {
    /** Data Formatting **/
    // Format Currency
    static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    /** Attribute **/
    private static final Logger LOGGER = Logger.getLogger(BankAccountService.class);

    /** Queries - SQL Database **/
    private static final String SQL_CREATE_TABLE = """
            DROP TABLE IF EXISTS account;
            
            CREATE TABLE account (
            id INT PRIMARY KEY,
            name VARCHAR(64) NOT NULL,
            accountNumber VARCHAR(64) NOT NULL,
            balance DOUBLE
            );
            """;

    private static final String SQL_UPDATE = """
            UPDATE account SET balance = ?
            WHERE id = ?
            """;

    private static final String SQL_INSERT = """
            INSERT INTO account (id, name, accountNumber, balance)
            VALUES (?, ?, ?, ?)
            """;

    /** Methods **/
    // Main Method
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Connection connection = null;
        BankAccount bankAccount = new BankAccount("Bill", "5214523-4",
                100000.0);

        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_TABLE);
            preparedStatement.executeUpdate();

            // Insert data at DB
            insertAccount(connection, bankAccount);

            // Update Account (1st step)
            updateBankAccountBalance(connection, bankAccount, 1000.0);
            connection.setAutoCommit(false);

            // Update Account (2nd step)
            updateBankAccountBalance(connection, bankAccount, 1500.0);
            int a = 4/0;
            connection.commit();
            connection.setAutoCommit(true);
            showBankAccountData(connection);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }

        Connection connection1 = getConnection();
        showBankAccountData(connection1);
    }

    // InsertAccount Method
    public static void insertAccount(Connection connection, BankAccount bankAccount)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setLong(1, 1);
        preparedStatement.setString(2, bankAccount.getName());
        preparedStatement.setString(3, bankAccount.getAccountNumber());
        preparedStatement.setDouble(4, bankAccount.getBalance());
        //LOGGER.info("Inserting account at Database");
        preparedStatement.execute();
    }

    // UpdateBankAccountBalance Method
    public static void updateBankAccountBalance(Connection connection, BankAccount bankAccount,
                                                Double value) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setDouble(1, bankAccount.getBalance() + value);
        preparedStatement.setInt(2, 1);
        //LOGGER.info("Depositing R$ " + value);
        preparedStatement.execute();
    }

    // ShowBankAccountData Method
    public static void showBankAccountData(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM account";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        //LOGGER.info("Bank account data: ");

        while (rs.next()) {
            System.out.println("ID: " + rs.getLong("id") +
                    "\nName: " + rs.getString("name") +
                    "\nAccount Number: " + rs.getString("accountNumber") +
                    "\nBalance: " + currencyFormat.format(rs.getDouble("balance")));
        }
    }

    // GetConnection Method
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:mem:class_13_consulting_transactions_db",
                "sa", "");
    }

}
