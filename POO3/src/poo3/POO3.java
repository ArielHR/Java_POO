//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
//el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
//se devuelve el resultado al main.

package poo3;

import Entidad.Operacion;
import Service.OperacionService;
import java.util.Scanner;

public class POO3 {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        OperacionService op = new OperacionService();
        
        System.out.println("    CALCULADORA DE OPERACIONES BÁSICAS    ");
        System.out.println("");
        System.out.println("Ingresa los números");
        System.out.println("");
        Operacion resultados = op.numeros();
        System.out.println("");
        System.out.println("Selecciona la operacion que vasa realizar");
        System.out.println("");
        System.out.println("1 . SUMA ");
        System.out.println("2 . RESTA ");
        System.out.println("3 . MULTIPLICACIÓN");
        System.out.println("4 . DIVISIÓN ");
        System.out.println("");
        int operador = read.nextInt();
        
        switch (operador) {
            case 1:
                op.sumar(resultados);
                break;
            case 2 :
                op.resta(resultados);
                break;
            case 3:
                op.multiplicar(resultados);
                break;
            case 4:
                op.division(resultados);
                break;  
        } 
    }
}
