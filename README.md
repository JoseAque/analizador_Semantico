# Analizador Semántico  

## Reglas del Análisis  

El programa analiza el texto escrito en el cuadro de texto (`JText`) y añade los resultados del análisis a las tablas.  
Debe identificar la declaración de Palabras Reservadas, Identificadores/Variables, Literales, la línea en la que se escribieron y los operadores utilizados.  

### Palabras Reservadas  
Las palabras reservadas del analizador son:  
- `ent->` (equivalente a `int`)  
- `rea->` (equivalente a `float`)  
- `cad->` (equivalente a `String`)  

### Identificadores/Variables
La regla de los identificadores/variables es:  
- `[a-zA-Zá-úÁ-Ú][a-zA-Z0-9á-úÁ-Ú]*`
  
### Literales
Detecta valores literales y los asigna correctamente:

- `10` ➝ `ent->`
- `10.5` ➝ `rea->`
- `"Hola"` ➝ `cad->`

## Reglas de Operaciones  

### Enteros  
```
OPA = + | - | *  
Entero = Entero OPA Entero  
```

### Reales  
```
OPA = + | - | * | /  
Real = Entero OPA Entero  
Real = Entero OPA Real  
Real = Real OPA Entero  
```

### Cadenas  
```
OPA = + | -  
Cadena = Cadena OPA Cadena  
Cadena = Cadena OPA Carácter  
Cadena = Carácter OPA Cadena  
Cadena = Carácter OPA Carácter  
```

## Descripción de Errores  
- **Incompatibilidad de tipos `ent->`** (cuando la operación no es compatible con el tipo)  
- **Incompatibilidad de tipos `rea->`** (cuando la operación no es compatible con el tipo)  
- **Incompatibilidad de tipos `cad->`** (cuando la operación no es compatible con el tipo)  
- **Variable Indefinida** (cuando una variable no ha sido definida)  

### Tablas  
Se cuenta con dos tablas:  
1. **Tabla de símbolos (`JTableSimbolos`)** con las columnas:  
   - `Lexema`  
   - `Tipo`  
   - (Las palabras reservadas y operadores dejan en blanco la celda de lexema)  
2. **Tabla de errores (`JTableErrores`)** con las columnas:  
   - `Token Error` (ERSem1, ERSem2, ERSem3, etc.)  
   - `Lexema`  
   - `Línea`  
   - `Descripción`
   - 
## Botones  
Se cuenta con dos botones:  
- **`Limpiar`**: Limpia el `JText` y ambas tablas.  
- **`Analizar`**: Inicia el análisis y limpia los resultados previos.  

---

# Ejemplos de Funcionamiento  

## Entrada Ejemplo 1  
### Entrada en `JText`  
```
ent-> Num1, Num2, Num3;  
rea-> Flotante1, Flotante2;  
Flotante1 = Flotante2 + Num1;  
```
### Acción  
Pulsar botón **"Analizar"**  

### Tabla de Símbolos  
| Lexema      | Tipo    |  
|------------|--------|  
| `ent->`    |        |  
| `Num1`     | ent->  |  
| `Num2`     | ent->  |  
| `Num3`     | ent->  |  
| `rea->`    |        |  
| `Flotante1`| rea->  |  
| `Flotante2`| rea->  |  
| `,`        |        |  
| `;`        |        |  
| `=`        |        |  
| `+`        |        |  

### Tabla de Errores  
| Token Error | Lexema  | Línea | Descripción                          |  
|------------|--------|------|--------------------------------------|  
|            |        |      |                                      |

### Interfaz
![image](https://github.com/user-attachments/assets/a41f3030-e2f0-40c8-b62e-2c9037aa9e6c)

---

## Entrada Ejemplo 2  
### Entrada en `JText`  
```
ent-> Num1, Num2 ,Num3;  
cad-> Nombre;  
Num3 = Nombre * Num1;  
```
### Acción  
Pulsar botón **"Analizar"**  

### Tabla de Símbolos  
| Lexema     | Tipo    |  
|------------|--------|  
| `ent->`    |        |  
| `Num1`     | ent->  |  
| `Num2`     | ent->  |  
| `Num3`     | ent->  |  
| `cad->`    |        |  
| `Nombre`   | cad->  |  
| `10.3`     | rea->  |  
| `,`        |        |  
| `;`        |        |  
| `=`        |        |  
| `*`        |        |  

### Tabla de Errores  
| Token Error | Lexema  | Línea | Descripción                                 | 
|------------|--------|------|------------------------------------------------|  
| ERSem1     | Nombre | 3    | Incompatibilidad de tipos `ent->` con `cad->`  |  
| ERSem2     | 10.3   | 3    | Incompatibilidad de tipos `ent->` con `rea->`  |  

### Interfaz
![image](https://github.com/user-attachments/assets/2c524ab8-efc9-468b-9871-31d7403734e4)

---

## Entrada Ejemplo 3  
### Entrada en `JText`  
```
ent-> ITA5, ITA67, ITA87;  
cad-> ITA123;  
ITA87 = ITA123 * ITA5;  
ITA67 = ITA877 / 34.128 + "Hola"; 
```
### Tabla de Símbolos  
| Lexema   | Tipo   |  
|---------|-------|  
| `ent->` |       |  
| `ITA5`  | ent-> |  
| `ITA67` | ent-> |  
| `ITA87` | ent-> |  
| `cad->` |       |  
| `ITA123`| cad-> |  
| `,`     |       | 
| `;`     |       |
| `=`     |       |  
| `*`     |       | 
| `/`     |       | 
| `+`     |       | 
| `ITA877`|       |  

### Tabla de Errores  
| Token Error | Lexema  | Línea | Descripción                                |  
|------------|--------|------|-----------------------------------------------|  
| ERSem1     | ITA123 | 3    | Incompatibilidad de tipos `ent->` con `cad->` |  
| ERSem2     | ITA877 | 4    | Variable Indefinida                           |  
| ERSem3	    |34.128	 | 4    | Incompatibilidad de tipos ent-> con rea->     |  
| ERSem4	    |"Hola"  |	4    | Incompatibilidad de tipos ent-> con cad->     |  

### Interfaz
![image](https://github.com/user-attachments/assets/37dce470-ece1-4d1d-80fb-26a380c9f484)

---

## Entrada Ejemplo 4  
### Entrada en `JText`  
```
ent-> ITA5, ITA67, ITA87;  
cad-> ITA123;  
ITA87 = ITA123 * ITA5;  
ITA877 = ITA67;  
```

### Tabla de Símbolos  
| Lexema   | Tipo   |  
|---------|-------|  
| `ent->` |       | 
| `ITA5`  | ent-> |  
| `ITA67` | ent-> |  
| `ITA87` | ent-> |  
| `cad->` |       |  
| `ITA123`| cad-> |  
| `,`     |       | 
| `;`     |       | 
| `=`     |       |  
| `*`     |       | 
| `ITA877`|       |  

### Tabla de Errores  
| Token Error | Lexema  | Línea | Descripción                                   |  
|------------|--------|------|-----------------------------------------------|  
| ERSem1     | ITA123 | 3    | Incompatibilidad de tipos `ent->` con `cad->` |  
| ERSem2     | ITA877 | 4    | Variable Indefinida                          |

### Interfaz
![image](https://github.com/user-attachments/assets/1efc3912-b868-4c5a-9fe5-8021ca0eabba)
