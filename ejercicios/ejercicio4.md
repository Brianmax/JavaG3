# Ejercicio 1: Validación de Contraseña

Escribe un programa que verifique si una contraseña cumple con ciertos requisitos:

- Al menos 8 caracteres de longitud.
- Contiene al menos una letra mayúscula y una letra minúscula.
- Tiene al menos un carácter especial, como '@', '#', '$', etc.

**Ejemplo de input**
```
"Contraseni@123"
```
**Ejemplo de output**
```
true
```

# Ejercicio 2: Contar Ocurrencias de una Letra

Crea un programa que cuente cuántas veces aparece una letra específica en una cadena.

**Ejemplo de input**
```
"Java es un lenguaje de programación"
"a"
```
**Ejemplo de output**
```
5
```

# Ejercicio 3: Concatenar listas

**Instrucciones:**

1. **ArrayList:**
   - Crea dos `ArrayList`: `lista1` y `lista2`.
   - Agrega números enteros a cada lista, por ejemplo, `1`, `2`, `3` en `lista1` y `4`, `5`, `6` en `lista2`.
   - Crea un nuevo `ArrayList` llamado `listaConcatenada`.
   - Utiliza el método `addAll()` para concatenar `lista1` y `lista2` en `listaConcatenada`.
   - Imprime `listaConcatenada`.

2. **LinkedList:**
   - Crea dos `LinkedList`: `lista3` y `lista4`.
   - Agrega cadenas de texto a cada lista, por ejemplo, `"Hola"`, `" "` en `lista3` y `"Mundo"`, `"!"` en `lista4`.
   - Crea un nuevo `LinkedList` llamado `listaConcatenada2`.
   - Utiliza el método `addAll()` para concatenar `lista3` y `lista4` en `listaConcatenada2`.
   - Imprime `listaConcatenada2`.

**Ejemplo de input**
```
[1, 2, 3]
[4, 5, 6]
["Hola", " "]
["Mundo", "!"]
```

**Ejemplo de output**
```
[1, 2, 3, 4, 5, 6]
["Hola", " ", "Mundo", "!"]
```

# Ejercicio 4: Invertir lista

**Instrucciones:**

1. **ArrayList:**
   - Crea un `ArrayList` llamado `arrayList`.
   - Agrega cadenas de texto a este `ArrayList`, por ejemplo, `"Uno"`, `"Dos"`, `"Tres"`.
   - Usa `Collections.reverse()` para invertir los elementos de `arrayList`.
   - Imprime el `ArrayList` original y el invertido.

2. **LinkedList:**
   - Crea un `LinkedList` llamado `linkedList`.
   - Agrega caracteres a este `LinkedList`, por ejemplo, `'A'`, `'B'`, `'C'`.
   - Crea un nuevo `LinkedList` llamado `linkedListInvertido`.
   - Utiliza un bucle para recorrer `linkedList` y agregar cada elemento al principio de `linkedListInvertido`.
   - Imprime el `LinkedList` original y el invertido.

**Ejemplo de input**
```
["Uno", "Dos", "Tres"]
['A', 'B', 'C']
```

**Ejemplo de output**
```
["Uno", "Dos", "Tres"]
["Tres", "Dos", "Uno"]
['A', 'B', 'C']
['C', 'B', 'A']
```

# Ejercicio 5: Obtener una sublista

**Instrucciones:**

1. **ArrayList:**
   - Crea un `ArrayList` llamado `arrayList`.
   - Agrega números enteros a este `ArrayList`, por ejemplo, `1`, `2`, `3`, `4`, `5`.
   - Utiliza `subList()` para obtener una sublista de `arrayList` desde el índice `1` hasta el índice `4` (excluyendo el índice `4`).
   - Imprime la sublista obtenida.

2. **LinkedList:**
   - Crea un `LinkedList` llamado `linkedList`.
   - Agrega cadenas de texto a este `LinkedList`, por ejemplo, `"Perro"`, `"Gato"`, `"Caballo"`, `"Conejo"`, `"Ratón"`.
   - Utiliza `subList()` para obtener una sublista de `linkedList` desde el índice `2` hasta el índice `5` (excluyendo el índice `5`).
   - Imprime la sublista obtenida.

**Ejemplo de input**
```
[1, 2, 3, 4, 5]
["Perro", "Gato", "Caballo", "Conejo", "Ratón"]
```

**Ejemplo de output**
```
[2, 3, 4]
["Caballo", "Conejo", "Ratón"]
```

# Ejercicio 6: Word Count
## Instrucciones para crear un Word Counter

### 1. **Entrada de texto:**
   - Utiliza la clase `Scanner` para obtener la entrada de texto del usuario o de un archivo.

### 2. **Tokenización:**
   - Divide el texto en palabras individuales o tokens.

### 3. **Recuento de palabras:**
   - Crea un `HashMap` o `Map<String, Integer>` para almacenar las palabras y su conteo.

### 4. **Mostrar resultados:**
   - Después de procesar todo el texto, muestra el recuento de palabras.

**Ejemplo de input**
```
"El perro es un animal doméstico. El perro es un mamífero. El perro es un animal de cuatro patas."
```

**Ejemplo de output**
```
El: 3
perro: 3
es: 3
un: 3
animal: 3
doméstico: 1
mamífero: 1
de: 1
cuatro: 1
patas: 1
```

# Ejercicio 7: Imprimir la tabla de multiplicación del 1 al 10 usando bucles anidados

Para crear la tabla de multiplicación del 1 al 10:
- Utilizar dos bucles 'for' anidados.
- El bucle externo debe iterar a través de los multiplicandos del 1 al 10.
- El bucle interno debe iterar a través de los multiplicadores del 1 al 10.
- Calcular el resultado de la multiplicación de cada par de números.
- Imprimir cada operación con su resultado, mostrando la multiplicación y el resultado.
- Separar cada tabla de multiplicación con líneas para mejorar la legibilidad.

**Ejemplo de output**
```
Tabla de multiplicación del 1:
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
...
1 x 10 = 10

Tabla de multiplicación del 2:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
...
2 x 10 = 20

...
```

# Ejercicio 8: Imprimir un patrón de asteriscos usando bucles anidados

Para crear un patrón de asteriscos en forma de triángulo:
- Definir el número de filas deseadas en el patrón.
- Utilizar dos bucles 'for' anidados.
- El bucle externo controla el número de filas del patrón.
- El bucle interno imprime los asteriscos en cada fila, aumentando uno por fila.
- Imprimir un asterisco (*) seguido de un espacio en cada iteración del bucle interno.
- Al final de cada fila, imprimir un salto de línea para pasar a la siguiente fila del patrón.

**Ejemplo de input**
```
5
```

**Ejemplo de output**
```
*
* *
* * *
* * * *
* * * * *
```

# Ejercicio 9: If Anidado

1. **Objetivo:** Determinar el nivel de descuento según el monto de compra.
2. **Instrucciones:**
    - Solicitar al usuario que ingrese el monto de compra.
    - Usar condicionales (`if`, `else`) para establecer el descuento:
        - Si el monto es mayor a $1000, aplicar un descuento del 10%.
        - Si el monto es mayor a $2000, el descuento es del 20%.
        - En otros casos, no aplicar ningún descuento.
    - Calcular el monto de descuento y mostrarlo.
    - Calcular el monto final a pagar y mostrarlo.

**Ejemplo de input**
```
1500
```

**Ejemplo de output**
```
Monto de compra: $1500
Descuento: $150
Monto final: $1350
```

# Ejercicio 10: Else If

1. **Objetivo:** Clasificar la temperatura actual según diferentes rangos.
2. **Instrucciones:**
    - Solicitar al usuario que ingrese la temperatura actual en grados Celsius.
    - Utilizar múltiples condiciones (`if`, `elif`, `else`) para determinar el estado del clima según el valor ingresado:
        - Si la temperatura es menor a 0, mostrar "¡Hace mucho frío!".
        - Si está entre 0 y 10 grados, mostrar "Hace frío.".
        - Si está entre 10 y 20 grados, mostrar "El clima es fresco.".
        - Si está entre 20 y 30 grados, mostrar "El clima es templado.".
        - Para cualquier valor fuera de estos rangos, mostrar "Hace calor.".
    - Mostrar el mensaje correspondiente al estado del clima según la temperatura ingresada.

**Ejemplo de input**
```
15
```

**Ejemplo de output**
```
El clima es templado.
```