/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conejocolita;

import java.util.ArrayList;
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
        ArrayList<String> listNombre = new ArrayList<String>();
        listNombre.add("Carlos");
        listNombre.add("Joaquin");
        ArrayList<Mascota> listMascota = new ArrayList<Mascota>();
        listMascota.add(new Mascota("Colita", "Conejo"));
        Duenho duenho = new Duenho(listNombre, 5, listMascota);
        assertNotNull(duenho.getNombre());
    }
    
    @Test
    public void cuandoTocoLaOrejaAMiMascotaMueveLaCola(){
        ArrayList<String> listNombre = new ArrayList<String>();
        listNombre.add("Carlos");
        listNombre.add("Joaquin");
        ArrayList<Mascota> listMascota = new ArrayList<Mascota>();
        listMascota.add(new Mascota("Colita", "Conejo"));
        Duenho duenho = new Duenho(listNombre, 5, listMascota);
        String mensajeRecibido = duenho.tocarOreja("Conejo");
        assertSame("Estoy moviendo la cola", mensajeRecibido);
    }
    
    @Test
    public void cuandoLeMuestroUnaZanahoriaSeAcerca(){
        ArrayList<String> listNombre = new ArrayList<String>();
        listNombre.add("Carlos");
        listNombre.add("Joaquin");
        ArrayList<Mascota> listMascota = new ArrayList<Mascota>();
        listMascota.add(new Mascota("Colita", "Conejo"));
        Duenho duenho = new Duenho(listNombre, 5, listMascota);
        String mensajeRecibido = duenho.mostrarZanahoria("Conejo");
        assertSame("Me esoty acercando", mensajeRecibido);
    }
    
    @Test
    public void cuandoLeDoyAlpisteCanta(){
        ArrayList<String> listNombre = new ArrayList<String>();
        listNombre.add("Pedro");
        ArrayList<Mascota> listMascota = new ArrayList<Mascota>();
        listMascota.add(new Mascota("Piolin", "Canario"));
        Duenho duenho = new Duenho(listNombre, 5, listMascota);
        String mensajeRecibido = duenho.darAlpiste("Canario");
        assertSame("Estoy cantando", mensajeRecibido);
    }
    
}
