/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto. Después,
a través de otro método calcular y devolver la distancia que existe entre 
los dos puntos que existen en la clase Puntos. 
 */
package pooextra2;

import Entidad.Puntos;
import Servicio.PuntosService;


public class POOExtra2 {

    
    public static void main(String[] args) {
        
        PuntosService Ps = new PuntosService();
        Puntos puntosU = Ps.crearPuntos();
        System.out.println("");
        System.out.println("La distancia que hay entres ambos puntos es de " + Ps.calcularDistancia(puntosU));

    }
    
}
