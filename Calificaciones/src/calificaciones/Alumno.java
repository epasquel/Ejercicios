
package calificaciones;

public class Alumno {
    
    public Alumno(String codigo, String nombre, String modalidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.modalidad = modalidad;
        if (modalidad.equals("Tradicional")){
            calificacion = new CalificacionTradicional();
        }else{
            calificacion = new CalificacionPractica();
        }
        
    }
    
    private String codigo;
    private String nombre;
    private String modalidad; 
    private Calificacion calificacion;

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
