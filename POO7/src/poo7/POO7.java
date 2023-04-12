/*
Realizar una clase llamada Persona que tenga los siguientes atributos: 
nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro atributo, 
puede hacerlo. Los métodos que se implementarán son:

 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada 
objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, para 
después en el main, calcular un porcentaje de esas 4 personas
 */
package poo7;

import Entidad.Persona;
import Servicio.PersonaService;


public class POO7 {

  
    public static void main(String[] args) {
        
        PersonaService Ps = new PersonaService();
        
        Persona p1 = new Persona("Dara", 21, "M" , (float) 1.61, 54);
        System.out.println("DARA");
        Ps.calcularIMC(p1);
        Ps.esMayorDeEdad(p1);
        
        Persona p2 = new Persona("Ariel", 20, "H" , (float) 1.70, 69);
        System.out.println("");
        System.out.println("Ariel");
        Ps.calcularIMC(p2);
        Ps.esMayorDeEdad(p2);
        
        Persona p3 = new Persona("Sughey", 20, "M" , (float) 1.59, 54);
        System.out.println("");
        System.out.println("SUGHEY");
        Ps.calcularIMC(p3);
        Ps.esMayorDeEdad(p3);
        
        Persona p4 = new Persona("Emilio", 65, "H" , (float) 1.75, 60);
        System.out.println("");
        System.out.println("EMILIO");
        Ps.calcularIMC(p4);
        Ps.esMayorDeEdad(p4);
  
    }

}
