DROP TABLE IF EXISTS hoteis;
CREATE TABLE IF NOT EXISTS hoteis (
    id int auto_increment primary key,
    nomeFilial VARCHAR(64),
    rua VARCHAR(32),
    numero VARCHAR(20),
    cidade VARCHAR(32),
    estado VARCHAR(10),
    cincoEstrelas Boolean
    );