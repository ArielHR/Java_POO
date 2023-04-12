/*
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo 
código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará 
un número correspondiente al código.

*/
package Entidad;

public class Movil {
    
    private String marca;
    private float precio;
    private String modelo;
    private int memoriaRam ;
    private float almacenamiento;
    private String [] codigo = new String [7];

    public Movil() {
    }

    public Movil(String marca, float precio, String modelo, int memoriaRam, float almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String [] codigo) {
        this.codigo = codigo;
    }
            
    
    
}
