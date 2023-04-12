
package poo1;

import Entidades.Libro;
import Service.LibroService;


public class POO1 {

    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        Libro l1 = ls.cargarLibro();
        
        ls.mostrarLibro(l1);
        
        
    }
    
}
