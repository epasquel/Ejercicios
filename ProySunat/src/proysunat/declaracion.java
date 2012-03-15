
package proysunat;

import java.util.ArrayList;


public class declaracion {

    private String codigo;
    private String nombre;
    private String apellido;
    private Mes listMes;

    public Mes getLisMes() {
        return listMes;
    }

    public void setLisMes(Mes lisMes) {
        this.listMes = lisMes;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double pagoImpMes(double mes){
        double pago = 0;
        if (mes < 5000){
            pago = (12*mes)/100;
        }
        return pago;
    }
    
    public double pagoImpAnual(){
        double pago = 0;
        double suma = 0.00;
        int valorMes = 1;
        for (int i = 1; i <= 12 ; i++){
            if (valorMes == 1){ suma = suma  + listMes.getEnero(); }
            if (valorMes == 2){ suma = suma  + listMes.getFebrero(); }
            if (valorMes == 3){ suma = suma  + listMes.getMarzo(); }
            if (valorMes == 4){ suma = suma  + listMes.getAbril(); }
            if (valorMes == 5){ suma = suma  + listMes.getMayo(); }
            if (valorMes == 6){ suma = suma  + listMes.getJunio(); }
            if (valorMes == 7){ suma = suma  + listMes.getJulio(); }
            if (valorMes == 8){ suma = suma  + listMes.getAgosto(); }
            if (valorMes == 9){ suma = suma  + listMes.getSetiembre(); }
            if (valorMes == 10){ suma = suma  + listMes.getOctubre(); }
            if (valorMes == 11){ suma = suma  + listMes.getNoviembre(); }
            if (valorMes == 12){ suma = suma  + listMes.getDiciembre(); }

        }

        if(suma > 24000){
            double diferencia = suma - 24000;
            pago = (30*diferencia)/100;

        }

        return pago;
    }


}
