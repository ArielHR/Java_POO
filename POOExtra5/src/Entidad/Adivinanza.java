
package Entidad;


public class Adivinanza {
    
    public String adivinanza (){
        String [] anio = new String[12];
        anio[0] = "enero";
        anio[1] = "febrero";
        anio[2] = "marzo";
        anio[3] = "abril";
        anio[4] = "mayo";
        anio[5] = "junio";
        anio[6] = "julio";
        anio[7] = "agosto";
        anio[8] = "septiembre";
        anio[9] = "octubre";
        anio[10] = "noviembre";
        anio[11] = "diciembre";
        int aleatorio = (int) (Math.random()*11);
        String mesX = anio[aleatorio];
        return mesX;
        
    }
    
}
