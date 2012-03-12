
package veterinaria;

import sun.misc.JavaAWTAccess;


public class Main {    
    
    
    public static void main(String[] args) {
        
        Cliente objCliente = new Cliente();
        
        
        objCliente.setNombre("Ebert Pasquel");
        objCliente.setTelefono("4626477");
        objCliente.setDireccion("Mz A Lote 13 Sector F Los Angeles");
        
        Mascota objMascota = new Mascota();
        objMascota.setNombre("Dino");
        objMascota.setTipo("Ave");
        objMascota.setEdad(2);
        objCliente.AddMascota(objMascota);
        
        objMascota = new Mascota();
        objMascota.setNombre("Nube");
        objMascota.setTipo("Ave");
        objMascota.setEdad(1);
        objCliente.AddMascota(objMascota);
        
        System.out.println("Las mascotas de los clientes son :");
        for (Mascota miMascota: objCliente.getMascotas()){
            System.out.println(miMascota.getNombre() + "," );
        }
        
        //System.out.println(objCliente.);
        
        
        
    }
}
