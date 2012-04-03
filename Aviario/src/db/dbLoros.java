
package db;

import aviario.Canario;
import aviario.Loro;
import java.util.ArrayList;


public class dbLoros {
    
        public ArrayList simulaDataLoros(){
        ArrayList loros = new ArrayList();
        Loro loro1 = new Loro("Lorous", "L01", "Loro rojo", 58.00);
        Loro loro2 = new Loro("Lorous Rarus", "L02", "Loro verde", 95.00);
        Loro loro3 = new Loro("Lorous Bonitus", "L03", "Loro amarillo", 46.00);
        loros.add(loro1);
        loros.add(loro2);
        loros.add(loro3);
        return loros;
    }
    
}
