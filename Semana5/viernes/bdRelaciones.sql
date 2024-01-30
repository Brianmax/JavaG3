CREATE TABLE IF NOT EXISTS apoderados (
    apoderado_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    contrasenia VARCHAR(255),
    role VARCHAR(255),
    fecha_creacion DATE,
    fecha_modificacion DATE,
    email VARCHAR(255) UNIQUE
);

CREATE TABLE IF NOT EXISTS profesores (
    profesor_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    contrasenia VARCHAR(255),
    role VARCHAR(255),
    fecha_creacion DATE,
    fecha_modificacion DATE,
    email VARCHAR(255) UNIQUE
);

CREATE TABLE IF NOT EXISTS estudiantes (
    estudiante_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    contrasenia VARCHAR(255),
    role VARCHAR(255),
    fecha_creacion DATE,
    fecha_modificacion DATE,
    estado BOOLEAN,
    email VARCHAR(255) UNIQUE,
    apoderado_id_fk INTEGER,
    FOREIGN KEY(apoderado_id_fk) REFERENCES apoderados(apoderado_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS cursos (
    curso_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) UNIQUE,
    profesor_id_fk INTEGER,
    FOREIGN KEY(profesor_id_fk) REFERENCES profesores(profesor_id) ON DELETE SET NULL
);

CREATE TABLE estudiante_curso (
    estudiante_id_fk INTEGER,
    curso_id_fk INTEGER,
    FOREIGN KEY (estudiante_id_fk) REFERENCES estudiantes(estudiante_id) ON DELETE CASCADE,
    FOREIGN KEY (curso_id_fk) REFERENCES cursos(curso_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS notas (
    nota_id SERIAL PRIMARY KEY,
    nota INTEGER,
    tipo_evaluacion VARCHAR(255),
    curso_id_fk INTEGER NOT NULL,
    estudiante_id_fk INTEGER NOT NULL,
    profesor_id_fk INTEGER NOT NULL,
    FOREIGN KEY (curso_id_fk) REFERENCES cursos(curso_id) ON DELETE CASCADE,
    FOREIGN KEY (estudiante_id_fk) REFERENCES estudiantes(estudiante_id) ON DELETE CASCADE,
    FOREIGN KEY (profesor_id_fk) REFERENCES profesores(profesor_id) ON DELETE CASCADE
);


CREATE TABLE IF NOT EXISTS direcciones (
    direccion_id SERIAL PRIMARY KEY,
    direccion VARCHAR(255),
    estudiante_id_fk INTEGER UNIQUE,
    FOREIGN KEY (estudiante_id_fk) REFERENCES estudiantes(estudiante_id) ON DELETE CASCADE
);