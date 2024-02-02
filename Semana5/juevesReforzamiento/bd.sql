CREATE TABLE Autores (
    autor_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) UNIQUE,
    nacionalidad VARCHAR(255)
);

CREATE TABLE Editoriales (
    editorial_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) UNIQUE,
    pais VARCHAR(255)
);

CREATE TABLE Libros (
    isbn VARCHAR(255) PRIMARY KEY,
    titulo VARCHAR(255),
    anio_publicacion INT,
    precio DECIMAL,
    editorial_id_fk INT REFERENCES Editoriales(editorial_id)
);

CREATE TABLE Libros_Autores (
    isbn VARCHAR(255),
    autor_id_fk INTEGER,
    FOREIGN KEY (autor_id_fk) REFERENCES Autores(autor_id),
    FOREIGN KEY (isbn) REFERENCES Libros(isbn)
);

CREATE TABLE Categorias (
    categoria_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) UNIQUE
);

CREATE TABLE Libros_Categorias (
    isbn VARCHAR(255),
    categoria_id_fk INTEGER REFERENCES Categorias(categoria_id),
    FOREIGN KEY (isbn) REFERENCES Libros(isbn)
);

CREATE TABLE Comentarios (
    comentario_id SERIAL PRIMARY KEY,
    contenido VARCHAR(255),
    isbn VARCHAR(255),
    FOREIGN KEY (isbn) REFERENCES Libros(isbn)
);
