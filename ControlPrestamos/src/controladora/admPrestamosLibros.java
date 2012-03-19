
package controladora;

import java.util.ArrayList;
import modelos.cliente;
import modelos.libro;

public class admPrestamosLibros {
    
    private ArrayList<cliente> listClientes = new ArrayList<cliente>();
    private ArrayList<libro> listLibros = new ArrayList<libro>();
    
    public void simularTabla(){
        listClientes.add(new cliente("C0001", "Ebert", "Pasquel", 1));
        listClientes.add(new cliente("C0002", "Joel", "Gamboa", 0));
        listClientes.add(new cliente("C0003", "Carlos", "Saldivar", 3));
        listLibros.add(new libro("L0001", "POO para ingenieros", "material", true));
        listLibros.add(new libro("L0002", "Etica y Ciudadania en el siglo XX", "material", true));
        listLibros.add(new libro("L0003", "Manual de urbanidad y buenas costumbres", "material", false));
        listLibros.add(new libro("L0004", "Ciencias naturales", "material", true));
        listLibros.add(new libro("L0005", "Economia y estadistica 2012", "material", false));  
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
    
    public boolean libroDisponible(String codLibro){
        
        simularTabla();        
        libro objLibro = null;
        for (libro objLib : listLibros){
            if (objLib.getCodLibro().equals(codLibro) && objLib.getFlagEnable()==true){
                return true;
            }
        }
        return false;
        
    }
    
    
    
}
