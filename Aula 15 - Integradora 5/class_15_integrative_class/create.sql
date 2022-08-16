DROP TABLE IF EXISTS addresses;

CREATE TABLE IF NOT EXISTS addresses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    street VARCHAR(64),
    houseNumber VARCHAR(8),
    city VARCHAR(32),
    neighborhood VARCHAR(32)
);