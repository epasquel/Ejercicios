
package calificaciones;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class CalificacionTradicionalTest {
    
    public CalificacionTradicionalTest() {
    }

    @Test
    public void calificacionTradicionalDebeCalcularElPromedioSegunFormulaTradicional(){
    
        System.out.println("Calificacion tradicional debe calcular promedio final");
        double examenParcial = 10;
        double examenFinal = 15;
        double pc1 = 14;
        double pc2 = 15;
        CalificacionTradicional calificacion = new CalificacionTradicional();
        calificacion.setExamenParcial(examenParcial);
        calificacion.setExamenFinal(examenFinal);
        calificacion.setPc1(pc1);
        calificacion.setPc2(pc2);
        
        double resultadoEsperado = (examenFinal * 0.30) + (examenParcial * 0.30) + (pc1 * 0.20) + (pc2 * 0.20);
        double resultadoObtenido = calificacion.calcularPromedioFinal();
        assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
        
    }
    
}
