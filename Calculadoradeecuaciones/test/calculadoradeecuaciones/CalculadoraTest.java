

package calculadoradeecuaciones;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    
    
    @Test
    public void ecuacionDebeCalcularX1(){
        
        double a = 5;
        double b = 4;
        double c = -1;
        double x1Esperado = 0.2;
        
        Ecuacion ecuacion = new Ecuacion(a,b,c);
        double x1Retornado = ecuacion.calcularX1();
        
        assertEquals(x1Esperado, x1Retornado, 0);        
    }
    
    @Test
    public void ecuacionDebeCalcularX1conOtrosValores(){
    
        double a = 2;
        double b = -1;
        double c = -1;
        double x1Esperado = 1.0;
        
        Ecuacion ecuacion = new Ecuacion(a,b,c);
        double x1Retornado = ecuacion.calcularX1();
        
        assertEquals(x1Esperado, x1Retornado, 0);
        
    }
    
    @Test
    public void ecuacionDebeCacularX2(){
        
        double a = 5;
        double b = 4;
        double c = -1;
        double x1Esperado = -1;
        
        Ecuacion ecuacion = new Ecuacion(a,b,c);
        double x2Retornado = ecuacion.calcularX2();
        
        assertEquals(x1Esperado, x2Retornado, 0);
        
    }
    
    @Test
    public void ecuacionDebeCalcularX2conOtrosValores(){
    
        double a = 2;
        double b = -1;
        double c = -1;
        double x2Esperado = -0.5;
        
        Ecuacion ecuacion = new Ecuacion(a,b,c);
        double x2Retornado = ecuacion.calcularX2();
        
        assertEquals(x2Esperado, x2Retornado, 0);
        
    }
    
    
}
