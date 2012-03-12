
package veterinaria;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Cliente {
    
    public Cliente(){
        mascotas = new ArrayList<Mascota>();                
    }
    
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Mascota> mascotas;

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascota(ArrayList<Mascota> lstmascota) {
        this.mascotas = lstmascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void AddMascota(Mascota objMascota){
        mascotas.add(objMascota);
    }
            
    
    
}
