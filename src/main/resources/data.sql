-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS ProgWeb2;

-- Usar o banco de dados criado.
USE ProgWeb2;

-- Criar a tabela Pessoa.
CREATE TABLE IF NOT EXISTS Pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL);

-- Inserir nomes na tabela Pessoa.
INSERT INTO Pessoa (nome) VALUES
    ('João Silva'),
    ('Maria Oliveira'),
    ('Pedro Santos'),
    ('Ana Sousa'),
    ('Lucas Costa'),
    ('José Almeida'),
    ('Carla Ferreira'),
    ('Paulo Rocha'),
    ('Juliana Martins');