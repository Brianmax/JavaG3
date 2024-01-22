# Ejercicio de Base de Datos - Relación Muchos a Muchos

## Objetivo
Diseñar una base de datos para un sistema de gestión de cursos y estudiantes. Se espera modelar una relación muchos a muchos entre estudiantes y cursos utilizando una tabla intermedia.

## Entidades

### Estudiantes
- **EstudianteID** (clave primaria)
- Nombre
- Apellido
- Fecha de nacimiento
- Dirección

### Cursos
- **CursoID** (clave primaria)
- Nombre del curso
- Descripción
- Horas de duración

## Tabla Intermedia

### Inscripciones
- **EstudianteID** (clave foránea referenciando a Estudiantes)
- **CursoID** (clave foránea referenciando a Cursos)

## Notas adicionales
- La tabla "Inscripciones" rompe la relación muchos a muchos entre "Estudiantes" y "Cursos".
- Cada fila en "Inscripciones" representa una inscripción específica de un estudiante en un curso en particular.
- La combinación de EstudianteID y CursoID es única en la tabla "Inscripciones".
- Ambas columnas (EstudianteID y CursoID) son claves foráneas que apuntan a las respectivas tablas de "Estudiantes" y "Cursos".

## Requisitos
- Asegúrate de que la tabla "Estudiantes" tenga al menos 10 registros.
- Asegúrate de que la tabla "Cursos" tenga al menos 10 registros.
- Agrega registros a la tabla "Inscripciones" para simular inscripciones de estudiantes en cursos.

## Entrega
- Crea un archivo llamado `recuperacion_nombre_apellido.sql` con el código SQL necesario para crear las tablas y agregar los registros.