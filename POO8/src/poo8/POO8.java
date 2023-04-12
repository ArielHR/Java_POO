/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra 
o varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase 
y la longitud de manera automática según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite 
el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
verdadero si la contiene y falso si no.

 */
package poo8;

import Entidad.Cadena;
import Servicio.CadenaService;
import java.util.Scanner;


public class POO8 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        CadenaService menu = new CadenaService ();
        
        Cadena cadenaU = menu.crearCadena();
        System.out.println(" . MENU ");
        System.out.println("");
        System.out.println("1. Mostras vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Caracter Repetido");
        System.out.println("4. Comparar longitud");
        System.out.println("5. Unir frase");
        System.out.println("6. Reemplazar caracter");
        System.out.println("7. Caracter contenido en la frase");
        System.out.println("8. Salir");
        System.out.println("");
        int menuUsuario = read.nextInt();
        String fraseNueva = null;
        do {
             switch (menuUsuario) {
            case 1:
                menu.mostrarVocales(cadenaU);
                break;
            case 2:
                menu.invertirFrase(cadenaU);
                break;
            case 3:
                System.out.println("Ingresa un caracter y ver si se repite");
                String letraU = read.nextLine();
                menu.mostrarRepetidos(cadenaU, letraU);
                break;
            case 4:
                System.out.println("Ingresa otra frase");
                fraseNueva = read.nextLine();
                menu.compararlongitudes(cadenaU, fraseNueva);
                break;
            case 5:
                System.out.println("Ingresa otra frase");
                
                menu.unirFrase(cadenaU, fraseNueva);
                break;
            case 6:
                System.out.println("Ingresa el caracter con el que se remplazara cierto caracter");
                String caracterR = read.nextLine();
                menu.reemplazar(cadenaU, caracterR );
                break;
            case 7:
                System.out.println("Ingresa el caracter a buscar");
                String caracterB = read.nextLine();
                if (menu.contiene(cadenaU, caracterB)){
                    System.out.println("El caracter ingresado si se encuentra en la frase original");
                } else {
                    System.out.println("El caracter ingresado no se encuentra en la frase original ");
                }
                break;
                
        }
        } while (menuUsuario != 8);
       
        
        
     
    }
    
}