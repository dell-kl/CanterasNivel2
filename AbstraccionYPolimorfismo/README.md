# Taller de diseño y programación: Abstracciones, interfaces y polimorfismo

## Diagrama UML
![img.png](img.png)


## Abstracciones

Nosotros definimos lo que es una clase abstracta **NaveEspacial**. Se creo algunas
propiedades de ejemplo por ejemplo, _nombre,peso,velocidad_. Estas propiedades son
reutilizables para nuestras clases hijas que extenderan de esta clase: **Tripulada,Lanzadera,Robotica**_

```java
public abstract class VehiculoEspacial {
    protected double peso;
    protected String nombre;
    protected double velocidad;

    //Estos metodos abstractos nos pueden servir para hacer una sobrecarga y asi poder tener lo
    //que es el polimorfismo.
    public abstract String Despegue();
    public abstract void Propulsion();


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double getVelocidad() {
        return this.velocidad;
    }
}
```

## Interfaces


Nosotros definimos una interfaz **IRegisterTipoNave**. La finalidad de haber
creado esta clase es para extender en funcionalidad nuestra clase **RegistrarNave**
. Lo que terminamos aplicando lo que es el segundo principio SOLID (Abierto-Cerrado).
Se puede extender la funcionalidad de una clase pero no cambiar a la clase misma.

```java
package Data;

import Naves.VehiculoEspacial;

import java.io.IOException;


public interface IRegistrarTipoNave {

    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException;
}

```

Entonces la interfaz es **implementada** debidamente por clases el cual realizan
tareas completamente distintas, al momento de guardar los datos.

```java
public class RegistrarTipoLanzadera implements IRegistrarTipoNave { ... }
public class RegistrarTipoNoTripulada implements IRegistrarTipoNave { ... }
public class RegistrarTipoTripulada implements IRegistrarTipoNave { ... }
```

```java

package Data;

import Naves.VehiculoEspacial;

import java.io.IOException;

public class RegistrarNave {
    
    //utlizamos como inyeccion de dependencia la interfaz. Estoy es muy bueno,
    //porque esta clase no tiene que saber como se guardaran los datos.
    private IRegistrarTipoNave registrarNave;

    public RegistrarNave(IRegistrarTipoNave registrarNave){
        this.registrarNave = registrarNave;
    }

    public void GenerarGuardado(VehiculoEspacial vehiculo) throws IOException {
        this.registrarNave.RegistrarNave(vehiculo);
    }
}

```

## Polimorfismo

En nuestra clase abstracta, se tiene lo que son dos metodos abstractos lo que en cada
clase podria hacer una implementacio distinta de funcionalidad.

```java
// VehiculoEspacial.java
public abstract String Despegue();
public abstract void Propulsion();
```

```java
// Lanzadera.java
public class Lanzadera extends VehiculoEspacial{

    @Override
    public String Despegue() {
        return "La nave lanzadera" + this.getNombre() + "Ha comenzado con el despegue";
    }

    @Override
    public void Propulsion() {

    }
}

```

```java
// Robotica.java
public class Robotica extends VehiculoEspacial{

    @Override
    public String Despegue() {
        return "La nava no tripulada " + this.getNombre() + "Ha comenzado con el despegue";
    }


    @Override
    public void Propulsion() {

    }
}

```


```java
public class Tripulada extends VehiculoEspacial {

    @Override
    public String Despegue() {
        return "La nave tripulada " + this.getNombre() + "Ha comenzado con el despegue";
    }


    @Override
    public void Propulsion() {

    }
}
```

### Funcionalidad

Nuestra accion **Despegue**, podemos usarlo en cada respectiva clase que se encarga de guardar los datos de cada tipo de nave.

```java
// Para registrar Datos de Naves Lanzadera
public class RegistrarTipoLanzadera implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {
        //Registraremos los datos en un archivo de texto para ser solamente de ejemplo.
        Path ruta = Path.of("DatosNaveLanzadora.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());
        //Usando nuestro metodo Despegue
        textoFormateado.append(" --- Informacion : ");
        textoFormateado.append(vehiculo.Despegue());
        
        Files.writeString(ruta, textoFormateado);
    }
}
```

```java
// Para registrar datos de naves no tripulada
public class RegistrarTipoNoTripulada implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {
        Path ruta = Path.of("DatosNaveNoTripulada.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());
        textoFormateado.append(" --- Informacion: ");
        textoFormateado.append(vehiculo.Despegue());

        Files.writeString(ruta, textoFormateado);
    }
}

```

```java
// Para registrar datos de naves tripulada
public class RegistrarTipoTripulada implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {

        Path ruta = Path.of("DatosNaveTripulada.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());
        textoFormateado.append(" --- Informacion: ");
        textoFormateado.append(vehiculo.Despegue());


        Files.writeString(ruta, textoFormateado);
    }
}

```