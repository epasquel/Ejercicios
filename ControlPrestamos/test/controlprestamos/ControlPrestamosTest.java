/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlprestamos;

import controladora.admPrestamosLibros;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class ControlPrestamosTest {
    
    public ControlPrestamosTest() {
    }
    
    admPrestamosLibros objAdm = new admPrestamosLibros();
    
    @Test
    public void puedeSolicitarLibro(){
        assertTrue(objAdm.puedeSolicitarLibro("C0001"));
        System.out.println("Puede solictar libro");
    }
    
    @Test
    public void noPuedeSolicitarLibro(){
        assertFalse(objAdm.puedeSolicitarLibro("C0003"));
        System.out.println("No puede solicitra libro");
    }
    
}
