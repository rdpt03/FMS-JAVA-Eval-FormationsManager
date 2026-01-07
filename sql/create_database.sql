CREATE DATABASE formationsvente;
CREATE USER 'formationsvente'@'localhost' IDENTIFIED BY 'Vente123';
GRANT ALL PRIVILEGES ON formationsvente.* TO 'formationsvente'@'localhost';
FLUSH PRIVILEGES;
