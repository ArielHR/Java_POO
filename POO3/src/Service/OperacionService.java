

package Service;

import Entidad.Operacion;

import java.util.Scanner;

public class OperacionService {
    Scanner read = new Scanner (System.in);
    
    public Operacion numeros () {
        
        Operacion numU = new Operacion();
        
        System.out.println("Ingrese un número entero");
        numU.setNumero1(read.nextInt());
        System.out.println("Ingrese un número entero");
        numU.setNumero2(read.nextInt());
        
        return numU;
    }
    
    public void sumar (Operacion numU){
        int suma = numU.getNumero1() + numU.getNumero2();
        System.out.println("  SUMA  ");
        System.out.println(numU.getNumero1() + " + " + numU.getNumero2() + " = " + suma);
       
        
        
    }
    
    public void resta (Operacion numU){
        int suma = numU.getNumero1() + numU.getNumero2();
        System.out.println("  RESTA  ");
        System.out.println(numU.getNumero1() + " + " + numU.getNumero2() + " = " + suma);
    }
    
    
    public void multiplicar (Operacion numU){
        if (numU.getNumero1() == 0 || numU.getNumero2() == 0) {
            System.out.println("  MULTIPLICACIÓN  ");
        System.out.println(numU.getNumero1() + " * " + numU.getNumero2() + " = 0");
            System.out.println("ERROR - En la multiplicación cuando un número se multiplica con CERO, el rrsultado simpre será CERO");
        } else {
             int multiplicacion = numU.getNumero1() * numU.getNumero2();
        System.out.println("  MULTIPLICACIÓN  ");
        System.out.println(numU.getNumero1() + " * " + numU.getNumero2() + " = " + multiplicacion);
        }
    }
    
    
    public void division (Operacion numU) {
        if (numU.getNumero1() == 0 || numU.getNumero2() == 0) {
            System.out.println("  DIVISIÓN  ");
        System.out.println(numU.getNumero1() + " / " + numU.getNumero2() + " = error");
            System.out.println("ERROR - En la división cuando un número se cero con CERO, el resultado simpre será CERO");
        } else {
             double  division = (double)numU.getNumero1() / numU.getNumero2();
        System.out.println("  DIVISIÓN  ");
        System.out.println(numU.getNumero1() + " / " + numU.getNumero2() + " = " + division);
        }
    }
}
    
    

    
       
    
    
