
package aviario;

import appInterfaces.IAve;
import appInterfaces.IProducto;
import org.junit.Test;
import static org.junit.Assert.*;

public class CanarioTest {
    
    @Test
    public void canarioDebeReconocerComportamientoDeAve(){
    
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarius";    
        IAve canario = new Canario(nombreCientifico, codigo, nombre, precio);

        canario.volar();
        canario.cantar();
        String retornado = canario.getNombreCientifico();    
        assertEquals(nombreCientifico, retornado);   
    }
    
    @Test
    public void canarioDebeCantarComoCanario(){
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarius";    
        IAve canario = new Canario(nombreCientifico, codigo, nombre, precio);
        assertEquals("Estoy cantando como un canario", canario.cantar());
        System.out.println(canario.cantar());
    }
    
    @Test
    public void canarioDebeVolarComoCanario(){
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarius";    
        IAve canario = new Canario(nombreCientifico, codigo, nombre, precio);
        assertEquals("Estoy volando como un canario", canario.volar());
        System.out.println(canario.volar());
    }
    
    @Test
    public void canarioDebeReconocerComportamientoDeProducto(){
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarius";    
        IProducto canario = new Canario(nombreCientifico, codigo, nombre, precio);
        double precioRetornado = canario.getPrecioUnitario();
        assertEquals(precio, precioRetornado, 0.0);
        
    }
    
}
