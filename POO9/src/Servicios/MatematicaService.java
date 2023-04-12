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

package Servicios;

import Entidad.Matematica;


public class MatematicaService {
    
    public float devolverMayor (Matematica calculoU){
 
        if (calculoU.getNumero1() > calculoU.getNumero2()){
            return calculoU.getNumero1();
        } else {
            return calculoU.getNumero2();
        }
        
    }
    
    public float calcularPotencia (float numMayor , float numMenor){
        
        float potenciaValores = (float) Math.pow(Math.round(numMayor),Math.round(numMenor));
        
        return potenciaValores;
    }
    
    public double calculaRaiz (float numMenor){
        
        double raiz = Math.sqrt(Math.abs(numMenor));
        
        return raiz;
    }
            
            
    
}
