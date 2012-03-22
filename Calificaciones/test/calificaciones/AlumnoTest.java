/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumnos
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }

        @Test
    public void AlumnosDebeTenerUnaCalificacion(){
        String codigo = "A0001";
        String nombre = "Ebert";
        String modalidad = "Tradicional";
        Alumno alumno = new Alumno(codigo, nombre, modalidad);
        Calificacion calificacion = alumno.getCalificacion();
        assertNotNull(calificacion);
    }
    
    @Test
    public void alumnoConModadlidadTradicionalDebeCalcularSuPromedioFinal(){
        String codigo = "A0001";
        String nombre = "Ebert";
        String modalidad = "Tradicional";
        double examenParcial = 10;
        double examenFinal = 10;
        double pc1 = 10;
        double pc2 = 10;
        
        Alumno alumno = new Alumno(codigo, nombre, modalidad);
        alumno.getCalificacion().setExamenParcial(examenParcial);
        alumno.getCalificacion().setExamenFinal(examenFinal);
        ((CalificacionTradicional)alumno.getCalificacion()).setPc1(pc1);
        ((CalificacionTradicional)alumno.getCalificacion()).setPc2(pc2);
        
        double retornado = alumno.getCalificacion().calcularPromedioFinal();
        assertTrue(retornado > 0);
        System.out.println("Su promedio por modalidad tradicional es :" + retornado);
        
    }
    
    @Test
    public void alumnoConModadlidadPracticaDebeCalcularSuPromedioFinal(){
        String codigo = "A0001";
        String nombre = "Ebert";
        String modalidad = "Practica";
        double examenParcial = 20;
        double examenFinal = 20;
        double tb1 = 20;
        double tb2 = 20;
        double proyecto = 10;
        
        Alumno alumno = new Alumno(codigo, nombre, modalidad);
        alumno.getCalificacion().setExamenParcial(examenParcial);
        alumno.getCalificacion().setExamenFinal(examenFinal);
        ((CalificacionPractica)alumno.getCalificacion()).setT1(tb1);
        ((CalificacionPractica)alumno.getCalificacion()).setT2(tb2);
        ((CalificacionPractica)alumno.getCalificacion()).setProyecto(proyecto);
        
        double retornado = alumno.getCalificacion().calcularPromedioFinal();
        assertTrue(retornado > 0);
        System.out.println("Su promedio por modalidad practica es :" + retornado);
        
    }
   
}
