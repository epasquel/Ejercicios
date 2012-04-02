
package conejocolita;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


public class MascotaTest {
    
    public MascotaTest() {
    }


    @Test
    public void mascotaDebeTenerNombre() {
        Mascota mascota = new Mascota("Colita", "Conejo");
        assertNotNull(mascota.getNombre());
        System.out.println("El nombre de la mascota es  : " + mascota.getNombre());
    }
    
    @Test
    public void mascotaMueveLaCola(){
        Mascota mascota = new Mascota("Colita", "Conejo");
        assertSame("Estoy moviendo la cola", mascota.moverCola());
        System.out.println(mascota.moverCola());
    }
    
    @Test
    public void mascotaSeAcerca(){
        Mascota mascota = new Mascota("Colita", "Conejo");
        assertSame("Me esoty acercando", mascota.acercarse());
        System.out.println(mascota.acercarse());
    }
}
