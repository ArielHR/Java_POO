
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {

 /*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
 se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido 
 sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 */
    
   public Persona crearPersona (){
       
       Persona p1 = new Persona ();
       Scanner read = new Scanner(System.in);
       System.out.println("");
       System.out.println("CREAR PERSONA");
       System.out.println("");
       System.out.println("Ingresa el nombre de la persona");
       p1.setNombre(read.nextLine());
       int i;
       do {
          
           System.out.println("Ingresa el sexo (HOMBRE (H),MUJER (M),OTRO (O)");
           p1.setSexo(read.nextLine().toUpperCase());
           switch (p1.getSexo()) {
               case "H":
                   i = 0;
                   break;
               case "M":
                   i = 0;
               case "O":
                   i = 0;
                   break;
               default:
                   i = 1;
           }
       } while (i == 1);
       
       System.out.println("Ingresa la edad");
       p1.setEdad(read.nextInt());
       System.out.println("Ingresa su altura");
       p1.setAltura(read.nextFloat());
       System.out.println("Ingresa su peso");
       p1.setPeso(read.nextFloat());
       System.out.println("");
       return p1;
   } 
   
 // Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta 
 //fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la
 //función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
 //persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor
 //mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
   
   
   public int calcularIMC (Persona p1){
       int imc = 0;
       
       float IMC = (float) (p1.getPeso() / Math.pow(p1.getAltura(), 2));
      if (IMC < 20) {
          imc = -1;
          System.out.println(" PESO BAJO ");
      } else if (IMC >= 20 && IMC <= 25) {
          imc = 0;
          System.out.println(" PESO IDEAL ");
      } else if (IMC > 25) {
          imc = 1;
          System.out.println(" SOBREPESO ");
      }

     
       return imc;
   }
   
   // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad (Persona p1) {
       
        boolean ME;
        ME = p1.getEdad() > 18;
        if (ME){
            System.out.println(" MAYOR DE EDAD ");
        } else {
            System.out.println(" MENOR DE EDAD ");
        }
      
        
       return ME;
    }
     
    
    
}

