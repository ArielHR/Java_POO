
package Entidad;


public class Ahorcado {
    
    private String [] palabraIncognita;
    private int letrasEncontradas;
    private int  jugadasMaximas = 10;

    public Ahorcado() {
        
    }

    public Ahorcado(String[] palabraIncognita, int letrasEncontradas) {
        this.palabraIncognita = palabraIncognita;
        this.letrasEncontradas = letrasEncontradas;
    }
    
    

 

    public String[] getPalabraIncognita() {
        return palabraIncognita;
    }

    public void setPalabraIncognita(String[] palabraIncognita) {
        this.palabraIncognita = palabraIncognita;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
}
