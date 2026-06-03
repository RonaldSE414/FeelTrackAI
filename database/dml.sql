/* Inserir usuário */

INSERT INTO usuario
(nome, email, senha, tipo)
VALUES
(
    'Matheus Solano',
    'matheus.solano@email.com',
    '123',
    'FUNCIONARIO'
);

/* Inserir questionário */

INSERT INTO questionario
(usuario_id, estresse, cansaco, motivacao)
VALUES
(
    1,
    8,
    6,
    5
);

/* Inserir resultado */

INSERT INTO resultado
(
    questionario_id,
    nivel_estresse,
    estado,
    recomendacao
)
VALUES
(
    1,
    80,
    'ALTO',
    'Procure realizar pausas durante o trabalho.'
);

/* Atualizar nome */

UPDATE usuario
SET nome = 'Matheus Henrique Solano'
WHERE id = 1;

/* Alterar senha */

UPDATE usuario
SET senha = 'novaSenha123'
WHERE id = 1;

/* Excluir resultado */

DELETE FROM resultado
WHERE id = 1;

/* Excluir questionário */

DELETE FROM questionario
WHERE id = 1;

/* Excluir usuário */

DELETE FROM usuario
WHERE id = 1;
