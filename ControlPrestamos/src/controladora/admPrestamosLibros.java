
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
                
    }
    
    public void simularTablaLibros(){
    
        listLibros.add(new libro("LB0001", "Los perros hambrientos", "Literatura", true));
        listLibros.add(new libro("LB0002", "La Iliada", "Literatura", true));
        listLibros.add(new libro("LB0003", "Matematica I", "Matematica", true));
        listLibros.add(new libro("LB0004", "Matematica II", "Matematica", true));
    
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
    
    public Boolean verificarCliente(String cliente){
        if (cliente != null){
            return true;
        }
        return false;    
    }
    
    public libro verificarLibro(String codLibro){
    
        simularTablaLibros();        
        libro objLibro = null;
        for (libro objLib : listLibros){
            if (objLib.getCodLibro().equals(codLibro)){
                objLibro = objLib;
            }
        }
        return objLibro;
    }
    
    
    public cliente verificarPrestamoParaDevolucion(String codCliente, String codLibro){
                
        cliente objCli = null;
        libro objLib = verificarLibro(codLibro);
        if (objLib != null){
            objCli = validarExistenciaCliente(codCliente);
        }
        
        return objCli;
                
    }
    
    
}
