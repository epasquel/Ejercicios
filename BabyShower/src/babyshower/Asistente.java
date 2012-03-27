
package babyshower;

import java.util.Calendar;


public class Asistente {

    public Asistente(String nombre, int dia, int mes, int anho) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
        
        this.calcularEdad();
    }
    
    private String nombre;
    private int dia;
    private int mes;
    private int anho;
    private int edad;

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    private void calcularEdad(){
        Calendar calendar = Calendar.getInstance();
        edad = calendar.get(Calendar.YEAR) - this.anho;
        if(calendar.get(Calendar.MONTH) < mes){
            edad = edad - 1;
        } 
        if(calendar.get(Calendar.MONTH) == this.mes){
            if(calendar.get(Calendar.DAY_OF_MONTH) < this.dia){
                edad = edad - 1;
            }
        }
        
    }
    
    public int preguntarEdad(Asistente asistente){
        return asistente.getEdad();
    }
    

}
