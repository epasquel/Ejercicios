
package aviario;

import appInterfaces.IAve;


public abstract class Ave implements IAve{

    public Ave(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
    protected String nombreCientifico;
    protected String fraseVolar = "Estoy volando";
    protected String fraseCantar = "Estoy cantando";

    public String getNombreCientifico() {
        return nombreCientifico;
    }
    
    public abstract String volar();
    
    public abstract String cantar();
    
}
