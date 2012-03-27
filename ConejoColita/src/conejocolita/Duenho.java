
package conejocolita;


public class Duenho {
    
    private String nombre;    
    private int edad;
    private Mascota mascota;
    
    public String getNombre() {
        return nombre;
    }    

    public Duenho(String nombre, int edad, String nombreMascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascota = new Mascota(nombreMascota);
    }
    
    public Mascota getMascota(){
        return mascota;
    }
    
    public String tocarOreja(){
        return mascota.moverCola();
    }
    
    public String mostrarZanahoria(){
        return mascota.acercarse();
    }
    
}
