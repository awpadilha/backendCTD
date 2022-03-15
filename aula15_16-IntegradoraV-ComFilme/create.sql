DROP TABLE IF EXISTS enderecos;
DROP TABLE IF EXISTS filme;

CREATE TABLE IF NOT EXISTS enderecos
(
    id     int auto_increment primary key,
    rua    VARCHAR(64),
    numero VARCHAR(8),
    cidade VARCHAR(32),
    bairro VARCHAR(32)
);
CREATE TABLE IF NOT EXISTS filme
(
    id     int auto_increment primary key,
    nome    VARCHAR(64),
    descricao VARCHAR(255),
    min_idade int
);