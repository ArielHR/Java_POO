
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;
public class PuntosService {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos () {
        
        Puntos puntosU = new Puntos ();
        System.out.println("Ingresa la coordenada del primer punto");
        System.out.println(" x1 ");
        puntosU.setX1(leer.nextInt());
        System.out.println("");
        System.out.println(" y1 ");
        puntosU.setY1(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa la coordenada del segundo punto");
        System.out.println(" x2 ");
        puntosU.setX2(leer.nextInt());
        System.out.println("");
        System.out.println(" y2 ");
        puntosU.setY2(leer.nextInt());
        System.out.println("");
        
        return puntosU;
    }
    
    public double calcularDistancia (Puntos puntosU){
        
        double distanciaP;
        
        distanciaP = Math.sqrt( Math.pow(puntosU.getX2() - puntosU.getX1(), 2) + Math.pow(puntosU.getY2() - puntosU.getY1(), 2) );
        
        return distanciaP;
    }
    

}
