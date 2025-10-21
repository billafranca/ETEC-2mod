CREATE DATABASE empresa;
USE empresa;

CREATE TABLE departamento (
   id INT PRIMARY KEY,
   nome VARCHAR(100),
   localizacao VARCHAR(100)
);

CREATE TABLE funcionario (
   id INT PRIMARY KEY,
   nome VARCHAR(100),
   cargo VARCHAR(100),
   departamento_id INT,
   FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);

CREATE TABLE projeto (
   id INT PRIMARY KEY,
   nome VARCHAR(100),
   orcamento DECIMAL(15, 2)
);

CREATE TABLE alocacoes (
    funcionario_id INT,
    projeto_id INT,
    horas_semanais INT,
    PRIMARY KEY (funcionario_id, projeto_id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id),
    FOREIGN KEY (projeto_id) REFERENCES projeto(id)
);

INSERT INTO departamento (id, nome, localizacao) VALUES
(1, 'Recursos Humanos', 'Edificio A'),
(2, 'Tecnologia da Informação', 'Edificio B'),
(3, 'Marketing', 'Edificio C');

INSERT INTO funcionario (id, nome, cargo, departamento_id) VALUES
(1, 'Ana Silva', 'Gerente de RH', 1),
(2, 'Bruno Costa', 'Desenvolvedor', 2),
(3, 'Carla Souza', 'Analista de Marketing', 3),
(4, 'Daniel Lima', 'Suporte Técnico', 2);

INSERT INTO projeto (id, nome, orcamento) VALUES
(1, 'Sistema Interno', 50000.00),
(2, 'Campanha Publicitária', 30000.00),
(3, 'Recrutamento 2024', 20000.00);

INSERT INTO alocacoes (funcionario_id, projeto_id, horas_semanais) VALUES
(1, 1, 10),
(2, 1, 20),
(3, 2, 15),
(4, 3, 5);

CREATE TABLE tarefas (
    id INT PRIMARY KEY,
    descricao VARCHAR(255),
    gerente_id INT,
    funcionario_id INT,
    projeto_id INT,
    status VARCHAR(50),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id),
    FOREIGN KEY (projeto_id) REFERENCES projeto(id)
);

ALTER TABLE funcionario ADD salario DECIMAL(10, 2);

ALTER TABLE projeto DROP COLUMN orcamento;

