
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {
    Scanner read = new Scanner(System.in);
    
   public Cadena crearCadena (){
       
       Cadena cadena1 = new Cadena ();
       System.out.println("Ingresar una frase");
       cadena1.setCadenaU(read.next());
       cadena1.setLongitudCadena(cadena1.getCadenaU().length());
       
       return cadena1;
    }
   
   public void mostrarVocales (Cadena cadena1){

       int cantV = 0;
       
       for (int i = 0; i < cadena1.getLongitudCadena(); i++) {
           
           String letra = cadena1.getCadenaU().substring(i, i+1);

           if ("A".equalsIgnoreCase(letra) || "E".equalsIgnoreCase(letra) || "I".equalsIgnoreCase(letra) 
            || "O".equalsIgnoreCase(letra) || "U".equalsIgnoreCase(letra) ) {
               
              cantV++;
               System.out.println(letra + " ");     
            }
           
        }
        
       System.out.println("Hay " + cantV + " de vocales en la farse");
       
    }
   
   public void invertirFrase (Cadena cadena1) {

       for (int j = cadena1.getLongitudCadena(); j > 0; j--) {
           System.out.println(cadena1.getCadenaU().substring(j, j));
       }
       
   }
   
   public void mostrarRepetidos (Cadena cadena1,String letra) {
      
       int counter = 0;
       for (int x = 0; x < cadena1.getLongitudCadena(); x++) {
           if (letra.equalsIgnoreCase(cadena1.getCadenaU().substring(x, x))) {
               counter++;
           }
       }
       
       System.out.println("La letra " + letra + " se repite " +  counter + " veces");
       
   }
   
   public void compararlongitudes (Cadena cadena1 , String frase){
       int longitudU = frase.length();
       System.out.println("Lontitud de cada frase");
       System.out.println("Frase original - " + cadena1.getLongitudCadena());
       System.out.println("Frase nueva - " + longitudU);
       System.out.println("");
       if (cadena1.getLongitudCadena() > longitudU){
           System.out.println("La frase orignal es más larga");
           
       } else if (cadena1.getLongitudCadena() == longitudU){
           System.out.println("Las dos frases tienen la misma longitud");
       }
   }
  
   public void unirFrase (Cadena cadena1, String frase){
       String fraseUnida = cadena1.getCadenaU().concat(frase);
       System.out.println("CADENAS UNIDAS");
       System.out.println(fraseUnida);
       
   }
   
   public void reemplazar (Cadena cadena1 ,String caracter){
       
       String fraseReemplazada = cadena1.getCadenaU().replace("a", caracter);
       System.out.println(fraseReemplazada);
       
   }
   
   public boolean contiene (Cadena cadena1, String carcater) {
      
       boolean contenido;
       contenido = cadena1.getCadenaU().contains(carcater);
       
       return contenido;
   }
   
   
   
}
     
    
      
   

 