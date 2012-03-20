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
    public void siNoIngresoElClienteMeDebeDarError(){
        assertFalse(objAdm.verificarCliente(null));
        System.out.println("Cliente no debe estar vacío"); 
    }
     
    @Test
    public void siElClienteNoExisteDebeMandarMensaje(){        
        assertNull(objAdm.validarExistenciaCliente(null));
        System.out.println("Cliente Inexistente");        
    }
    
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
    
    @Test
    public void siElLibroNoExisteDebeMandarMensaje(){
        assertNull(objAdm.verificarLibro("LB0010"));
        System.out.println("EL Código ingresado no existe");
    }
    
    @Test
    public void siElLibroExisteDebeMandarMensaje(){
        assertNotNull(objAdm.verificarLibro("LB0001"));
        System.out.println("EL Código ingresado si existe");
    }   
   
    @Test
    public void siNoTieneLibroDebeMandarMensaje(){
        assertNull(objAdm.verificarPrestamoParaDevolucion("C0001", "LB0010"));
        System.out.println("Libro no asignado al cliente");
    }
    
    @Test
    public void siTieneLibroDebeMandarMensaje(){
        assertNotNull(objAdm.verificarPrestamoParaDevolucion("C0001", "LB0001"));
        System.out.println("Libro asignado al cliente, devolucion pendiente");
    }
    
}
