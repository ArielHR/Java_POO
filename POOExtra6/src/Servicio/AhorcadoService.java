
package Servicio;

import Entidad.Ahorcado;
import apple.laf.JRSUIConstants;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in);
    int e = 0 ;
    int intentos;
    public Ahorcado crearJuego (){
        Ahorcado jugador1 = new Ahorcado ();
        System.out.println("Ingresa la palabra");
        String palabra = leer.next();
        int longitudP = palabra.length();
        jugador1.setPalabraIncognita(llenarVector(palabra, longitudP));
        System.out.println("");
        jugador1.setJugadasMaximas(longitudP + 3);
        jugador1.setLetrasEncontradas(0);
        return jugador1;
        
    }
    
    public String [] llenarVector (String palabra,int longitudP) {
        
        String [] palabraVector = new String[longitudP];
        for (int i = 0; i < longitudP; i++) {
            palabraVector[i] = palabra.substring(i, i +1);
        }
        
        return palabraVector;
    }
    
    public int lonigtud (Ahorcado jugador1){

        int longitud = jugador1.getPalabraIncognita().length;
        
        return longitud;
    }
    
    public boolean  buscar (String letra,Ahorcado jugador1){
        boolean verificador = false;
        
        for (int i = 0; i < jugador1.getPalabraIncognita().length; i++) {
            
           if ( verificador = letra.equalsIgnoreCase(jugador1.getPalabraIncognita()[i])) {
               break;
           }
        }
        return verificador;
    }
    
    public void encontradas (Ahorcado jugador1, String letra) {
      int faltantes = 0 ;
       if (buscar(letra, jugador1)) {
           e++;
           jugador1.setLetrasEncontradas(e);
           faltantes = (jugador1.getPalabraIncognita().length ) - jugador1.getLetrasEncontradas();
       } else {
           faltantes = jugador1.getPalabraIncognita().length;
       }
        
        System.out.println("Letras (encontradas/faltantes): (" + jugador1.getLetrasEncontradas() + "/" + faltantes + ")");
    }
    
    public void intentos (Ahorcado jugador1 , int cont) {
       
        if(cont == jugador1.getJugadasMaximas()) {
            System.out.println("Intentos restantes: " + jugador1.getJugadasMaximas());
        } else {
            
            System.out.println("Intentos restantes: " +  cont);
        }
        
    }
    
    public void juego (Ahorcado jugador1) {
        
        int cont = jugador1.getJugadasMaximas() ;
        do {
        System.out.print("Ingresa una letra: ");
        String letra = leer.next();
        System.out.print("Longitud : " + lonigtud(jugador1));
        System.out.println("");
        if (buscar(letra, jugador1)) {
            System.out.println("Mensaje: La letra pertenece a la palabra"); 
        } else {
            System.out.println("Mensaje: La letra NO pertenece a la palabra");
        }
        encontradas(jugador1, letra);
        intentos(jugador1,cont);
         
            System.out.println("--------------------------");
            cont-- ;
            if (jugador1.getLetrasEncontradas() == jugador1.getPalabraIncognita().length){
                System.out.println("¡ FELICIDAES ENCONTRO LA PALABRA OCULTA!");
                break;
            } 
        } while (cont != 0);
        if (jugador1.getLetrasEncontradas() < jugador1.getPalabraIncognita().length) {
            System.out.println("SE ACABARON LOS INTENTOS LOSER");
        }
    }
}
