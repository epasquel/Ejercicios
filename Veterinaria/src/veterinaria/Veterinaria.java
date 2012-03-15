
package veterinaria;
import java.util.ArrayList;

public class Veterinaria {
    
    public Veterinaria(){
        Clientes = new ArrayList<Cliente>();
    }
    
    private ArrayList<Cliente> Clientes;

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }
    
    public void AddCliente(Cliente objCliente){
        Clientes.add(objCliente);        
    }
    
    public Cliente getObjClienteFindBy(String nombreCliente){
    
        Cliente varCliente = new Cliente();
        for (Cliente miCliente : getClientes()){
            if (miCliente.getNombre().equals(nombreCliente) ){
                varCliente = miCliente;
            }
        }
        return varCliente;
    }
    
}
