CREATE DATABASE hospital;
USE hospital;

CREATE TABLE pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    cpf VARCHAR(11) UNIQUE
);

CREATE TABLE medicos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100)
);

CREATE TABLE consultas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    paciente_id INT,
    medico_id INT,
    data_consulta DATE,
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
    FOREIGN KEY (medico_id) REFERENCES medicos(id)
);

CREATE TABLE receitas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    consulta_id INT,
    descricao VARCHAR(255),
    FOREIGN KEY (consulta_id) REFERENCES consultas(id)
);

INSERT INTO pacientes (nome, data_nascimento, cpf) VALUES 
('João Silva', '1990-05-15', '12345678901'),
('Maria Oliveira', '1985-10-20', '10987654321');

INSERT INTO medicos (nome, especialidade) VALUES 
('Dr. Carlos Santos', 'Cardiologia'),
('Dra. Ana Lima', 'Pediatria');

INSERT INTO consultas (paciente_id, medico_id, data_consulta) VALUES 
(1, 1, '2023-11-01'),
(2, 2, '2023-11-02');

INSERT INTO receitas (consulta_id, descricao) VALUES 
(1, 'Receita de medicamento A'),
(2, 'Receita de medicamento B');

CREATE TABLE salas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL,
    andar INT
);

CREATE TABLE atendimentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    paciente_id INT,
    medico_id INT,
    data_consulta DATE,
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
    FOREIGN KEY (sala_id) REFERENCES salas(id)
);

ALTER TABLE pacientes ADD telefone VARCHAR(15);
ALTER TABLE pacientes DROP COLUMN cpf;