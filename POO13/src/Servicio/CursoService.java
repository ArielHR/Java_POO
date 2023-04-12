
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String [] cargarAlumnos (Curso cursoA ){
        
        String [] alumnosBucle = new String[5]; 
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el nombre del alumno " + (i+1));
            alumnosBucle [i] = leer.next();
        }
        
        return alumnosBucle;
    }
    
    public Curso crearCurso (Curso cursoA) {
        System.out.println("Ingresa el nombre del curso");
        cursoA.setNombreCurso(leer.next());
        System.out.println("");
        System.out.println("Ingresa la cantidad de horas por día");
        cursoA.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa la cantidad de dias por semana");
        cursoA.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa el turno (Matutino o Vespertino)");
        cursoA.setTurno(leer.next());
        System.out.println("");
        System.out.println("Ingresa el precio por hora");
        cursoA.setPrecioPorHora(leer.nextInt());
        System.out.println("");
        System.out.println("Ingresa los alumnos");
        cursoA.setAlumnos(cargarAlumnos(cursoA));
        System.out.println();
        return cursoA;
    }
    
    public int calcularGanancia (Curso cursoA) {
        
        int ganancia = cursoA.getCantidadHorasPorDia() * cursoA.getPrecioPorHora() 
                      * cursoA.getAlumnos().length * cursoA.getCantidadDiasPorSemana();
        
        return ganancia;
    }
    
}
