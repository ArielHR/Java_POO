//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
package Entidad;


public class Cadena {
    
    private String cadenaU;
    private int longitudCadena;

    
    public Cadena() {
    }
    public Cadena(String cadenaU, int longitudCadena) {
        this.cadenaU = cadenaU;
        this.longitudCadena = longitudCadena;
    }
    

    public String getCadenaU() {
        return cadenaU;
    }

    public void setCadenaU(String cadenaU) {
        this.cadenaU = cadenaU;
    }

    public int getLongitudCadena() {
        return longitudCadena;
    }

    public void setLongitudCadena(int longitudCadena) {
        this.longitudCadena = longitudCadena;
    }

    
    
}

