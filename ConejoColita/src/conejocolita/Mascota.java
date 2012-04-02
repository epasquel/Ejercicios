
package conejocolita;


public class Mascota {
    
    private String nombre;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String moverCola(){
        return "Estoy moviendo la cola";
    }
    
    public String acercarse(){
        return "Me esoty acercando";
    }
    
    public String cantar(){
        return "Estoy cantando";
    }
    
}
