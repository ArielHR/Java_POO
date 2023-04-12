/*

5. Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una variable 
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar 
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero No ha acertado.
Intente adivinarlo introduciendo otro mes: agosto

¡Ha acertado!
 */
package pooextra5;

import Entidad.Adivinanza;
import java.util.Scanner;

public class POOExtra5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Adivinanza adivinaU = new Adivinanza();
        System.out.println("ADIVINA EL MES ");
        System.out.println("----------------");
        String mesAleatorio = adivinaU.adivinanza();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el mes   INTENTO: " + (i+1));
            String mesU = leer.next();
            if (mesU.equals(mesAleatorio) ) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No acertado");
            }
        }
    }
    
}