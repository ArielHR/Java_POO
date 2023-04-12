
package Servicio;

import Entidad.Raices;
import java.util.Scanner;


public class RaicesService {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearEcuacion (){
        
        Raices raizU = new Raices ();
        System.out.println("Ingresa el primer termino de la ecuacuión (Ax^2)");
        raizU.setA(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa el segundo termino de la ecuacuión (Bx) ");
        raizU.setB(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa el tercer termino de la ecuacuión (C) ");
        raizU.setC(leer.nextInt());
        System.out.println("");
     return raizU; 
    }
  
//Un discriminante positivo indica que la cuadrática tiene dos soluciones reales distintas.
//Un discriminante de cero indica que la cuadrática tiene una solución real repetida.
//Un discriminante negativo indica que ninguna de las soluciones son números reales.
    public double getDiscriminante (Raices raizU){
//        (b^2)-4*a*c
        double discriminante = (Math.pow(raizU.getB(), 2)) - 4*raizU.getA()*raizU.getC();
        
        return discriminante;
    }
       
    public boolean tieneRaices (double discriminante) {
        
        boolean dosRaices = discriminante > 0;
        
        return dosRaices;
    }
    
    public boolean tieneRaiz (double discriminante) {
        
        boolean unaRaiz = (discriminante == 0);
        
        return unaRaiz;
    }
    
    public void obtenerRaices (double discriminante, double s1,double s2) {
        
        if (tieneRaices(discriminante) == true) {
            
            System.out.println("La primera solución es : " + s1);
            System.out.println("");
            System.out.println("La segunda solución es : " + s2);
        } 
    }
    
    public void obtenerRaiz (double discriminante , double s1) {
        if (tieneRaiz(discriminante) == true){
            System.out.println("La única solución es : " + s1);
        }
    }
    /*
    Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
    */
    public void calcular (Raices raizU) {
        double s1,s2;
        if (tieneRaices(getDiscriminante(raizU)) == true) {
            s1 = ((- raizU.getB()) + Math.sqrt(getDiscriminante(raizU))) / (2 * raizU.getA());
            s2 = ((- raizU.getB()) - Math.sqrt(getDiscriminante(raizU))) / (2 * raizU.getA());
            obtenerRaices(getDiscriminante(raizU), s1, s2);
            
                    
        } else if (tieneRaiz(getDiscriminante(raizU)) == true) {
           
           s1 = (-1 *  raizU.getB()) / (2 * raizU.getA());
            obtenerRaiz(getDiscriminante(raizU), s1);
            

        } else if (getDiscriminante(raizU) < 0) {
            System.out.println("La ecuación no tiene solución");
        }
                
    }
    
    
   
}

