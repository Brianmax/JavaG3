CREATE TABLE aerolinea (
    aerolinea_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    estado BOOLEAN
);

CREATE TABLE avion (
    avion_id SERIAL PRIMARY KEY,
    modelo VARCHAR(255),
    capacidad_pasajeros INT,
    aerolinea_id_fk INT,
    estado BOOLEAN,
    FOREIGN KEY (aerolinea_id_fk) REFERENCES aerolinea(aerolinea_id)
);

CREATE TABLE vuelo (
    vuelo_id SERIAL PRIMARY KEY,
    avion_id_fk INT,
    fecha_salida DATE,
    fecha_llegada DATE,
    estado BOOLEAN,
    FOREIGN KEY (avion_id_fk) REFERENCES avion(avion_id)
);

CREATE TABLE piloto (
    piloto_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    estado BOOLEAN
);

CREATE TABLE piloto_vuelo (
    piloto_id_fk INT,
    vuelo_id_fk INT,
    FOREIGN KEY (piloto_id_fk) REFERENCES piloto(piloto_id),
    FOREIGN KEY (vuelo_id_fk) REFERENCES vuelo(vuelo_id)
);

CREATE TABLE pasajero (
    pasajero_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    estado BOOLEAN
);

CREATE TABLE reserva (
    reserva_id SERIAL PRIMARY KEY,
    vuelo_id_fk INT,
    pasajero_id_fk INT,
    asiento_numero INT,
    estado INT,
    FOREIGN KEY (vuelo_id_fk) REFERENCES vuelo(vuelo_id),
    FOREIGN KEY (pasajero_id_fk) REFERENCES pasajero(pasajero_id)
);