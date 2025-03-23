-- Liquibase formatted SQL

-- changeset author:3
ALTER TABLE users ADD COLUMN age INT;

-- rollback ALTER TABLE users DROP COLUMN age;
