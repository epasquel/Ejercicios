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
        System.out.println("Puede solicitar libro");
    }
    
    @Test
    public void noPuedeSolicitarLibro(){
        assertFalse(objAdm.puedeSolicitarLibro("C0003"));
        System.out.println("No puede solicitar libro");
    }
    
    @Test
    public void libroNoDisponible(){
        assertFalse(objAdm.libroDisponible("L0003"));
        System.out.println("El libro no esta disponible");
    }
    @Test
    public void libroDisponible(){
        assertTrue(objAdm.libroDisponible("L0001"));
        System.out.println("El libro esta disponible");
    }
    
}
