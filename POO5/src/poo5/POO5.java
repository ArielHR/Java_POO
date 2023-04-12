//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//
//b) Agregar los métodos getters y setters correspondientes
//
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero
//a ingresar y se la sumara a saldo actual.
//
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a 
//retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad 
//de dinero a retirar, se pondrá el saldo actual en 0.
//
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. 
//Validar que el usuario no saque más del 20%.
//
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta


package poo5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

public class POO5 {


    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int i = 0;
        CuentaServicio cliente1 = new CuentaServicio() ;
        
        System.out.println(" BANCO CENTRAL DE DACM ");
        Cuenta cuenta1 = cliente1.generarCuenta();
        
        do {
            System.out.println("   MENÚ   ");
        System.out.println("");
        System.out.println("1. INGRESAR EFECTIVO ");
        System.out.println("2. RETIRAR EFECTIO ");
        System.out.println("3. RETIRO RAPIDO  ");
        System.out.println("4. CONSULTAR SALDO ");
        System.out.println("5. CONSULTAR DATOS ");
        System.out.println("6. SALIR ");
        int menu = read.nextInt();
        switch (menu) {
            case 1:
              cliente1.ingresar(cuenta1);
              break;
            case 2:
                cliente1.retiro(cuenta1);
                i = 1;
                break;
            case 3:
                cliente1.extraccionRapida(cuenta1);
                i = 1;
                break;
            case 4:
                cliente1.consultarSaldo(cuenta1);
                i = 1;
                break;
            case 5:
                cliente1.consultarDatos(cuenta1);
                i = 1;
                break;
            case 6:
                i = 0;    
            }
        } while (i != 0);
    }
}

    

