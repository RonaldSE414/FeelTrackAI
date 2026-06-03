CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(150) NOT NULL,
    tipo VARCHAR(30) NOT NULL
);

CREATE TABLE questionario (
    id SERIAL PRIMARY KEY,
    usuario_id INTEGER NOT NULL,
    estresse INTEGER NOT NULL,
    cansaco INTEGER NOT NULL,
    motivacao INTEGER NOT NULL,
    data_resposta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_questionario_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuario(id)
        ON DELETE CASCADE
);

CREATE TABLE resultado (
    id SERIAL PRIMARY KEY,
    questionario_id INTEGER NOT NULL,
    nivel_estresse INTEGER NOT NULL,
    estado VARCHAR(50) NOT NULL,
    recomendacao TEXT,

    CONSTRAINT fk_resultado_questionario
        FOREIGN KEY (questionario_id)
        REFERENCES questionario(id)
        ON DELETE CASCADE
);
