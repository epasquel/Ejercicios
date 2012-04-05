
package controller;

import Factory.FactoryProducto;
import appInterfaces.IProducto;
import java.util.ArrayList;

public class CTRLProducto {
    
    public static ArrayList getProductos(int opcion){
        return FactoryProducto.getProducto(opcion);        
    }
    
}
