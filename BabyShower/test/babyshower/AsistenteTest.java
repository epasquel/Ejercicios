
package babyshower;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class AsistenteTest {
    
    public AsistenteTest() {
    }

    @Test    
    public void asistenteDebeTenerNombre(){            
        Asistente asistente = new Asistente("Martha", 20, 2, 1960);
        assertNotNull(asistente.getNombre());
    }
    
    @Test
    public void asistenteDebeTenerUnaEdad(){
        Asistente asistente = new Asistente("Martha", 20, 2, 1960);
        assertNotNull(asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeCalcularSuEdadCorrecta(){
        Asistente asistente = new Asistente("Martha", 20, 2, 1960);
        assertEquals(52,asistente.getEdad());
    }    
    
    @Test
    public void asistenteDebeCalcularSuEdadCorrectaTomandoEnCuentaElMes(){
        Asistente asistente = new Asistente("Martha", 10, 7, 1960);
        assertEquals(51,asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeCalcularSuedadCorrectaTomandoEnCuentaElDia(){
        Asistente asistente = new Asistente("Mariela", 28, 3, 1980);
        assertEquals(31,asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeCalcularEdadTomandoEnCuentaLaFecha(){
        Asistente asistente = new Asistente("Karla", 28, 12, 2000);
        assertEquals(11, asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeRecibirLaEdadDeLaAsistenteALaQueSeLoPregunta(){
        Asistente asistente1 = new Asistente("Karla", 28, 12, 2000);
        Asistente asistente2 = new Asistente("Mariela", 28, 3, 1980);
        int edadRecibida = asistente1.preguntarEdad(asistente2);
        int edadEsperada = asistente2.getEdad();
        System.out.println("La edad del " + asistente2.getNombre() + " es " + asistente2.getEdad());
        System.out.println(asistente1.getNombre() + " pregunta edad a " + asistente2.getNombre());
        System.out.println("Y " + asistente2.getNombre() + " dice que tiene " + asistente2.getEdad());
        assertEquals(edadEsperada, edadRecibida);
                
    }
    
}
