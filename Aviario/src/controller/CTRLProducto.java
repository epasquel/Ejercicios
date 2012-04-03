
package controller;

import appInterfaces.IProducto;
import aviario.Canario;
import aviario.Loro;
import aviario.Producto;
import java.util.ArrayList;

public class CTRLProducto {
    
    public static ArrayList getProductos(int opcion){
        ArrayList<IProducto> canarios = Canario.getCanarios();
        ArrayList<IProducto> loros = Loro.getLoros();
        
        switch(opcion){
            case 1: 
                return canarios;
            case 2: 
                return loros;
            case 3:
                ArrayList<IProducto> productos = new ArrayList<IProducto>();
                productos.addAll(canarios);
                productos.addAll(loros);                        
                return productos;
        }
        return null;
        
    }
    
}
