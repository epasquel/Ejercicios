/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conejocolita;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumnos
 */
public class DuenhoTest {
    
    public DuenhoTest() {
    }


    @Test
    public void elDuenhoDebeTenerNomobre() {
        Duenho duenho = new Duenho("Carlos", 5, "Colita");
        assertNotNull(duenho.getNombre());
    }
    
    @Test
    public void cuandoTocoLaOrejaAMiMascotaMueveLaCola(){
        Duenho duenho = new Duenho("Carlos", 5, "Colita");
        String mensajeRecibido = duenho.tocarOreja();
        assertSame("Estoy moviendo la cola", mensajeRecibido);
    }
    
    @Test
    public void cuandoLeMuestroUnaZanahoriaSeAcerca(){
        Duenho duenho = new Duenho("Carlos", 5, "Colita");
        String mensajeRecibido = duenho.mostrarZanahoria();
        assertSame("Me esoty acercando", mensajeRecibido);
    }
    
}
