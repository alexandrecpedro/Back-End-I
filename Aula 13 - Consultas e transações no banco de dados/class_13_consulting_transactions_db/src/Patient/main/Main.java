package Patient.main;

import Patient.database.Database;
import org.apache.log4j.BasicConfigurator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        /** Attributes **/
        // Configuring log4j.properties (Alternative)
        BasicConfigurator.configure();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Connection connection = Database.getConnection();
        PreparedStatement ps = null;

        /** Try/Catch block **/
        try {
            connection.setAutoCommit(false);

            ps = connection.prepareStatement("""
                    INSERT INTO patient (firstName, lastName, address, rg, registerDate, 
                    username, password)
                    VALUES (?, ?, ?, ?, ?, ?, ?);
                    """);

            ps.setString(1, "Jean");
            ps.setString(2, "Pierre");
            ps.setString(3, "Rua da Alvorada");
            ps.setString(4, "32594701");
            ps.setDate(5, new java.sql.Date(sdf.parse("1976/05/28").getTime()));
            ps.setString(6, "JeanPier");
            ps.setString(7, "FGH2123");

            ps.executeUpdate();

            ps = connection.prepareStatement("""
                    UPDATE patient SET password = 'newPassword'
                    WHERE address = 'Rua da Alvorada';
                    """);

            int x = 5;
            if (x != 0) {
                throw new SQLException("FAKE ERROR");
            }
            ps.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            Database.closeStatement(ps);
            Database.closeConnection();
        }
    }
}
