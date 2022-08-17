--DROP TABLE IF EXISTS employees;
CREATE TABLE IF NOT EXISTS employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(64),
    lastName VARCHAR(64),
    cpf VARCHAR(14),
    phone VARCHAR(20),
    position VARCHAR(32),
    access BIT
);