# Analizador Semántico  

## Reglas del Análisis  

El programa analiza el texto escrito en el cuadro de texto (`JText`) y añade los resultados del análisis a las tablas.  

### Palabras Reservadas  
Las palabras reservadas del analizador son:  
- `ent->` (equivalente a `int`)  
- `rea->` (equivalente a `float`)  
- `cad->` (equivalente a `String`)  

### Identificadores/Variables  
La regla de los identificadores/variables es:  
- `[a-zA-Zá-úÁ-Ú][a-zA-Z0-9á-úÁ-Ú]*`  

El programa debe identificar la declaración de identificadores, la línea en la que se escribieron y los operadores utilizados.  

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

## Botones  
- **`JBLimpiar`**: Limpia el `JText` y ambas tablas.  
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
![image](https://github.com/user-attachments/assets/d94a9414-1342-4104-ad31-65c16e0cef32)

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
| `,`        |        |  
| `;`        |        |  
| `=`        |        |  
| `*`        |        |  

### Tabla de Errores  
| Token Error | Lexema  | Línea | Descripción                          |  
|------------|--------|------|--------------------------------------|  
| ERSem1     | Nombre | 3    | Incompatibilidad de tipos `ent->` con `cad->`  |  

### Interfaz
![image](https://github.com/user-attachments/assets/3342215d-720f-4432-ab51-cf0747261ebc)

---

## Entrada Ejemplo 3  
### Entrada en `JText`  
```
ent-> ITA5, ITA67, ITA87;  
cad-> ITA123;  
ITA87 = ITA123 * ITA5;  
ITA67 = ITA877;  
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
![image](https://github.com/user-attachments/assets/3239a93f-6c4b-45d7-b3e2-c9e641cbba7c)

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
![image](https://github.com/user-attachments/assets/a5c982b2-c97e-41e3-aa99-82f4865e353d)
