create table if not exists profesores(
	profesor_id serial primary key,
	nombre varchar(20) not null,
	apellido varchar(20) not null,
	email varchar(70) not null unique
);

create table if not exists cursos(
	curso_id serial primary key,
	nombre varchar(20) not null,

	profesor_id_fk integer,
	constraint profesor_fk
	foreign key(profesor_id_fk)
		references profesores(profesor_id)
		on delete set null
)

insert into profesores(nombre, apellido, email)
values('Jose', 'Vergara', 'gvergara@gmail.com')

select * from profesores;

select * from cursos;

insert into cursos(nombre, profesor_id_fk)
values ('Programacion', 1);

insert into profesores(nombre, apellido, email)
values('Marcos', 'Sanchez', 'msanchez@gmail.com');

insert into profesores(nombre, apellido, email)
values('Mariana', 'Segovia', 'msegovia@gmail.com');

insert into profesores(nombre, apellido, email)
values('Jorge', 'Huamani', 'jhuamani@gmail.com');

insert into cursos(nombre, profesor_id_fk)
values ('Algoritmos', 2),
		('Fisica', 1)

delete from profesores where profesor_id=1;
