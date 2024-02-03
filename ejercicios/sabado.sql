CREATE TABLE Cliente (
    ID_Cliente SERIAL PRIMARY KEY,
    Nombre VARCHAR(255),
    Direccion VARCHAR(255),
    Telefono VARCHAR(15),
    Correo VARCHAR(255)
);

CREATE TABLE Propiedad (
    ID_Propiedad SERIAL PRIMARY KEY,
    Direccion VARCHAR(255),
    TipoPropiedad VARCHAR(50),
    NumHabitaciones INTEGER,
    PrecioAlquiler DECIMAL(10, 2)
);

CREATE TABLE Departamento (
    ID_Departamento SERIAL PRIMARY KEY,
    Numero INTEGER,
    ID_Propiedad INTEGER REFERENCES Propiedad(ID_Propiedad),
    ID_Arrendatario INTEGER REFERENCES Cliente(ID_Cliente)
);

CREATE TABLE Contrato (
    ID_Contrato SERIAL PRIMARY KEY,
    FechaInicio DATE,
    FechaFin DATE,
    PrecioAlquiler DECIMAL(10, 2),
    EstadoContrato VARCHAR(50),
    ID_Departamento INTEGER REFERENCES Departamento(ID_Departamento)
);

CREATE TABLE Pago (
    ID_Pago SERIAL PRIMARY KEY,
    FechaPago DATE,
    Monto DECIMAL(10, 2),
    MetodoPago VARCHAR(50)
);

CREATE TABLE Contrato_Pago (
    ID_Contrato INTEGER REFERENCES Contrato(ID_Contrato),
    ID_Pago INTEGER REFERENCES Pago(ID_Pago),
    PRIMARY KEY (ID_Contrato, ID_Pago)
);
