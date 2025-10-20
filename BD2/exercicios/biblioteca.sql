CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nacionalidade VARCHAR(100)
);

CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    autor_id INT,
    ano_publicacao INT,
    FOREIGN KEY (autor_id) REFERENCES autores(id)
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE
);

CREATE TABLE emprestimos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    livro_id INT,
    data_emprestimo DATE,
    data_devolucao DATE,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (livro_id) REFERENCES livros(id)
);

INSERT INTO autores (nome, nacionalidade) VALUES 
('Autor 1', 'Nacionalidade 1'),
('Autor 2', 'Nacionalidade 2');

INSERT INTO livros (titulo, autor_id, ano_publicacao) VALUES 
('Livro 1', 1, 2021),
('Livro 2', 2, 2022);

INSERT INTO clientes (nome, cpf) VALUES 
('Cliente 1', '12345678901'),
('Cliente 2', '10987654321');

INSERT INTO emprestimos (cliente_id, livro_id, data_emprestimo, data_devolucao) VALUES 
(1, 1, '2023-10-01', '2023-10-15'),
(2, 2, '2023-10-02', '2023-10-16');

CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    livro_id INT,
    funcionario_id INT,
    data_reserva DATE,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (livro_id) REFERENCES livros(id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id)
);

ALTER TABLE clientes ADD telefone VARCHAR(15);

ALTER TABLE autores DROP COLUMN nacionalidade;
ALTER TABLE livros MODIFY ano_publicacao SMALLINT;
