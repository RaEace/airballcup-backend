CREATE TABLE events (
    event_id SERIAL PRIMARY KEY,
    event_name VARCHAR(255) NOT NULL,
    event_date DATE NOT NULL
);

CREATE TABLE winners (
    winner_id SERIAL PRIMARY KEY,
    team_name VARCHAR(255) NOT NULL,
    member1_name VARCHAR(255) NOT NULL,
    member2_name VARCHAR(255) NOT NULL,
    win_date DATE NOT NULL,
    photo_url TEXT
);

CREATE TABLE photos (
    photo_id SERIAL PRIMARY KEY,
    photo_url TEXT NOT NULL,
    upload_date DATE NOT NULL
);

CREATE TABLE admins (
    admin_id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password_hash TEXT NOT NULL
);