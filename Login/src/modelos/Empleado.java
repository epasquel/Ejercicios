
package modelos;

public class Empleado extends Usuario{
    
     public Empleado(String codigoEmpleado, String nombre, String apellido, String userName, String password) {
        super(nombre, apellido, userName, password);
        this.codigoEmpleado = codigoEmpleado;
    }
    
    private String codigoEmpleado;

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

   
    
}
