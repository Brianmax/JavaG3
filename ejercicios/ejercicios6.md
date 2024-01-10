# Ejercicio 1:
1. **Objetivo:**
   - Crear una clase genérica llamada `OperacionMatematica` que permita realizar operaciones matemáticas básicas (suma y resta) con números.

2. **Clase `OperacionMatematica`:**
   - Declarar la clase con dos parámetros genéricos que extiendan la clase `Number`.
   - Implementar un constructor que reciba dos parámetros del tipo genérico.
   - Incluir métodos para realizar la suma y la resta de los números.

3. **Método `main`:**
   - Crear instancias de `OperacionMatematica` con tipos de datos diferentes (por ejemplo, enteros e dobles).
   - Imprimir los resultados de las operaciones realizadas.


# Ejercicio 2:

1. **Objetivo:**
   - Crear una clase genérica llamada `ParObjetos` que maneje pares de objetos de cualquier tipo.

2. **Clase `ParObjetos`:**
   - Declarar la clase con dos parámetros genéricos.
   - Implementar un constructor que reciba dos parámetros del tipo genérico.
   - Incluir métodos para obtener cada objeto por separado y para imprimir el par de objetos.

3. **Método `main`:**
   - Crear instancias de `ParObjetos` con tipos de datos diferentes.
   - Imprimir los objetos individuales y el par completo.

# Ejercicio 3:

1. **Objetivo:**
   - Diseñar una clase versátil llamada `CajaNumerica` que permita almacenar datos numéricos de diversos tipos, facilitando así la gestión de información numérica.

2. **Clase `CajaNumerica`:**
   - Definir la clase como genérica, utilizando un parámetro de tipo `T` con la restricción de que debe ser un subtipo de `Number`.
   - Incluir una propiedad llamada `contenido` de tipo `T` para almacenar el dato numérico.
   - Implementar un constructor que acepte como parámetro un dato del tipo `T` y lo asigne a la propiedad `contenido`.
   - Agregar un método llamado `obtenerContenido` que retorne el dato numérico almacenado en la propiedad `contenido`.
   - Implementar un método denominado `mostrarTipoDato` que imprima de forma comprensible el tipo de dato almacenado.

3. **Método `principal`:**
   - Crear una clase ejecutable con un método `principal`.
   - Dentro del método `principal`, instanciar `CajaNumerica` con un tipo de dato específico, por ejemplo, `Float`, para representar la cantidad de dinero en una transacción.
   - Llamar al método `mostrarTipoDato` para visualizar el tipo de dato contenido y al método `obtenerContenido` para obtener y mostrar el valor numérico almacenado.

Este ejercicio simula una situación más práctica al modelar una clase genérica que puede ser utilizada para gestionar diferentes tipos de datos numéricos en el contexto de transacciones financieras u otros escenarios del mundo real.


# Ejercicio 4: 

1. **Objetivo:**
   - Crear una clase base llamada `Animal` con un método `emitirSonido()`.

2. **Clase `Jaula`:**
   - Declarar la clase como genérica con un parámetro de tipo `T` que tenga un límite superior en `Animal`.
   - Incluir una variable de instancia `ocupante` del tipo `T`.
   - Implementar un constructor que acepte un parámetro del tipo `T` y lo asigna a la variable `ocupante`.
   - Agregar un método `hacerSonidoDelOcupante` que llame al método `emitirSonido` del ocupante.

3. **Metodo `main`:**
   - En el método `main`, crear una instancia de `Jaula` con un tipo de dato que sea un subtipo de `Animal`, por ejemplo, `Animal` mismo.
   - Llamar al método `hacerSonidoDelOcupante` para que emita el sonido del ocupante.

