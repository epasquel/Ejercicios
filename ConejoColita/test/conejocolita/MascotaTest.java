
package conejocolita;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class MascotaTest {
    
    public MascotaTest() {
    }


    @Test
    public void mascotaDebeTenerNombre() {
        Mascota mascota = new Mascota("Colita");
        assertNotNull(mascota.getNombre());
    }
    
    @Test
    public void mascotaMueveLaCola(){
        Mascota mascota = new Mascota("Colita");
        assertSame("Estoy moviendo la cola", mascota.moverCola());
    }
    
    @Test
    public void mascotaSeAcerca(){
        Mascota mascota = new Mascota("Colita");
        assertSame("Me esoty acercando", mascota.acercarse());
    }
}
