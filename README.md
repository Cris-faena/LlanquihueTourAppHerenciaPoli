<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/b4ce1d36-069e-48f3-b692-4f050f0653e4" />

# 🌄Proyecto Llanquihue Tour App Herencia Poli.

## 👤 Información del estudiante
```txt
Nombre del Alumno:   Cristián Fáundez
Carrera:             Analista Programador Computacional
Fecha de entrega:    06 de Julio del 2026
```
## Objetivo del proyecto
- Gestionar de manera eficiente la información de los recorridos turísticos ofrecidos por la agencia "Llanquihue Tours" implementando un sistema de jerarquía de Clases con herencia simple, con la intención de continuar escalando el proyecto conforme a los nuevos requierimientos del cliente. 

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
Incluye la clase **GestorServicios**, responsable de crear automáticamente instancias de cualquiera de los servicios turísticos disponibles. Además, implementa un método llamado "crearServicioAlTurista", para almacenar colecciones polimórficas.

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
## 🛠️ Ejemplo para recorrer una lista polimórfica:

```java
// Opción 1: Crear una Lista polimórfica que almacene distintos objetos en el Main:

List<ServicioTuristico> listaPolimorfica = new ArrayList<>();

// Añada distintos objetos creados previamente a la lista:
listaPolimorfica.add(paseoLacustre1);
listaPoliformica.add(rutaGastronomica2);

// Recorra la lista por medio de un bucle FOREACH:
for(ServicioTuristico servicio :listaPolimorfica)
{
    if(servicio instanceof PaseoLacustre)
    {
        PaseoLacustre paseo = (PaseoLacustre) servicio;
        System.out.println("→ Es un Paseo Lacustre");
        paseo.mostrarInformacion();
    }
}

// Opción 2: Utilice el método "crearServicioAlTurista", de la Clase GestorServicios:
public ArrayList<ServicioTuristico> crearServicioAlTurista() 
{
    ArrayList<ServicioTuristico> servicios = new ArrayList<>();

    // Añada objetos respetando el constructor de cada clase:
    servicios.add(new RutaGastronomica("paseo a McDonald", 2, 1));
    return servicios;
}

// En el "Main" cree un nuevo objeto de la clase "Gestor Servicios":
GestorServicios gestorTours = new GestorServicios();

// Cree una nueva lista e invoque el método "crearServicioAlTurista":
List<ServicioTuristico> serviciosNuevos = gestorTours.crearServicioAlTurista();

// Recorra los elementos a través de un bucle FOREACH:
for(ServicioTuristico servicios :serviciosNuevos)
{
    if(servicios instanceof RutaGastronomica)
    {
        RutaGastronomica ruta = (RutaGastronomica) servicios;
        System.out.println("→ Es una Ruta Gastronómica");
        ruta.mostrarInformacion();
    }
}
```
## Instrucciones para ejecutar el proyecto
1. Clona el repositorio desde GitHub:
https://github.com/Cris-faena/LlanquihueTourAppHerenciaPoli.git
3. Abre el proyecto en "IntelliJ IDEA".
4. Ejecuta el archivo Main.Java. desde el paquete "ui".
5. Sigue las instrucciones en consola o la interfaz gráfica.
