
USE Loja_pascotto;
DROP TABLE Produtos;
CREATE TABLE Produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    id_fornecedor INT,
    estoque INT NOT NULL
);

CREATE TABLE fornecedores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome varchar(255) NOT NULL,
    cnpj VARCHAR(255),
    telefone VARCHAR(11),
    cpf VARCHAR(14)
);

CREATE TABLE colaborador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    salario VARCHAR(255)
);

CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dataPedido DATE,
    id_funcionario INT,
    id_produto INT,
    quantidade VARCHAR(255) NOT NULL
);

ALTER TABLE fornecedores DROP COLUMN cpf;
ALTER TABLE fornecedores ADD email VARCHAR(255);
ALTER TABLE Produtos ADD id_categoria INT;
ALTER TABLE Produtos ADD FOREIGN KEY (id_categoria) REFERENCES categoria(id);


INSERT INTO Produtos (nome, preco, estoque, id_categoria) VALUES
    ('Mouse', '24.00', '120',1),
    ('Teclado', '33.00', '200',1),
    ('Monitor', '120.00', '120',1);
    
SELECT * FROM Produtos;

INSERT INTO fornecedores (nome, cnpj, telefone, email) VALUES
    ('SBF', '721894', '3270-4911', 'grupoSBF@gmail.com'),
    ('Express', '721134', '3330-4912', 'grupoexpress@gmail.com'),
    ('groupCleiton', '221894', '3319-2316',  'grupocleiton@gmail.com');
    
SELECT * FROM fornecedores;
    
INSERT INTO colaborador(nome, cargo, salario) VALUES
    ('Luís Gonzaga', 'analista de dados junior', '2400'),
    ('Matheus Aguiar Brasileiro', 'Gestor de Projetos', '5400'),
    ('Clériton Sávio', 'Representante de vendas', '6180');
    
SELECT * FROM colaborador;

INSERT INTO pedidos(dataPedido, id_funcionario, id_produto, quantidade) VALUES
    ('2025-10-23', 1, 1, '48'),
    ('2025-2-01', 1 ,1 ,'53'),
    ('2023-5-18', 1,1, '518');
    
SELECT * FROM pedidos;


