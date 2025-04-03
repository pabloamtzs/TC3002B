# TC3002B

# Implementación de Estructuras de Datos en Java | Tarea 1

## Descripción
Este proyecto contiene la implementación de tres estructuras de datos fundamentales en Java:
- **Stack (Pila - LIFO)**
- **Queue (Cola - FIFO)**
- **HashTable (Diccionario - Key/Value)**

Cada estructura incluye los métodos principales para su manipulación y acceso. Además, se proporciona un archivo de prueba (`DataStructuresTest.java`) que demuestra su funcionamiento con test cases.

---

## Requisitos
- Java instalado (versión 8 o superior)
- Git (si deseas clonar el repositorio)
- Un editor como **VS Code** o **IntelliJ IDEA**

---

## Instalación y Ejecución
1. **Clonar el repositorio**
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>
   ```

2. **Compilar el código**
   ```bash
   javac DataStructuresTest.java
   ```

3. **Ejecutar las pruebas**
   ```bash
   java DataStructuresTest
   ```

---

## Test Cases Implementados
### **1️⃣ Stack (LIFO)**
- `push()`: Agrega un elemento a la pila.
- `pop()`: Remueve y devuelve el elemento en la cima.
- `peek()`: Devuelve el elemento en la cima sin removerlo.
- **Casos de prueba:**
  - Insertar varios elementos y verificar el orden LIFO.
  - Intentar hacer `pop()` en una pila vacía (debe lanzar un error).

### **2️⃣ Queue (FIFO)**
- `enqueue()`: Agrega un elemento a la cola.
- `dequeue()`: Remueve y devuelve el primer elemento en la cola.
- `peek()`: Devuelve el primer elemento sin removerlo.
- **Casos de prueba:**
  - Insertar varios elementos y verificar el orden FIFO.
  - Intentar hacer `dequeue()` en una cola vacía (debe lanzar un error).

### **3️⃣ HashTable (Key/Value)**
- `put()`: Inserta una clave-valor en la tabla.
- `get()`: Obtiene un valor dado su clave.
- `containsKey()`: Verifica si una clave existe en la tabla.
- `remove()`: Elimina una clave de la tabla.
- **Casos de prueba:**
  - Insertar varias claves y verificar su acceso.
  - Intentar obtener una clave inexistente (debe devolver `null`).
  - Eliminar una clave y verificar que ya no existe.

---

## Autor
- **Pablo Andrés Martínez Sánchez**

Si tienes alguna duda o sugerencia, siéntete libre de contribuir o abrir un issue en el repo. 🚀


