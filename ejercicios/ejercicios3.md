# Ejercicios
# Ejercicio 1
Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa. Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.
### Ejemplo de entrada
```
40
```
### Ejemplo de salida
```
$1600.0
```
### Ejemplo de entrada
```
48
```
### Ejemplo de salida
```
$2240.0
```
### Ejemplo de entrada
```
53
```
### Ejemplo de salida
```
$2840.0
```
# Ejercicio 2
Se le pide implementar un sistema de ingreso digital para una fiesta de quince años. Para ello, se han determinado una serie de reglas. Todas las personas con edades mayores o iguales a 15 años solo pueden entrar si traen regalos. Los jóvenes menores de 15 años entran gratis a la fiesta. Implemente una aplicación que permita ingresar la edad de la persona y determine si puede pasar o no.

### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
23
Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:
1
```
En este caso, dado que la persona tiene una edad superior a los 15 años, es necesario llevar a cabo una validación adicional.
### Ejemplo de salida
```bash
El invitado sí puede ingresar a la fiesta.
```
### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
13
```
### Ejemplo de salida
```bash
El invitado si puede ingresar a la fiesta
```
# Ejercicio 3
Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable. Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo. Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.
### Ejemplo de entrada
```
30
```
### Ejemplo de salida
```
$10.00
```
Pago fijo.
### Ejemplo de entrada
```
120
```
### Ejemplo de salida
```
$45.00  
```
Consumo entre 51 y 200
$(10 + 0.5 \times (120 - 50))$
### Ejemplo de entrada
```
250
```
### Ejemplo de salida
```
$185.00
```
$(10 + 0.5 \times (250 - 50) + 1.5 \times (250 - 200))$
# Ejercicio 4
Escriba un programa que reciba un número `n` e imprima los números impares menores a `n`.

### Ejemplo de entrada
```bash
6
```
### Ejemplo de salida
```bash
1
3
5
```
# Ejercicio 5
Escriba un programa que reciba un número `n`, que será el tamaño de un array que se creará y llenará con números aleatorios. Puede usar la clase Random para generar los números aleatorios. Luego, imprima los elementos del array.

### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida
```bash
El elemento 0 es: 3
El elemento 1 es: 8
El elemento 2 es: 15
El elemento 3 es: 90
El elemento 4 es: 189
```
Puede seguir este tutorial: [Generar números aleatorios en Java](https://www.geeksforgeeks.org/generating-random-numbers-in-java/)

# Ejercicio 6
Dado un valor `n`, genere la siguiente secuencia:
### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida

```
*
* *
* * *
* * * *
* * * * *
```
# Ejercicio 7
La operación factorial se define de la siguiente manera: $5!=5\times4\times3\times2\times1$. Cree una clase Factorial que tenga un método llamado `resolverFactorial` que reciba un valor `n`, donde `n` es el valor del factorial a calcular.

### Ejemplo de entrada
```
5
```
Donde 5 es el valor a calcular: $5!=5\times4\times3\times2\times1=120$

### Ejemplo de salida
```
120
```

# Ejercicio 8
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Luego, encuentre cuál es el valor más grande.
### Ejemplo de entrada

```
5
```
Un posible array podria ser {2,31,34,1,0}
### Ejemplo de salida
```
34
```
Imprima el array previamente para poder demostrar el resultado.
# Ejercicio 9
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Posteriormente, invierta el array (sin usar clases como ArrayList o similares).

### Ejemplo de entrada
```
5
```
Un posible array podria ser $[3,1,4,0,33]$.
### Ejemplo de salida

```
33 0 4 1 3
```
La salida debe ser tal como se muestra en el ejemplo, no de esta forma:
```
33
0
4
1
3
```
# Ejercicio 10
Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número y la cantidad de intentos realizados.

### Ejemplo del juego
Número a adivinar: 30.
```
20
"Número demasiado bajo, intenta nuevamente"
39
"Número demasiado alto, intenta nuevamente.
30
"¡Felicidades! ¡Haz adivinado el número!
```

# Ejercicio 11
Crea una jerarquía de clases de figuras geométricas utilizando la herencia y demuestra la encapsulación y el polimorfismo:

1. Figura: Crea una clase Figura con campos privados para el color y si está llena (un booleano que indica si la figura está rellenada con color). Proporciona métodos para obtener y establecer estos campos.
2. Círculo: Crea una clase Círculo que herede de Figura. Debe tener un campo privado para el radio. Implementa constructores y métodos apropiados para obtener y establecer el radio, y calcular el área y el perímetro del círculo.
3. Rectángulo: Crea una clase Rectángulo que herede de Figura. Debe tener campos privados para el ancho y la altura. Implementa constructores y métodos apropiados para obtener y establecer el ancho y la altura, y calcular el área y el perímetro del rectángulo.
4. Triángulo: Crea una clase Triángulo que herede de Figura. Debe tener campos privados para las longitudes de los lados (a, b y c). Implementa constructores y métodos apropiados para obtener y establecer las longitudes de los lados, y calcular el área y el perímetro del triángulo utilizando la fórmula de Herón.

Crea una clase Principal para demostrar el uso de tu jerarquía de figuras:

1. En el método main, crea instancias de círculos, rectángulos y triángulos.
2. Establece propiedades para estas figuras (por ejemplo, color, si está llena, radio, ancho, altura, longitudes de los lados).
3. Calcula y muestra el área y el perímetro de cada figura utilizando el polimorfismo (es decir, llamando a los métodos de área y perímetro en las instancias de la clase base Figura).

[Generar getters y setters en Java](https://www.youtube.com/watch?v=gXvnHialu0s&ab_channel=makigas%3Aaprendeaprogramar)
# Ejercicio 12

## Descripción

Este ejercicio tiene como objetivo desarrollar un sistema de biblioteca simple que maneje libros, DVDs y usuarios utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `LibraryItem` (ElementoBiblioteca)
- **Descripción**: Clase base para ítems en la biblioteca.
- **Atributos privados**:
    - `title`: Título del ítem.
    - `itemID`: ID único del ítem.
    - `isLoaned`: Indica si el ítem está prestado.
- **Métodos**:
    - Getters y setters para los atributos.
    - `showDetails()`: Método para mostrar los detalles del ítem.

### `Book` (hereda de `LibraryItem`)
- **Descripción**: Representa un libro en la biblioteca.
- **Atributos privados adicionales**:
    - `author`: Autor del libro.
- **Métodos**:
    - Constructores, getters y setters para el nuevo atributo.
    - Sobrescritura del método `showDetails()` para incluir el autor del libro.

### `DVD` (hereda de `LibraryItem`)
- **Descripción**: Representa un DVD en la biblioteca.
- **Atributos privados adicionales**:
    - `director`: Director del DVD.
    - `duration`: Duración del DVD.
- **Métodos**:
    - Constructores, getters y setters para los nuevos atributos.
    - Sobrescritura del método `showDetails()` para incluir el director y la duración.

### `LibraryUser` (UsuarioBiblioteca)
- **Descripción**: Representa a un usuario de la biblioteca.
- **Atributos privados**:
    - `userName`: Nombre del usuario.
    - `userID`: ID del usuario.
    - `loanedItems`: Ítems que el usuario tiene prestados.
- **Métodos**:
    - Getters y setters para los atributos.
    - `showUserDetails()`: Método para mostrar los detalles del usuario.

### `Library` (Biblioteca)
- **Descripción**: Gestiona la colección de ítems de la biblioteca.
- **Atributos**:
    - `libraryItems`: Colección de `LibraryItems`.
- **Métodos**:
    - `addItem()`: Añadir nuevos ítems a la biblioteca.
    - `showAllItems()`: Mostrar todos los ítems de la biblioteca.
    - `loanItem()`: Prestar un ítem a un usuario.
    - `returnItem()`: Devolver un ítem a la biblioteca.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varios libros y DVDs.
- Crear usuarios de la biblioteca.
- Añadir libros y DVDs a la colección de ítems de la biblioteca.
- Prestar y devolver ítems a y de los usuarios.
- Mostrar los detalles de los ítems y los usuarios.

## Instrucciones Adicionales

- Utilice polimorfismo para permitir el préstamo de diferentes tipos de `LibraryItems`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje Java.

---


## Ejericicio 13

## Descripción

Desarrollar un sistema de gestión para la renta de películas, utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `RentalItem`
- **Descripción**: Clase base para ítems en el sistema de renta.
- **Atributos privados**:
  - `itemName`: Nombre del ítem.
  - `itemID`: ID único del ítem.
  - `available`: Atributo que indica si el ítem está disponible para renta.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showDetails()`: Método para mostrar los detalles del ítem.

### `Movie` (hereda de `RentalItem`)
- **Descripción**: Representa una película disponible para renta.
- **Atributos privados adicionales**:
  - `director`: Director de la película.
  - `duration`: Duración de la película.
  - `ageRating`: Clasificación por edades.
  - `genre`: Género de la película.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir detalles adicionales de la película.

### `Customer`
- **Descripción**: Representa a un cliente del sistema de renta.
- **Atributos privados**:
  - `customerName`: Nombre del cliente.
  - `customerID`: ID del cliente.
  - `rentedMovies`: Lista de películas rentadas por el cliente.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showCustomerDetails()`: Método para mostrar los detalles del cliente.

### `MovieRentalSystem`
- **Descripción**: Representa el sistema de renta de películas y maneja todos los ítems de renta.
- **Atributos**:
  - `rentalItems`: Colección de `RentalItems`.
  - `customers`: Lista de clientes registrados.
- **Métodos**:
  - `addItem()`: Añadir nuevos ítems al sistema.
  - `registerCustomer()`: Registrar un nuevo cliente.
  - `rentMovieToCustomer()`: Rentar una película a un cliente.
  - `returnMovie()`: Procesar la devolución de una película rentada.
  - `showAllItems()`: Mostrar todos los ítems disponibles para renta.
  - `showAllCustomers()`: Mostrar todos los clientes registrados.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varias películas.
- Añadir estas películas a la colección de ítems del sistema de renta.
- Registrar clientes en el sistema.
- Desarrollar una interfaz de consola que permita realizar las siguientes operaciones:
  - Rentar películas a los clientes, actualizando su estado `available`.
  - Procesar devoluciones de películas.
  - Mostrar los detalles de películas y clientes.

## Instrucciones Adicionales

- Utilice polimorfismo para manejar los distintos tipos de `RentalItems`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje de programación Java.


# Ejercicio 14

## Descripción

El objetivo de este ejercicio es desarrollar un sistema de control de inventarios para una tienda, utilizando interfaces para definir comportamientos comunes en diferentes categorías de productos.

## Interfaces

### `InventoryManageable`
- **Descripción**: Interfaz para gestionar las operaciones básicas del inventario.
- **Métodos**:
    - `addItem()`: Añadir un nuevo ítem al inventario.
    - `deleteItem()`: Eliminar un ítem del inventario.
    - `listItems()`: Listar todos los ítems del inventario.
    - `findItemById()`: Buscar un ítem por su ID.

### `Priceable`
- **Descripción**: Interfaz para manejar los precios de los ítems.
- **Métodos**:
    - `getPrice()`: Obtener el precio de un ítem.
    - `setPrice()`: Establecer el precio de un ítem.

## Clases

### `Product` (implementa `Priceable`)
- **Descripción**: Clase abstracta que representa un producto genérico de la tienda.
- **Atributos protegidos**:
    - `productId`: ID único del producto.
    - `price`: Precio del producto.
- **Métodos**:
    - Implementación de los métodos de la interfaz `Priceable`.
    - Otros métodos y atributos comunes a todos los productos.

### `Electronics` (hereda de `Product`, implementa `InventoryManageable`)
- **Descripción**: Representa un producto electrónico.
- **Atributos adicionales**:
    - `brand`: Marca del producto electrónico.
    - `model`: Modelo del producto electrónico.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Constructores, getters y setters para los nuevos atributos.

### `Clothing` (hereda de `Product`, implementa `InventoryManageable`)
- **Descripción**: Representa un producto de ropa.
- **Atributos adicionales**:
    - `size`: Tamaño de la prenda de ropa.
    - `material`: Material de la prenda de ropa.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Constructores, getters y setters para los nuevos atributos.

### `Inventory` (implementa `InventoryManageable`)
- **Descripción**: Gestiona la colección de productos en la tienda.
- **Atributos**:
    - `products`: Lista de productos que implementan `InventoryManageable`.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Métodos para reportes y análisis del inventario.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Crear una instancia de `Inventory`.
- Instanciar varios productos de `Electronics` y `Clothing`.
- Añadir estos productos al inventario.
- Listar todos los productos.
- Buscar un producto por su ID y cambiar su precio.
- Eliminar un producto del inventario.

## Instrucciones Adicionales

- Utilice las interfaces para definir comportamientos comunes y para lograr un bajo acoplamiento.
- Implemente las clases concretas proporcionando funcionalidades específicas.
- Asegúrese de que todas las clases e interfaces tengan una estructura coherente y métodos bien definidos.
- Escriba el código en Java.

# Ejercicio 15

## Descripción

El objetivo de este ejercicio es desarrollar un sistema de matrículas para una institución educativa, utilizando herencia múltiple a través de interfaces. Este sistema deberá gestionar estudiantes, profesores y cursos, permitiendo registrar, matricular y asignar tareas.

## Interfaces

### `Usuario`
- **Descripción**: Interfaz base para todos los usuarios del sistema.
- **Métodos**:
  - `iniciarSesion()`: Permite al usuario iniciar sesión en el sistema.
  - `cerrarSesion()`: Permite al usuario cerrar sesión.

### `Estudiante`
- **Descripción**: Interfaz para los estudiantes.
- **Métodos**:
  - `matricularCurso()`: Permite al estudiante matricularse en un curso.
  - `entregarTarea()`: Permite al estudiante entregar tareas.

### `Profesor`
- **Descripción**: Interfaz para los profesores.
- **Métodos**:
  - `calificarExamen()`: Permite al profesor calificar exámenes.
  - `asignarTarea()`: Permite al profesor asignar tareas.

## Clases

### `Persona` (implementa `Usuario`)
- **Descripción**: Clase base para representar a todos los usuarios.
- **Atributos**:
  - `nombre`: Nombre de la persona.
- **Métodos**:
  - Implementación de los métodos de la interfaz `Usuario`.

### `SoloEstudiante` (extiende `Persona`, implementa `Estudiante`)
- **Descripción**: Representa exclusivamente a un estudiante.
- **Atributos**:
    - `cursos`: Lista de cursos en los que está matriculado el estudiante.
- **Métodos**:
  - Implementación de los métodos de la interfaz `Estudiante`.

### `EstudianteProfesor` (extiende `Persona`, implementa `Estudiante`, `Profesor`)
- **Descripción**: Representa a una persona que es tanto estudiante como profesor.
- **Atributos**:
  - `cursos`: Lista de cursos en los que está matriculado el estudiante.
  - `cursosImpartidos`: Lista de cursos que imparte el profesor.
- **Métodos**:
  - Implementación de los métodos de las interfaces `Estudiante` y `Profesor`.

### `Curso`
- **Descripción**: Representa un curso en la institución.
- **Atributos**:
  - `nombre`: Nombre del curso.
  - `codigo`: Código del curso.
  - `estudiantes`: Lista de estudiantes en el curso.
- **Métodos**:
  - Métodos para gestionar el curso y sus estudiantes.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Crear instancias de `Persona`, `SoloEstudiante`, `EstudianteProfesor` y `Curso`.
- Utilizar `SoloEstudiante` y `EstudianteProfesor` para matricular a los estudiantes en los cursos y asignar tareas.
- Utilizar `EstudianteProfesor` para realizar acciones de profesor, como calificar exámenes.
- Gestionar las listas de estudiantes en los cursos.
- Demostrar el inicio y cierre de sesión en el sistema por parte de los usuarios.

Este ejercicio proporcionará una comprensión práctica de cómo se puede utilizar la herencia múltiple en Java mediante interfaces para crear un sistema de gestión flexible que abarque múltiples roles y funcionalidades.

# Ejercicio 16

## Descripción

Desarrolla un sistema para gestionar un registro de vehículos, utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `Vehicle` (Vehículo)
- **Descripción**: Clase base para vehículos.
- **Atributos privados**:
  - `make`: Marca del vehículo.
  - `model`: Modelo del vehículo.
  - `year`: Año de fabricación.
  - `registrationNumber`: Número de matrícula.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showDetails()`: Método para mostrar los detalles del vehículo.

### `Car` (hereda de `Vehicle`)
- **Descripción**: Representa un automóvil.
- **Atributos privados adicionales**:
  - `seatingCapacity`: Capacidad de asientos.
  - `fuelType`: Tipo de combustible.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir capacidad de asientos y tipo de combustible.

### `Motorcycle` (hereda de `Vehicle`)
- **Descripción**: Representa una motocicleta.
- **Atributos privados adicionales**:
  - `engineSize`: Tamaño del motor.
  - `hasSidecar`: Indica si tiene sidecar.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir tamaño del motor y sidecar.

### `Truck` (hereda de `Vehicle`)
- **Descripción**: Representa un camión.
- **Atributos privados adicionales**:
  - `loadCapacity`: Capacidad de carga.
  - `numberOfAxles`: Número de ejes.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir capacidad de carga y número de ejes.

### `VehicleRegistry`
- **Descripción**: Gestiona el registro de vehículos.
- **Atributos**:
  - `registeredVehicles`: Colección de `Vehicles`.
- **Métodos**:
  - `registerVehicle()`: Registrar un nuevo vehículo.
  - `showAllVehicles()`: Mostrar todos los vehículos registrados.
  - `findVehicle()`: Buscar un vehículo por su número de matrícula.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varios coches, motocicletas y camiones.
- Registrar estos vehículos en el `VehicleRegistry`.
- Mostrar los detalles de cada vehículo.
- Buscar vehículos específicos en el registro.

## Instrucciones Adicionales

- Utilice polimorfismo para gestionar diferentes tipos de `Vehicle`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje Java.

# Ejercicio 17

Este ejercicio implica la creación de un sistema de gestión de personal en una empresa utilizando Java. Se utilizará herencia y polimorfismo para manejar diferentes tipos de empleados y una clase para administrar una lista de estos empleados.

## Clases de Empleados

### Clase Base: Empleado
- Atributos: nombre, ID, departamento.
- Métodos:
  - `mostrar_info()`: Retorna información del empleado.
  - `calcular_salario()`: Calcula el salario (será sobrescrito en subclases).

### Clase Derivada: Desarrollador
- Atributos adicionales: lenguajes de programación.
- Método sobrescrito: `calcular_salario()`.

### Clase Derivada: Gerente
- Atributos adicionales: lista de empleados a cargo.
- Método sobrescrito: `calcular_salario()`.

### Clase Derivada: Diseñador
- Atributos adicionales: tipo de diseño.
- Método sobrescrito: `calcular_salario()`.

## Clase Gestora: Empresa
- Atributos:
  - Lista de empleados.
- Métodos:
  - `añadir_empleado(empleado)`: Añade un empleado a la lista.
  - `eliminar_empleado(id)`: Elimina un empleado por su ID.
  - `mostrar_empleados()`: Muestra información de todos los empleados.
