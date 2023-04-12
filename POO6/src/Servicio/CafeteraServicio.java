
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner read = new Scanner(System.in);
    
    public Cafetera creacion () {
        Cafetera cafe1 = new Cafetera ();
        System.out.println(" INGRESA LA CAPACIDAD MÁXIMA DE LA CAFETERA (ml) ");
        cafe1.setCapacidadMaxima(read.nextFloat());
        System.out.println("");
        return cafe1;
    }
    
    public Cafetera llenarCafetera (Cafetera cafe1){
        if (cafe1.getCantidadActual() == cafe1.getCapacidadMaxima()) {
            System.out.println("");
            System.out.println("LA CAFETERA ESTÁ LLENA");
        } else  {
            cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
            System.out.println("");
            System.out.println(" CAFETERA LLENA ");
            System.out.println("");
        }
 
        return cafe1;
    }
    
    public Cafetera servirTaza (Cafetera cafe1) {
        
        System.out.println("");
        System.out.println("INGRESA EL TAMAÑO DE LA TAZA (ml)");
        float tazaT = read.nextFloat();
        if (cafe1.getCantidadActual() == 0) {
            System.out.println("CAFETERA VACIA ");
        } else {
            if (tazaT <= cafe1.getCantidadActual()) {
            cafe1.setCantidadActual(cafe1.getCantidadActual() - tazaT);
            System.out.println("");
            System.out.println(" Taza Servida ");
        } else if (tazaT > cafe1.getCantidadActual()) {
            System.out.println("El cafe no alcanza a llenar la taza");
            System.out.println("Cafe servido: " + cafe1.getCantidadActual() + " ml.");
            cafe1.setCantidadActual(0);
        }
        }
        
        
        return cafe1;
    }
    
    public Cafetera vaciarCafetera (Cafetera cafe1) {
        
        System.out.println("");
        System.out.println("CAFETERA VACIA");
        cafe1.setCantidadActual(0);
        
        return cafe1;
        
    }
    
    public Cafetera agregarCafe (Cafetera cafe1 ) {
        
        float resto = cafe1.getCapacidadMaxima() - cafe1.getCantidadActual();
        System.out.println("");
        System.out.println("INGRESE LA CANTIDAD CAFÉ");
        System.out.println("");
        System.out.println("Cantidad de cafe que se puede agregar: " + resto + " gr.");
        float cafe = read.nextFloat();
        
        if ((cafe + cafe1.getCantidadActual()) > cafe1.getCapacidadMaxima()) {
            System.out.println("");
            System.out.println(" La cantidad de cafe excede el maximo que la cafetera soporta");
            cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
            System.out.println("");
            System.out.println(" Se relleno la cafetera con " + resto + " gr.");
        } else {
            System.out.println(" Se relleno la cafetera con " + cafe + " gr.");
            cafe1.setCantidadActual(cafe);
        }
        
        
        return cafe1;
    }
    
    
 
}
