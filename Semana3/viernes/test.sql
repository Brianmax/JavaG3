create table usuario(
    usuario_id serial primary key,
    email varchar,
    direccion varchar
)

create table post
(
    post_id serial primary key,
    titulo varchar,
    contenido varchar,
    fecha_creacion date default current_date,

    usuario_id_fk integer,
    foreign key(usuario_id_fk) references usuario(usuario_id)
)
select * from usuarios;
insert into usuario(email, direccion) values('email@gmail.com','direccion de la persona');

insert into post(titulo, contenido, usuario_id_fk) values('Titulo 1', 'Contenido', 13);