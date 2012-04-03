
package aviario;

import appInterfaces.IProducto;
import db.dbLoros;
import java.util.ArrayList;


public class Loro extends Ave implements IProducto{

    private Producto producto;
    
    public Loro(String nombreCientifico, String codigo, String descripcion, double precio) {
        super(nombreCientifico);
        producto = new Producto(codigo, descripcion, precio);
    }
    
    public String volar(){
        String texto = fraseVolar + " como un loro";
        return texto;
    }
    
    public String cantar(){
        String texto = fraseCantar + " como un loro";
        return texto;
    }
    
    public String getCodigo(){
        return producto.getCodigo();
    }
    
    public String getDescripcion(){
        return producto.getDescripcion();
    }
    
    public double getPrecioUnitario(){
        return producto.getPrecioUnitario();
    }
    
    public static ArrayList<IProducto> getLoros(){
        dbLoros loros = new dbLoros();
        return loros.simulaDataLoros();
    }
    
}
