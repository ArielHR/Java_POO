
package Entidad;


public class Cafetera {
    
    private float capacidadMaxima;
    private float cantidadActual;
    
    
    public Cafetera () {
        
    }

    public Cafetera(float capacidadMaxima, float cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
}
