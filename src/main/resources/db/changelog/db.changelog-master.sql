--liquibase formatted sql

-- Changeset guest:1
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE guest (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    govt_id VARCHAR(255) NOT NULL,
    street_address VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip_code VARCHAR(255),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Rollback
DROP TABLE guest;

-- Changeset guest:2
INSERT INTO guest (first_name, last_name, govt_id, street_address, city, state, zip_code)
VALUES
('John', 'Doe', 'A123456789', '123 Elm St', 'Fresno', 'CA', '93727'),
('Jane', 'Smith', 'B987654321', '456 Oak Ave', 'Clovis', 'CA', '93612'),
('Michael', 'Johnson', 'C112233445', '789 Pine Rd', 'Madera', 'CA', '93636'),
('Emily', 'Davis', 'D223344556', '101 Maple Blvd', 'Sanger', 'CA', '93657');

-- Rollback
DELETE FROM guest WHERE first_name = 'John' AND last_name = 'Doe';
DELETE FROM guest WHERE first_name = 'Jane' AND last_name = 'Smith';
DELETE FROM guest WHERE first_name = 'Michael' AND last_name = 'Johnson';
DELETE FROM guest WHERE first_name = 'Emily' AND last_name = 'Davis';


