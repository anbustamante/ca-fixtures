CREATE TABLE Partidos (
    Rival VARCHAR(255),
    Localia BOOLEAN,
    Id BIGINT PRIMARY KEY,
    Fecha DATE,
    Categoria VARCHAR(255)
);

INSERT INTO Partidos (Rival, Localia, Id, Fecha, Categoria)
VALUES ('Mercedes', 1, 1, '2022-01-01', 'Rugby/PS'),
       ('Retiro', 0, 2, '2022-02-15', 'Hockey/PS'),
       ('CUBA', 1, 3, '2022-03-20', 'Rugby/PS'),
       ('Areco', 0, 4, '2022-04-10', 'Rugby/PS');