
package Entidad;


public class Persona {
    
/// Atributos / variables del objeto
    
    private String nombre;
    private int edad;
    private String nacimiento;
    private int ID;
    
/// C O N S T R U C T O R E S 
    
    public Persona(String nombre, int edad, String nacimiento, int ID) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.ID = ID;
    }
    
    
/// GETS Y SETS DE CADA ATRIBUTO PARA PODER MODIFICARLO (SET) O SOLO MOSTRARL (GET)
    public String getNombre() {
        return nombre;
    }
      public void setNombre(String nombre) {
        this.nombre = nombre;
    }

      

    public int getEdad() {
        return edad;
    }
     public void setEdad(int edad) {
        this.edad = edad;
    }
     

    public String getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    
    public int getID() {
        return ID;
    }
     public void setID(int ID) {
        this.ID = ID;
    }
     
     public void mostrarAtributos (Persona usuario) {
         System.out.println( getNombre() + " " + getEdad() + " " + getNacimiento());
     }
   
  
}
 