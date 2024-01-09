# Ejercicio: Manejo de Formas Geométricas con Interfaces

## Descripción

El objetivo de este ejercicio es implementar un sistema que maneje diferentes formas geométricas (círculos, rectángulos y triángulos) utilizando interfaces en Java para calcular áreas y perímetros.

## Clases e Interfaces

### `FormaGeometrica` (Interface)
- **Descripción**: Define métodos para el cálculo de área y perímetro.
- **Métodos**:
    - `calcularArea()`: Calcula el área de la forma geométrica.
    - `calcularPerimetro()`: Calcula el perímetro de la forma geométrica.

### `Forma2D` (Clase Abstracta)
- **Descripción**: Clase abstracta que implementa `FormaGeometrica` y proporciona implementación básica para calcular el perímetro de formas 2D.
- **Métodos**:
    - `calcularPerimetro()`: Implementación por defecto del cálculo del perímetro.

### `Circulo` (Implementa `FormaGeometrica`)
- **Descripción**: Representa un círculo y proporciona métodos para calcular su área y perímetro.
- **Métodos**:
    - `calcularArea()`: Calcula el área del círculo.
    - `calcularPerimetro()`: Calcula el perímetro del círculo.

### `Rectangulo` (Implementa `FormaGeometrica`)
- **Descripción**: Representa un rectángulo y proporciona métodos para calcular su área y perímetro.
- **Métodos**:
    - `calcularArea()`: Calcula el área del rectángulo.
    - `calcularPerimetro()`: Calcula el perímetro del rectángulo.

### `Triangulo` (Implementa `FormaGeometrica`)
- **Descripción**: Representa un triángulo y proporciona métodos para calcular su área y perímetro.
- **Métodos**:
    - `calcularArea()`: Calcula el área del triángulo.
    - `calcularPerimetro()`: Calcula el perímetro del triángulo.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varios círculos, rectángulos y triángulos.
- Calcular y mostrar el área y el perímetro de cada forma geométrica.

## Instrucciones Adicionales

- Utilizar interfaces para definir el comportamiento común de las formas geométricas.
- Asegurarse de que cada clase implemente correctamente los métodos de la interfaz.
- Verificar los cálculos del área y perímetro para cada forma geométrica.

--- 

# Ejercicio: Dispositivos Electrónicos con Capacidades de Reproducción y Conexión

## Descripción

El objetivo de este ejercicio es simular el manejo de dispositivos electrónicos con capacidades de reproducción de medios y conexión a otros dispositivos, utilizando una representación de herencia múltiple mediante interfaces en Java.

## Interfaces y Clases

### `Reproducible` (Interface)
- **Descripción**: Define métodos para reproducir, pausar y detener medios.
- **Métodos**:
    - `reproducir()`: Inicia la reproducción del medio.
    - `pausar()`: Pausa la reproducción del medio.
    - `detener()`: Detiene la reproducción del medio.

### `Conectable` (Interface)
- **Descripción**: Define métodos para conectar y desconectar dispositivos.
- **Métodos**:
    - `conectar()`: Establece la conexión con otro dispositivo.
    - `desconectar()`: Desconecta el dispositivo.

### `DispositivoElectronico` (Clase)
- **Descripción**: Implementa ambas interfaces y representa un dispositivo electrónico genérico.
- **Métodos**:
    - Métodos implementados de `Reproducible` y `Conectable`.

### `Televisor` (Clase)
- **Descripción**: Extiende `DispositivoElectronico` y representa un televisor con capacidades de reproducción y conexión.

### `ReproductorMusica` (Clase)
- **Descripción**: Extiende `DispositivoElectronico` y representa un reproductor de música con capacidades de reproducción y conexión.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar objetos de tipo `Televisor` y `ReproductorMusica`.
- Probar los métodos de reproducción, pausa, detención, conexión y desconexión en estos dispositivos.

## Instrucciones Adicionales

- Usar interfaces para simular herencia múltiple y definir comportamientos comunes.
- Verificar que los métodos de reproducción, pausa, detención, conexión y desconexión funcionen correctamente en cada dispositivo.
- Asegurarse de que las clases hereden correctamente los métodos de las interfaces implementadas.

---

# Ejercicio: Gestión de Usuarios en un Sistema Educativo

## Descripción

El objetivo de este ejercicio es crear un sistema para gestionar diferentes tipos de usuarios en un entorno educativo, como profesores, estudiantes y un bot para la plataforma web.

## Interfaces y Clases

### `Usuario` (Interfaz)
- **Descripción**: Define comportamientos comunes a los usuarios.
- **Métodos**:
    - `iniciarSesion()`: Inicia la sesión del usuario.
    - `cerrarSesion()`: Cierra la sesión del usuario.
    - `realizarAcciones()`: Realiza acciones específicas según el tipo de usuario.

### `Persona` (Clase Abstracta)
- **Descripción**: Clase abstracta que implementa la interfaz `Usuario`. Tiene subclases `Profesor` y `Estudiante`.
- **Atributos**:
    - `nombre`: Nombre de la persona.
    - `edad`: Edad de la persona.
- **Métodos**:
    - `iniciarSesion()`: Implementación para iniciar sesión.
    - `cerrarSesion()`: Implementación para cerrar sesión.
    - `realizarAcciones()`: Método abstracto que cada subclase debe implementar con acciones específicas.

### `Profesor` (Subclase de `Persona`)
- **Descripción**: Representa a un profesor.
- **Atributos**:
    - `materia`: Materia que enseña el profesor.
- **Métodos**:
    - `realizarAcciones()`: Implementación específica para la acción de enseñar.

### `Estudiante` (Subclase de `Persona`)
- **Descripción**: Representa a un estudiante.
- **Atributos**:
    - `grado`: Grado en el que se encuentra el estudiante.
- **Métodos**:
    - `realizarAcciones()`: Implementación específica para la acción de estudiar.

### `Bot` (Clase)
- **Descripción**: Clase que implementa la interfaz `Usuario` y representa un bot para la plataforma web.
- **Atributos**:
    - `nombreBot`: Nombre del bot.
- **Métodos**:
    - `iniciarSesion()`: Implementación para iniciar sesión del bot.
    - `cerrarSesion()`: Implementación para cerrar sesión del bot.
    - `realizarAcciones()`: Implementación para acciones específicas del bot en la plataforma web.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Crear instancias de profesores, estudiantes y un bot.
- Probar los métodos `iniciarSesion()`, `cerrarSesion()` y `realizarAcciones()` en cada instancia creada.

## Instrucciones Adicionales

- Utilizar la clase abstracta `Persona` para implementar la interfaz `Usuario` y definir comportamientos comunes.
- Cada subclase debe implementar su propio comportamiento en el método `realizarAcciones()`.
- Verificar que los métodos de inicio y cierre de sesión funcionen correctamente para todos los tipos de usuarios.
- La clase `Bot` debe implementar la interfaz `Usuario` y definir su propio comportamiento para las acciones en la plataforma web, pero no debe heredar de `Persona`.