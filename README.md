<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/b4ce1d36-069e-48f3-b692-4f050f0653e4" />

# 🌄Proyecto Llanquihue Tour App Herencia Poli.

## 👤 Información del estudiante
```txt
Nombre del Alumno:   Cristián Fáundez
Carrera:             Analista Programador Computacional
Fecha de entrega:    29 de Junio del 2026
```
## Objetivo del proyecto
- gestionar de manera eficiente la información de los recorridos turísticos disponibles de la agencia Llanquihue Tours clasificados por tipo, para mostrarlos en catálogos según las preferencias de sus clientes.

 ---
 
## Estructura del proyecto.
- A continuación se muestra una imagen general de la estructura del proyecto:
```md
📁 src/
├──ui/           # Clase principal con el método main
├──model/        # Clases de dominio (Servicio turístico, Ruta gastronómica, Paseo lacustre, Excursión cultural)
├──data/         # Clase de Gestión de Servicios (Gestor Servicios)
```
## ⚙️ Funcionamiento general

### 📌 Paquete `model`
Contiene las clases base del sistema:

- **ServicioTuristico**: clase genérica que representa un servicio turístico ofrecido por la agencia.
- **RutaGastronomica**: recorrido que incluye restaurantes en cada una de sus paradas.
- **PaseoLacustre**: recorrido por distintos lagos de la región, cada uno con su embarcación característica.
- **ExcursionCultural**: recorrido por lugares históricos y emblemáticos de la región.

### 📌 Paquete `data`
Incluye la clase **GestorServicios**, responsable de crear automáticamente instancias de cualquiera de los servicios turísticos disponibles.

### 📌 Paquete `ui`
Contiene la clase **Main**, encargada de ejecutar la aplicación, integrar los componentes y mostrar la información por consola.

---
## 🛠️ Ejemplo de creación de objetos

```java
// Crear un gestor
GestorServicios gs = new GestorServicios();

// Crear un Paseo Lacustre
PaseoLacustre paseo1 = gs.crearPaseoLacustre1();

// Obtener información del objeto
System.out.println(paseo1.getNombre());
System.out.println(paseo1.toString());
```
## Instrucciones para ejecutar el proyecto
1. Clona el repositorio desde GitHub:
https://github.com/Cris-faena/LlanquihueTourAppHerenciaPoli.git
3. Abre el proyecto en "IntelliJ IDEA".
4. Ejecuta el archivo Main.Java. desde el paquete "ui".
5. Sigue las instrucciones en consola o la interfaz gráfica.
