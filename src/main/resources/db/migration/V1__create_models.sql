CREATE TABLE guest (
    id VARCHAR(255) PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    govt_id VARCHAR(255) NOT NULL,
    street_address VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip_code VARCHAR(255),
    created_at TIMESTAMP NOT NULL
);

CREATE TABLE rooms (
    id UUID PRIMARY KEY,
    room_number VARCHAR(255) NOT NULL UNIQUE,
    room_type VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
    status VARCHAR(50) NOT NULL
);

CREATE TABLE reservations (
    reservation_id SERIAL PRIMARY KEY,
    guest_id VARCHAR(255) NOT NULL,
    room_id UUID NOT NULL,
    check_in_date TIMESTAMP NOT NULL,
    check_out_date TIMESTAMP NOT NULL,
    status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL,

    FOREIGN KEY (guest_id) REFERENCES guest(id) ON DELETE CASCADE,
    FOREIGN KEY (room_id) REFERENCES rooms(id) ON DELETE CASCADE
);

CREATE TABLE payment (
    payment_id UUID PRIMARY KEY,
    amount FLOAT NOT NULL,
    payment_method VARCHAR(50) NOT NULL,
    payment_status VARCHAR(50) NOT NULL,
    payment_date TIMESTAMP NOT NULL,
    reservation_id BIGINT NOT NULL,

    FOREIGN KEY (reservation_id) REFERENCES reservations(reservation_id) ON DELETE CASCADE
);


