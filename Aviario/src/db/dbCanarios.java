
package db;

import aviario.Canario;
import java.util.ArrayList;


public class dbCanarios {
    
    public ArrayList simulaDataCanarios(){
        ArrayList canarios = new ArrayList();
        Canario canario1 = new Canario("Canarius", "C01", "Canario rojo", 16.00);
        Canario canario2 = new Canario("Canarius Rarus", "C02", "Canario verde", 21.00);
        Canario canario3 = new Canario("Canarius Bonitus", "C03", "Canario amarillo", 6.00);
        canarios.add(canario1);
        canarios.add(canario2);
        canarios.add(canario3);
        return canarios;
    }
}
