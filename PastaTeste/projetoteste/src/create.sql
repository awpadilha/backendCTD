DROP TABLE IF EXISTS usuarios;
CREATE TABLE IF NOT EXISTS usuarios (
    id int auto_increment primary key,
    nome VARCHAR(64),
    idade VARCHAR(8),
    sexo VARCHAR(32),
    datanascimento VARCHAR(32)
    );