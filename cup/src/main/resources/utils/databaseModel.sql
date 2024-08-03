CREATE TABLE EVENT (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date DATE NOT NULL
);

CREATE TABLE WINNER (
    id SERIAL PRIMARY KEY,
    team VARCHAR(255) NOT NULL,
    member1 VARCHAR(255) NOT NULL,
    member2 VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    photoUrl VARCHAR(255)
);

CREATE TABLE PHOTO (
    id SERIAL PRIMARY KEY,
    url TEXT NOT NULL,
    date DATE NOT NULL
);

CREATE TABLE ADMIN (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    pass TEXT NOT NULL
);

INSERT INTO ADMIN (username, pass) VALUES ('admin', 'admin');
INSERT INTO WINNER(team, member1, member2, date, photoUrl) VALUES ('Team 1', 'John', 'Doe', '2020-01-01', 'https://www.google.com');
INSERT INTO PHOTO(url, date) VALUES ('https://www.google.com', '2020-01-01');
INSERT INTO EVENT(name, date) VALUES ('Event 1', '2020-01-01');