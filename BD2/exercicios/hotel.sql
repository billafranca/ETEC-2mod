CREATE DATABASE hotel;
USE hotel;

CREATE TABLE hospedes (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    telefone VARCHAR(15)  
);

CREATE TABLE quartos (
    numero INT PRIMARY KEY,
    tipo VARCHAR(50),
    preco_diaria INT
);

CREATE TABLE reservas (
    id INT PRIMARY KEY,
    hospede_id INT,
    quarto_id INT,
    data_checkin DATE,
    data_checkout DATE,
    FOREIGN KEY (hospede_id) REFERENCES hospedes(id),
    FOREIGN KEY (quarto_id) REFERENCES quartos(numero)
);

CREATE TABLE pagamentos (
    id INT PRIMARY KEY,
    reserva_id INT,
    valor_total DECIMAL(10, 2),
    metodo_pagamento VARCHAR(50),
    FOREIGN KEY (reserva_id) REFERENCES reservas(id)
);

CREATE TABLE funcionarios (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(100)
);

CREATE TABLE servicos_extras (
    id INT PRIMARY KEY,
    reserva_id INT,
    funcionario_id INT,
    pagamento_id INT,
    descricao VARCHAR(255),
    valor DECIMAL(10, 2),
    FOREIGN KEY (reserva_id) REFERENCES reservas(id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id),
    FOREIGN KEY (pagamento_id) REFERENCES pagamentos(id)
);

INSERT INTO hospedes (id, nome, cpf, telefone) VALUES
(1, 'Maria Silva', '123.456.789-00', '(11) 99999-1111'),
(2, 'João Souza', '987.654.321-00', '(21) 98888-2222');

INSERT INTO quartos (numero, tipo, preco_diaria) VALUES
(101, 'Solteiro', 150),
(102, 'Casal', 250);

INSERT INTO reservas (id, hospede_id, quarto_id, data_checkin, data_checkout) VALUES
(1, 1, 101, '2025-10-20', '2025-10-22'),
(2, 2, 102, '2025-10-21', '2025-10-25');

INSERT INTO pagamentos (id, reserva_id, valor_total, metodo_pagamento) VALUES
(1, 1, 300.00, 'Cartão de Crédito'),
(2, 2, 1000.00, 'Dinheiro');

ALTER TABLE hospedes ADD email VARCHAR(100);

ALTER TABLE quartos
MODIFY COLUMN preco_diaria DECIMAL(8, 2);
