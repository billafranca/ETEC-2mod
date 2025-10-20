CREATE DATABASE escola;
USE escola;

CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    matricula VARCHAR(100) UNIQUE
);

CREATE TABLE professores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    formacao VARCHAR(100)
);

CREATE TABLE disciplinas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    carga_horaria INT
);

CREATE TABLE turmas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    disciplina_id INT,
    professor_id INT,
    ano INT,
    semestre INT,
    FOREIGN KEY (disciplina_id) REFERENCES disciplinas(id),
    FOREIGN KEY (professor_id) REFERENCES professores(id)
);

CREATE TABLE matriculas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno_id INT,
    turma_id INT,
    data_matricula DATE,
    FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    FOREIGN KEY (turma_id) REFERENCES turmas(id)
);

INSERT INTO professores (nome, formacao) VALUES 
('Professor A', 'Matemática'),
('Professor B', 'História'),
('Professor C', 'Ciências');

INSERT INTO disciplinas (nome, carga_horaria) VALUES 
('Matemática', 60),
('História', 45),
('Ciências', 30);

INSERT INTO alunos (nome, data_nascimento, matricula) VALUES 
('Aluno 1', '2005-01-15', '2023001'),
('Aluno 2', '2006-02-20', '2023002'),
('Aluno 3', '2005-03-25', '2023003'),
('Aluno 4', '2004-04-30', '2023004'),
('Aluno 5', '2006-05-05', '2023005');

INSERT INTO turmas (disciplina_id, professor_id, ano, semestre) VALUES 
(1, 1, 2023, 1),
(2, 2, 2023, 1),
(3, 3, 2023, 1);

INSERT INTO matriculas (aluno_id, turma_id, data_matricula) VALUES 
(1, 1, '2023-01-10'),
(2, 2, '2023-01-11'),
(3, 1, '2023-01-12'),
(4, 3, '2023-01-13'),
(5, 2, '2023-01-14');

CREATE TABLE boletins (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno_id INT,
    disciplina_id INT,
    professor_id INT,
    nota DECIMAL(4,2),
    frequencia INT,
    FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    FOREIGN KEY (turma_id) REFERENCES turmas(id),
    FOREIGN KEY (professor_id) REFERENCES professores(id)
);

ALTER TABLE alunos 
ADD telefone VARCHAR(15);

ALTER TABLE alunos 
DROP COLUMN matricula;


    