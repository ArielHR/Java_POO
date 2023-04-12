/*
public int Dibujo(Rectangulo r1) {

        for (int i = 0; i < r1.getAltura(); i++) {
           
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1 || j == 0 || j == r1.getBase() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        return 0;
    }
*/
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    
    Scanner read = new Scanner(System.in);
    
    public Rectangulo creacion () {
        
        Rectangulo rec1 = new Rectangulo();
        
        System.out.println("Ingresa la medida de la base");
        System.out.println("");
        rec1.setBase(read.nextDouble());
        System.out.println("Ingresa la medida de la altura");
        System.out.println("");
        rec1.setAltura(read.nextDouble());
      
        return rec1;
    }
    
    public void superficie (Rectangulo rec1) {
        System.out.println("La superficie del rectangulo es de " + rec1.getAltura() * rec1.getBase());
        
    }
    
    public void perimetro (Rectangulo rec1) {
        System.out.println("El perimetro del rectangulo es de " + (rec1.getAltura() + rec1.getBase()) * 2);
    }
      
    public void dibujo (Rectangulo rec1){
        
       for (int a = 0; a < rec1.getBase() ; a++) {
           System.out.print(" * ");
       }
       System.out.println();
       
       for (int i = 0 ; i < rec1.getAltura() - 2 ; i++){
           System.out.print(" * ");
           for (int y=0 ; y < rec1.getBase() - 2 ; y++){
               System.out.print("   ");
           }
           System.out.println(" * ");
       }
       
       System.out.print("");
       
       for (int m  = 0; m < rec1.getBase() ; m++) {
           System.out.print(" * ");
       }  
      }
        
       
}
