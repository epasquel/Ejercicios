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
public class CalificacionPracticaTest {
    
    public CalificacionPracticaTest() {
    }

    @Test
    public void calificacionPracticaDebeCalcularElPromedioSegunFormulaPractica(){
    
        System.out.println("Calificacion practica debe calcular promedio final");
        double examenParcial = 10;
        double examenFinal = 12;
        double t1 = 15;
        double t2 = 17;
        double proyecto = 13;
        
        CalificacionPractica calificacion = new CalificacionPractica();
        calificacion.setExamenParcial(examenParcial);
        calificacion.setExamenFinal(examenFinal);
        calificacion.setT1(t1);
        calificacion.setT2(t2);
        calificacion.setProyecto(proyecto);
        
        double resultadoEsperado = (examenFinal * 0.15) + (examenParcial * 0.25) + (t1 * 0.10) + (t2 * 0.10) + (proyecto * 0.40);
        double resultadoObtenido = calificacion.calcularPromedioFinal();
        assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
        
    }
   
}
