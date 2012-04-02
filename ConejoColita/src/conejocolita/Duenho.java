
package conejocolita;

import java.util.ArrayList;


public class Duenho {
    
    private ArrayList<String> nombres;    
    private int edad;
    private ArrayList<Mascota> listMascota;
    
    public String getNombre() {
        String retornado = "";
        for ( String nombre : nombres){
            retornado = retornado + ((retornado == "") ? "": ";") + nombre;
        }
        return retornado;
    }    

    public Duenho(ArrayList<String> nombre, int edad, ArrayList<Mascota> listMascota) {
        this.nombres = nombre;
        this.edad = edad;
        this.listMascota = listMascota;
    }
    
    public ArrayList<Mascota> getMascota(){
        return listMascota;
    }
    
    public String tocarOreja(String tipo){        
        String mensaje = "";
        for (Mascota mascota: listMascota){
            if (tipo == "Conejo"){
                mensaje = mascota.moverCola();
            }
        }
        return mensaje;
    }
    
    public String mostrarZanahoria(String tipo){
        String mensaje = "";
        for (Mascota mascota: listMascota){
            if (tipo == "Conejo"){
                mensaje = mascota.acercarse();
            }
        }
        return mensaje;
    }
    
    public String darAlpiste(String tipo){
        String mensaje = "";
        for (Mascota mascota: listMascota){
            if (tipo == "Canario"){
                mensaje = mascota.cantar();
            }
        }
        return mensaje;
    }
    
}
