/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber 
tener un constructor vacío, parametrizado y get y set. En el main se creará el objeto 
y se usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes 
de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package poo9;

import Entidad.Matematica;
import Servicios.MatematicaService;


public class POO9 {

 
    public static void main(String[] args) {
        
        Matematica calculoU = new Matematica();
        calculoU.setNumero1((float) Math.random()*20);
        calculoU.setNumero2((float) Math.random()*20);
        MatematicaService calculoE = new MatematicaService ();
        
        System.out.println("Devolver mayor");
        float numMayor = calculoE.devolverMayor(calculoU);
        float numMenor ;
        System.out.println(numMayor);
        if (numMayor == calculoU.getNumero1()){
            numMenor = calculoU.getNumero2();
        } else {
            
            numMenor = calculoU.getNumero1();
        }
        System.out.println("");
        System.out.println("Calcular potencia");
        float potencia =  (float)calculoE.calcularPotencia(numMayor, numMenor);
        System.out.println(numMayor + " elevado a la " + numMenor + " potencia es igual a " + potencia);
        System.out.println("");
        System.out.println("Calcular raíz cuadrada");
        double raiz = calculoE.calculaRaiz(numMenor);
        System.out.println("La raíz cuadrada de "+numMenor + " es de " + raiz);
               
    }
    
}
