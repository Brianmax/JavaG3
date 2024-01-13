### Tarea: Desarrollo de un Sistema Bancario en Java

#### Objetivo:
Desarrollar un sistema bancario básico en Java que incluya las clases Bank, Account, SavingsAccount y CurrentAccount. La aplicación deberá permitir la creación de cuentas, realizar depósitos, retiros, calcular intereses y consultar saldos.

#### Instrucciones:

1. **Interfaz Account:**
   - Crea una interfaz llamada `Account`.
   - Define los siguientes métodos:
      - `void deposit(double amount)`: Método para realizar depósitos.
      - `void withdraw(double amount)`: Método para realizar retiros.
      - `double calculateInterest()`: Método para calcular el interés.

2. **Clase Bank:**
   - Crea una clase llamada `Bank`.
   - Incluye un atributo para almacenar una lista de cuentas (`List<Account> accounts`).
   - Implementa el método:
      - `void addAccount(Account account)`: Método para agregar cuentas a la lista del banco.

3. **Clases SavingsAccount y CurrentAccount:**
   - Crea dos clases, `SavingsAccount` y `CurrentAccount`, que implementen la interfaz `Account`.
   - Implementa los métodos de la interfaz `Account` en ambas clases.
   - Agrega cualquier método adicional específico para cada tipo de cuenta (por ejemplo, `calculateInterestRate()` para `SavingsAccount`).

4. **Ejemplo de Uso:**
   - En la función principal (por ejemplo, `public static void main(String[] args)`), instancia un objeto de la clase `Bank`.
   - Crea instancias de al menos una cuenta de `SavingsAccount` y una cuenta de `CurrentAccount`.
   - Agrega las cuentas al banco usando el método `addAccount`.
   - Realiza operaciones como depósitos, retiros y muestra información relevante para asegurarte de que las clases estén funcionando correctamente.

5. **Entrega:**
   - El nombre del proyecto debe tener el siguiente formato: `nombre_apellido_tarea4` (reemplaza `nombre` y `apellido` con tu nombre y apellido) y enviarlo en comprimido usando el mismo formato `nombre_apellido_tarea4.zip`.
   - Fecha límite de entrega: `20/01/2024 23:59`.