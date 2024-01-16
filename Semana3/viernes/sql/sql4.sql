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

create table if not exists comentarios(
comentario_id serial primary key,
contenido text not null,
num_reacciones integer not null,

usuario_id_fk integer references usuarios(usuario_id)
on delete set null,

post_id_fk integer references post(post_id)
on delete cascade

);

create table categorias(
    categoria_id serial primary key,
    nombre varchar not null,
    descripcion varchar
)

create table post_categoria(
    post_id_fk integer,
    categoria_id_fk integer,

    foreign key (post_id_fk) references post(post_id),
    foreign key (categoria_id_fk) references categorias(categoria_id)
)

-- agregando fk
alter table post add constraint fk_usuario foreign key (usuario_id_fk)
references usuarios(usuario_id) on delete set null;

-- add on delete cascade on post


alter table usuarios add column password varchar not null;

alter table post rename column contenido to contenido_post;
