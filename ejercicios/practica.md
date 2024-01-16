## Practica 1
La base de datos del sistema de biblioteca se ha diseñado para gestionar de manera eficiente la información relacionada con libros, autores, categorías, préstamos y lectores. A continuación, se proporciona una descripción detallada de las entidades y sus relaciones:
### Definición de Entidades y Atributos:
a. **Libros:**
   - Atributos:
      - `ISBN` (Número de identificación único, tipo: VARCHAR)
      - `Título` (Título del libro, tipo: VARCHAR)
   - Relaciones:
      - Muchos a muchos con Autores (a través de la tabla intermedia `Autores_Libros`)
      - Muchos a muchos con Categorías (a través de la tabla intermedia `Libros_Categorias`)

b. **Autores:**
   - Atributos:
      - `Autor_ID` (Identificador único, tipo: INT)
      - `Nombre` (Nombre del autor, tipo: VARCHAR)
   - Relaciones:
      - Muchos a muchos con Libros (a través de la tabla intermedia `Autores_Libros`)

c. **Categorías:**
   - Atributos:
      - `Categoria_ID` (Identificador único, tipo: INT)
      - `Nombre` (Nombre de la categoría, tipo: VARCHAR)
   - Relaciones:
      - Muchos a muchos con Libros (a través de la tabla intermedia `Libros_Categorias`)

d. **Préstamos:**
   - Atributos:
      - `Prestamo_ID` (Identificador único, tipo: INT)
      - `Fecha_Prestamo` (Fecha de préstamo, tipo: DATE)
      - `Fecha_Devolucion_Esperada` (Fecha de devolución esperada, tipo: DATE)
   - Relaciones:
      - Uno a uno con Libros
      - Uno a uno con Lectores

e. **Lectores:**
   - Atributos:
      - `Lector_ID` (Identificador único, tipo: INT)
      - `Nombre` (Nombre del lector, tipo: VARCHAR)
   - Relaciones:
      - Uno a muchos con Préstamos

### Tablas y Relaciones:

a. **Libros:**
   - Tabla: `Libros`
   - Clave Primaria: `ISBN`

b. **Autores:**
   - Tabla: `Autores`
   - Clave Primaria: `Autor_ID`

c. **Categorías:**
   - Tabla: `Categorias`
   - Clave Primaria: `Categoria_ID`

d. **Préstamos:**
   - Tabla: `Prestamos`
   - Clave Primaria: `Prestamo_ID`
   - Claves Foráneas:
      - `ISBN` (Referencia a Libros)
      - `Lector_ID` (Referencia a Lectores)

e. **Lectores:**
   - Tabla: `Lectores`
   - Clave Primaria: `Lector_ID`

f. **Tablas Intermedias:**

   - **Autores_Libros:**
      - Tabla: `Autores_Libros`
      - Atributos:
         - `Autor_ID` (Clave Foránea Referencia a Autores)
         - `ISBN` (Clave Foránea Referencia a Libros)
      - Clave Primaria: `(Autor_ID, ISBN)`
      - Relaciones:
         - Muchos a muchos entre Autores y Libros

   - **Libros_Categorias:**
      - Tabla: `Libros_Categorias`
      - Atributos:
         - `ISBN` (Clave Foránea Referencia a Libros)
         - `Categoria_ID` (Clave Foránea Referencia a Categorías)
      - Clave Primaria: `(ISBN, Categoria_ID)`
      - Relaciones:
         - Muchos a muchos entre Libros y Categorías

### Población de Tablas:

- Todas las tablas deben ser pobladas con datos de prueba para probar las relaciones entre las entidades.
- Puede usar Mockaroo para generar datos de prueba: https://www.mockaroo.com

### Entrega:
- Crear un archivo para cada tabla en formato SQL (por ejemplo, `libros.sql`, `autores.sql`, etc.).
- Crear el diagrama de entidad-relación (ERD) del sistema de biblioteca.
- Crear un archivo de inserción de datos para cada tabla en formato SQL (por ejemplo, `libros_insert.sql`, `autores_insert.sql`, etc.).
- El nombre del proyecto debe tener el siguiente formato: `nombre_apellido_practica1` (reemplaza `nombre` y `apellido` con tu nombre y apellido) y enviarlo en comprimido usando el mismo formato `nombre_apellido_practica1.zip`.