
package Factory;

import appInterfaces.IProducto;
import aviario.Canario;
import aviario.Loro;
import java.util.ArrayList;


public class FactoryProducto {
    
    public static ArrayList<IProducto> getProducto(int opcion){
        ArrayList<IProducto> productos = new ArrayList<IProducto>();
        switch(opcion){
            case 1: 
                return productos = Canario.getCanarios();
            case 2: 
                return productos = Loro.getLoros();
            case 3:
                productos.addAll(Canario.getCanarios());
                productos.addAll(Loro.getLoros());
                return productos;
        }
        
        return null;
    }
    
}
