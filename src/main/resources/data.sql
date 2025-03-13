-- Création de la table
DROP TABLE IF EXISTS utilisateur;

CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title VARCHAR(50) UNIQUE NOT NULL,
    description VARCHAR(255) NOT NULL,
    publicationDate DATE NOT NULL
);
