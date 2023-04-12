// Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). Este método rellena el
//objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer la 
//edad de la persona también se debe conocer la fecha actual.
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el 
//receptor tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.
// Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
 
    Date Pnacimiento = new Date();
    Date fechaActual = new Date();
    public Persona creacionPersona () {
        Scanner leer = new Scanner(System.in);
        Persona p1  = new Persona ();
        System.out.println("Ingresa tu nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("");
        System.out.println("Ingresa tu fecha de nacimiento (AAAA / MM / DD ");
        Pnacimiento.setYear(leer.nextInt() - 1900);
        Pnacimiento.setMonth(leer.nextInt() -  1);
        Pnacimiento.setDate(leer.nextInt());
        p1.setNacimiento(Pnacimiento);
        return p1;
    }
    
    public int calcularEdad (Persona p1) {
        int edad;
        edad = fechaActual.getYear() - (Pnacimiento.getYear());
        return edad;
    }
    
    public boolean menorQue(int edadU, int edadExtra) {
        boolean diferenciaEdad = edadU > edadExtra;
        return diferenciaEdad;
    }
    
    public void MostrarPersona (Persona p1) {
        System.out.println("Nombre - " + p1.getNombre());
        int edad;
        edad = fechaActual.getYear() - (Pnacimiento.getYear());
        System.out.println("Fecha de nacimiento - " + p1.getNacimiento());
        System.out.println("Edad - " + edad);
        
                
    }
    
}
