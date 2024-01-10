# Ejercicio 1: Clase Genérica
1. **Objetivo:**
   - Crear una clase genérica llamada `OperacionMatematica` que permita realizar operaciones matemáticas básicas (suma y resta) con números.

2. **Clase `OperacionMatematica`:**
   - Declarar la clase con dos parámetros genéricos que extiendan la clase `Number`.
   - Implementar un constructor que reciba dos parámetros del tipo genérico.
   - Incluir métodos para realizar la suma y la resta de los números.

3. **Método `main`:**
   - Crear instancias de `OperacionMatematica` con tipos de datos diferentes (por ejemplo, enteros e dobles).
   - Imprimir los resultados de las operaciones realizadas.


# Ejercicio 2: Par de Objetos

1. **Objetivo:**
   - Crear una clase genérica llamada `ParObjetos` que maneje pares de objetos de cualquier tipo.

2. **Clase `ParObjetos`:**
   - Declarar la clase con dos parámetros genéricos.
   - Implementar un constructor que reciba dos parámetros del tipo genérico.
   - Incluir métodos para obtener cada objeto por separado y para imprimir el par de objetos.

3. **Método `main`:**
   - Crear instancias de `ParObjetos` con tipos de datos diferentes.
   - Imprimir los objetos individuales y el par completo.

# Ejercicio 3: Clase genérica con límite superior en tipo de dato

1. **Objetivo:**
   - Crear una clase genérica llamada `ContenedorGenerico` que pueda almacenar un tipo de dato que extienda la clase `Number`.

2. **Clase `ContenedorGenerico`:**
   - Declarar la clase como genérica con un parámetro de tipo `T` que tenga un límite superior en `Number`.
   - Incluir una variable de instancia `contenido` del tipo `T`.
   - Implementar un constructor que acepte un parámetro del tipo `T` y lo asigna a la variable `contenido`.
   - Agregar un método `getContenido` que devuelva el contenido almacenado en la variable `contenido`.
   - Implementar un método llamado `imprimirTipo` que imprima el tipo de contenido utilizando `getClass().getName()`.

3. **Clase `Ejemplo1`:**
   - Crear una clase con un método `main`.
   - En el método `main`, crear una instancia de `ContenedorGenerico` con un tipo de dato que sea un subtipo de `Number`, por ejemplo, `Integer`.
   - Llamar al método `imprimirTipo` para imprimir el tipo de contenido y al método `getContenido` para imprimir el contenido almacenado.

# Ejercicio 4: Clase genérica con límite superior en clases concretas

1. **Objetivo:**
   - Crear una clase base llamada `Animal` con un método `emitirSonido()`.

2. **Clase `Jaula`:**
   - Declarar la clase como genérica con un parámetro de tipo `T` que tenga un límite superior en `Animal`.
   - Incluir una variable de instancia `ocupante` del tipo `T`.
   - Implementar un constructor que acepte un parámetro del tipo `T` y lo asigna a la variable `ocupante`.
   - Agregar un método `hacerSonidoDelOcupante` que llame al método `emitirSonido` del ocupante.

3. **Clase `Main`:**
   - En el método `main`, crear una instancia de `Jaula` con un tipo de dato que sea un subtipo de `Animal`, por ejemplo, `Animal` mismo.
   - Llamar al método `hacerSonidoDelOcupante` para que emita el sonido del ocupante.

