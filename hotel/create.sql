DROP TABLE IF EXISTS hoteis;
CREATE TABLE IF NOT EXISTS hoteis (
    id int auto_increment primary key,
    nomeFilial VARCHAR(64),
    rua VARCHAR(8),
    numero VARCHAR(32),
    cidade VARCHAR(32),
    estado VARCHAR(32),
    e5Estrelas BOOLEAN
    );