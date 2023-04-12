
package Service;

import Entidades.Libro;
import java.util.Scanner;

public class LibroService {
    
    Scanner leer = new Scanner(System.in);
    
    public Libro cargarLibro () {
        
        Libro l1 = new Libro();
        
        System.out.println("Ingresar el titulo del Libro");
        l1.setTitulo(leer.nextLine());
        System.out.println("Ingresar el autor del Libro");
        l1.setAutor(leer.nextLine());
        System.out.println("Ingresar el número de página del Libro");
        l1.setPaginas(leer.nextInt());
        System.out.println("Ingresar el ISBN del libro");
        l1.setIsbn(leer.nextInt());

        return l1; 
    }
    
    public void mostrarLibro (Libro l1){
        System.out.println("");
        System.out.println("Titulo del libro");
        System.out.println(l1.getTitulo());
        System.out.println("");
        System.out.println("Autor del libro");
        System.out.println(l1.getAutor());
        System.out.println("");
        System.out.println("Páginas del libro");
        System.out.println(l1.getPaginas());
        System.out.println("");
        System.out.println("ISBN");
        System.out.println(l1.getIsbn());
    }
    
    
}
