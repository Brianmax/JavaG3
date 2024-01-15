create table if not exists usuarios
(
	usuario_id serial primary key,
	username varchar not null unique,
	email varchar not null unique,
	direccion varchar
);

create table if not exists posts
(
	post_id serial primary key,
	titulo varchar not null ,
	contenido text,
	fecha_creacion date default current_date,
	usuario_id_fk integer,
	foreign key(usuario_id_fk) references usuarios(usuario_id)
	on delete set null
);

create table if not exists comentarios(
    comentario_id serial primary key,
    contenido varchar not null,
    num_reactions integer not null default 0,

    usuario_id_fk integer,
    post_id_fk integer,

    foreign key (usuario_id_fk) references usuarios(usuario_id)
        on delete set null,

    foreign key (post_id_fk) references posts(post_id)
        on delete cascade
);

create table if not exists categorias(
    categoria_id serial primary key,
    nombre varchar not null unique,
    descripcion varchar
);

create table if not exists categorias_posts(
    categoria_id_fk integer,
    post_id_fk integer,

    foreign key (categoria_id_fk) references categorias(categoria_id)
        on delete cascade,

    foreign key (post_id_fk) references posts(post_id)
        on delete cascade
);
