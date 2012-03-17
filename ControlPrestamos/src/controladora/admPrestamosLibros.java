
package controladora;

import java.util.ArrayList;
import modelos.cliente;

public class admPrestamosLibros {
    
    private ArrayList<cliente> listClientes = new ArrayList<cliente>();
    
    public void simularTabla(){
        listClientes.add(new cliente("C0001", "Ebert", "Pasquel", 1));
        listClientes.add(new cliente("C0002", "Joel", "Gamboa", 0));
        listClientes.add(new cliente("C0003", "Carlos", "Saldivar", 3));
    }
    
    public cliente validarExistenciaCliente(String codCliente){
        
        simularTabla();        
        cliente objCliente = null;
        for (cliente objCli : listClientes){
            if (objCli.getCodCliente().equals(codCliente)){
                objCliente = objCli;
            }
        }
        return objCliente;
        
    }
    
    public Boolean puedeSolicitarLibro(String codCliente){
        
        Boolean succes = false;
        cliente objCli = validarExistenciaCliente(codCliente);
        if (objCli.getCanPrestamos() < 3){
            succes = true;
        }
        return succes;
    }
    
    
    
}
