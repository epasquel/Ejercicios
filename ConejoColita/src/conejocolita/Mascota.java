
package conejocolita;


public class Mascota {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public String moverCola(){
        return "Estoy moviendo la cola";
    }
    
    public String acercarse(){
        return "Me esoty acercando";
    }
    
}
