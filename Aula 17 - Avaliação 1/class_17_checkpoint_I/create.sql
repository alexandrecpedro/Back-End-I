--DROP TABLE IF EXISTS filiais;
CREATE TABLE IF NOT EXISTS filiais (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeFilial VARCHAR(64),
    logradouro VARCHAR(64),
    numero VARCHAR(8),
    cidade VARCHAR(32),
    estado VARCHAR(32),
    e5Estrelas BIT
);