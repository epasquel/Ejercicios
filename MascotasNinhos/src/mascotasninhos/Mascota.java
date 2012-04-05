
package mascotasninhos;


public abstract class Mascota {
    
    protected String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
