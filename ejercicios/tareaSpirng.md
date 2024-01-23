# Tarea: Creación de CRUD de Productos con Spring Boot y PostgreSQL

## Configuración del Proyecto

1. Crea un nuevo proyecto Spring Boot utilizando tu IDE o [Spring Initializr](https://start.spring.io/).
2. Asegúrate de incluir las dependencias "Spring Web" y "Spring Data JPA", "Lombok" y "PostgreSQL Driver".

## Definición de la Entidad Producto

1. Crea una clase Java para representar la entidad Producto.
2. Anota la clase con `@Entity` y especifica la relación con la tabla utilizando `@Table`.
3. Incluye campos como `id`, `nombre`, `descripcion`, `precio`, `stock`, `categoria`

## Repositorio JPA

1. Crea un repositorio Spring Data JPA para la entidad Producto.
2. Extiende `JpaRepository<Producto, Long>`.

## Controlador REST

1. Crea un controlador REST para manejar operaciones CRUD en productos.
2. Utiliza la anotacion `@RestController`.
3. Define el metodo para poder crear un producto.

## Configuración de la Base de Datos

1. Configura la conexión a la base de datos en el archivo `application.properties` o `application.yml`.
2. Especifica la URL, nombre de usuario, contraseña.

## Ejecución de la Aplicación

1. Ejecuta tu aplicación Spring Boot.
2. Verifica que los endpoints CRUD estén disponibles en `http://localhost:8080/crearProducto`.

## Envío de la Tarea

1. Enviar su proyecto en un archivo comprimido.
2. Enviar captura de pantalla de la ejecución de la aplicación.
3. Enviar captura de pantalla de postman con la creación de un producto.

## Tabla productos

- Query para crear la tabla productos

```sql
CREATE TABLE productos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INTEGER NOT NULL,
    categoria VARCHAR(50) NOT NULL
);
``` 