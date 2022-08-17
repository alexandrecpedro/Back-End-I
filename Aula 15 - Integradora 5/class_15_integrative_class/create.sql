DROP TABLE IF EXISTS enderecos;
CREATE TABLE IF NOT EXISTS enderecos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(64),
    numero VARCHAR(8),
    cidade VARCHAR(32),
    bairro VARCHAR(32)
);

DROP TABLE IF EXISTS pacientes;
CREATE TABLE IF NOT EXISTS pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(64),
    sobrenome VARCHAR(64),
    rg VARCHAR(20),
    dataCadastro DATE,
    idEndereco INT
);
ALTER TABLE pacientes ADD FOREIGN KEY (idEndereco) REFERENCES enderecos(id);