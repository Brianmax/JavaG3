create table autores(
    autor_id serial primary key,
    nombre varchar not null
);

create table direcciones(
    direccion_id serial primary key,
    direccion varchar not null unique,

    autor_id_fk integer references autores(autor_id)
        on delete cascade
);