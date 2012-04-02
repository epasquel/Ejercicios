
package conejocolita;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class MascotaTest {
    
    public MascotaTest() {
    }


    @Test
    public void mascotaDebeTenerNombre() {
        ArrayList<Mascota> listMascota = new ArrayList<Mascota>();
        listMascota.add(new Mascota("Colita", "Conejo"));
        listMascota.add(new Mascota("Piolin", "Canario"));
        String nombres = "";
        for (Mascota mascota: listMascota){
            nombres = (mascota.getNombre() == "") ? "" : ";" + mascota.getNombre();
        }        
        assertNotNull(nombres);
    }
    
    @Test
    public void mascotaMueveLaCola(){
        Mascota mascota = new Mascota("Colita", "Conejo");
        assertSame("Estoy moviendo la cola", mascota.moverCola());
    }
    
    @Test
    public void mascotaSeAcerca(){
        Mascota mascota = new Mascota("Colita", "Conejo");
        assertSame("Me esoty acercando", mascota.acercarse());
    }
}
