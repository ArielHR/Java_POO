
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    
    Scanner read = new Scanner (System.in);
     private final double interes = 4.5;
    
     
     /**
      * Llenado de datos
      * @return cuenta1 
      */
    public Cuenta generarCuenta () {
        
        
        Cuenta cuenta1 = new Cuenta ();
        System.out.println("");
        System.out.println("     CUENTA BANCARIA     ");
        System.out.println("");
        System.out.println(" INGRESA SU NÚMERO DE CUENTA ");
        cuenta1.setNumeroCuenta(read.nextInt());
        System.out.println("");
        System.out.println(" INGRESA EL DNI ");
        cuenta1.setDNI(read.nextLong());
        System.out.println("");
        
        return cuenta1;
        
    }
    
    
    /**
     * INGRESAR EFECTIVO
     * @param cuenta1
     * @return cuenta1
     */
    public Cuenta ingresar (Cuenta cuenta1) {
        
        System.out.println(" INGRESAR EL MONTO DEL DEPOSITO QUE DESEA EFECTUAR ");
        System.out.println("");
        double deposito = read.nextDouble();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + deposito);
        System.out.println("");
        System.out.println(" REALIZANDO DEPOSITO ");
 
        return cuenta1;
        
    }
    
    
    /**
     * RETIRO DE EFECTIVO 
     * @param cuenta1
     * @return cuenta1
     */
    public Cuenta retiro ( Cuenta cuenta1 ) {
        
        System.out.println(" INGRESA EL MONTO A RETIRAR ");
        System.out.println("");
        double retiro = read.nextDouble();
        System.out.println(" ");
        if (cuenta1.getSaldoActual() < retiro) {
            System.out.println(" EL RETIRO SOLICITADO EXCEDE EL LIMITE DEL SALDO ACTUAL");
        } else {
            System.out.println(" RETIRO REALIZADO ");
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
        }
        
        return cuenta1 ;
    }
    
    
    /**
     * EXTRACCIÓN RÁPIDA
     * @param cuenta1
     * @return cuenta1
     */
    public Cuenta extraccionRapida (Cuenta cuenta1) {
        double ER = cuenta1.getSaldoActual() * 0.20;
        double retiroRapido;
        System.out.println(" SOLO SE PUEDE DISPONER DEL 20% DE SU SALDO ACTUAL");
        System.out.println("");
        System.out.println("Saldo Actual - $" + cuenta1.getSaldoActual() + ".00 MXN'");
        System.out.println("Saldo disponible para retiro - $" + ER + ".00 MXN");
        System.out.println("");
        System.out.print(" INGRESA EL MONTO A RETIRAR " );
        retiroRapido = read.nextDouble();
        if (retiroRapido > ER){
            System.out.println(" EL MONTO EXCEDE EL LIMITE DEL 20% EN UN RETIRO RAPIDO");
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiroRapido);
            System.out.println(" RETIRO REALIZADO ");
        }
        return cuenta1;
    }
    
    /**
     * CONSULTA DE SALDO
     * @param cuenta1 
     */
    public void consultarSaldo (Cuenta cuenta1) {
        System.out.println("");
        System.out.println(" CONSULTA DE SALDO ");
        System.out.println("");
        System.out.println(" Saldo Disponible - $" + cuenta1.getSaldoActual() + ".00 MXN");
         
    }
    
    
    /**
     * CONSULTA DE DATOS
     * @param cuenta1 
     */
    public void consultarDatos (Cuenta cuenta1) {
        System.out.println("     DETALLES DE CUENTA ");
        System.out.println("");
        System.out.println(" DNI -  " + cuenta1.getDNI());
        System.out.println("");
        System.out.println("");
        System.out.println(" Número de cuenta -  " + cuenta1.getNumeroCuenta());
        System.out.println("");
        System.out.println(" Saldo actual - $" + cuenta1.getSaldoActual() + ".00 MXN");
        System.out.println("");
 
    }
    
    
}
