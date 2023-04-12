
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class NIFService {
    Scanner leer = new Scanner(System.in);

   public NIF crearNIF () {
         
       char [] codigoLetra = new char [23];
       
       codigoLetra[0]= 'T';
       codigoLetra[1]='R';
       codigoLetra[2]= 'W';
       codigoLetra[3]= 'A';
       codigoLetra[4]= 'G';
       codigoLetra[5]= 'M';
       codigoLetra[6]= 'Y';
       codigoLetra[7]= 'F';
       codigoLetra[8]= 'P';
       codigoLetra[9]= 'D';
       codigoLetra[10]= 'X';
       codigoLetra[11]= 'B';
       codigoLetra[12]= 'N';
       codigoLetra[13]= 'J';
       codigoLetra[14]= 'Z';
       codigoLetra[15]= 'S';
       codigoLetra[16]= 'Q';
       codigoLetra[17]= 'V';
       codigoLetra[18]= 'H';
       codigoLetra[19]= 'L';
       codigoLetra[20]= 'C';
       codigoLetra[21]= 'K';
       codigoLetra[22]= 'E';

       NIF nifU = new NIF ();
       System.out.println("Ingresa tu DNI (8 dígitos)");
       nifU.setDNI(leer.nextLong());
       for (int i = 0; i < codigoLetra.length; i++) {
           if (nifU.getDNI() % 23 == i) {
               nifU.setLetra(codigoLetra[i]);
           }
       }
       
       return nifU;
   }
   // imprimir con una cirta estructura se utiliza StringBuilder
   public String toString (NIF nifU) {
       StringBuilder mostrarNIF = new StringBuilder();
       mostrarNIF.append(nifU.getDNI());
       mostrarNIF.append("-");
       mostrarNIF.append(nifU.getLetra());
        return mostrarNIF.toString();
      
   }

  
    
}
