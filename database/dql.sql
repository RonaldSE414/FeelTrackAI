/* Consultar todos os usuários */

SELECT * FROM usuario;

/* Consultar usuário por e-mail */

SELECT *
FROM usuario
WHERE email = 'matheus.solano@email.com';

/* Realizar login */

SELECT *
FROM usuario
WHERE email = 'matheus.solano@email.com'
AND senha = '123';

/* Consultar questionários */

SELECT * FROM questionario;

/* Consultar resultados */

SELECT * FROM resultado;

/* Histórico completo */

SELECT
    u.nome,
    q.data_resposta,
    q.estresse,
    q.cansaco,
    q.motivacao,
    r.estado,
    r.nivel_estresse,
    r.recomendacao
FROM usuario u
INNER JOIN questionario q
    ON q.usuario_id = u.id
INNER JOIN resultado r
    ON r.questionario_id = q.id
WHERE u.id = 1;
