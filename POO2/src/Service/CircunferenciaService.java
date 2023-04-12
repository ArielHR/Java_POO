
package Service;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaService {
    Scanner read = new Scanner (System.in);
    
   
    public Circunferencia radio () {
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingresa el radio de la circunferencia");
        c1.setRadio(read.nextDouble());
        System.out.println("");
        
        return c1;
        
    }
    
    public void area ( Circunferencia c1) {
        
       double area = (Math.PI * Math.pow(c1.getRadio(), 2));
        System.out.println("El area de la circunferenciaes es: " + area);
        System.out.println("");
        
    }
    public void perimetro ( Circunferencia c1) {
        
        double perimetro = (2 * Math.PI * c1.getRadio());
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        System.out.println("");
    }
}
