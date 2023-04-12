/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

public class MovilService {
    Scanner leer = new Scanner (System.in);
    
    public Movil cargarCelular (){
        Movil celularU = new Movil();
        System.out.println("Ingresar Marca");
        celularU.setMarca(leer.nextLine());
        System.out.println("");
        System.out.println("Ingresar Modelo");
        celularU.setModelo(leer.nextLine());
        System.out.println("");
        System.out.println("Ingresa la memoria RAM");
        celularU.setMemoriaRam(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa el Almacenamiento del dispositivo");
        celularU.setAlmacenamiento(leer.nextFloat());
        System.out.println("");
        celularU.setCodigo(ingresarCodigo());
        
        
        return celularU;      
    }
    
    public String [] ingresarCodigo (){
        
        String [] codigoB = new String [7];
        String  codigoL;
        
        do {
            
            System.out.println("Ingresa el Código");
           codigoL  = leer.next();
            System.out.println("");
            
            if (codigoL.length() != 7 ) {
                System.out.println("Código Invalido");
            }

        } while (codigoL.length() != 7);
        
        for (int i = 0; i < 7; i++) {
            codigoB [i] = codigoL.substring(i , i+1);
        }
        
        return codigoB;
        
    }
    
    public void mostrarProducto (Movil celular) {
        
        System.out.println("   Información del Producto     ");
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("Marca : " + celular.getMarca());
        System.out.println("Modelo : " + celular.getModelo());
        System.out.println("Memoria RAM : " + celular.getMemoriaRam() + " GB");
        System.out.println("Almacenamiento : " + celular.getAlmacenamiento() + " GB");
        System.out.print("Código de Barras : " + Arrays.toString(celular.getCodigo()));
        
           
        
       
                
        
    }
    

}
