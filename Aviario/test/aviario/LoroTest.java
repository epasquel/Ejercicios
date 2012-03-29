
package aviario;

import appInterfaces.IAve;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoroTest {
    
    @Test
    public void loroDebeReconocerComportamientoDeAve(){
    
        String codigo = "LO001";
        String nombre = "Loro";
        double precio = 1000.00;
        String nombreCientifico = "Lorus";    
        IAve loro = new Loro(nombreCientifico, codigo, nombre, precio);

        loro.volar();
        loro.cantar();
        String retornado = loro.getNombreCientifico();    
        assertEquals(nombreCientifico, retornado);   
    }
    
}
