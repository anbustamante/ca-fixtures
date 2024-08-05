CREATE TABLE Partidos (
    Rival VARCHAR(255),
    Localia BOOLEAN,
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    Fecha DATE,
    Categoria VARCHAR(255)
);

INSERT INTO Partidos (Rival, Localia, Fecha, Categoria)
VALUES ('Mercedes', 1, '2022-01-01', 'RUGBY_PS'),
       ('Retiro', 0, '2022-03-21', 'HOCKEY_PS'),
       ('CUBA', 1, '2022-03-20', 'RUGBY_PS'),
       ('Areco', 0, '2022-03-22', 'RUGBY_PS');