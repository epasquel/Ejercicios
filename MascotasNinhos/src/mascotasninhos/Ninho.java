
package mascotasninhos;


public class Ninho {

    public Ninho(String nombre) {
        this.nombre = nombre;
    }
    
    private String nombre;
    private Ninho hermano;
    private Colegio colegio;
    private Mascota mascota;

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Ninho getHermano() {
        return hermano;
    }

    public void setHermano(Ninho hermano) {
        this.hermano = hermano;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }
    
}
