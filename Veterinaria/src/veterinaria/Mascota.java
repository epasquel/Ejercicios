
package veterinaria;


public class Mascota {
    
    private String nombre;
    private Integer edad;
    private String tipo;

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    
}
