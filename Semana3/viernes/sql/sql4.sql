create table usuarios(
    usuario_id serial primary key,
    username varchar(20) not null unique,
    email varchar(70) not null unique,
    direccion varchar(60) not null
);

create table post
(
    post_id serial primary key,
    titulo varchar not null,
    contenido text not null,
    fecha_creacion date default current_date,

    usuario_id_fk integer
);
-- agregando fk
alter table post add constraint fk_usuario foreign key (usuario_id_fk)
references usuarios(usuario_id) on delete set null;

alter table usuarios add column password varchar not null;

alter table post rename column contenido to contenido_post;
