CREATE TABLE Partidos (
    Rival VARCHAR(255),
    Localia BOOLEAN,
    Id BIGINT PRIMARY KEY,
    Fecha DATE,
    Categoria VARCHAR(255)
);

INSERT INTO Partidos (Rival, Localia, Id, Fecha, Categoria)
VALUES ('Mercedes', 1, 1, '2022-01-01', 'Rugby_PS'),
       ('Retiro', 0, 2, '2022-03-21', 'Hockey_PS'),
       ('CUBA', 1, 3, '2022-03-20', 'Rugby_PS'),
       ('Areco', 0, 4, '2022-03-22', 'Rugby_PS');