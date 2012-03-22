
package calificaciones;


public class CalificacionPractica extends Calificacion{

    public CalificacionPractica() {
        super();
        this.t1 =0.0;
        this.t2 = 0.0;
        this.proyecto = 0.0;
    }
    
    private double t1;
    private double t2;
    private double proyecto;    

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double calcularPromedioFinal(){
        return (examenFinal * 0.15) + (examenParcial * 0.25) + (t1 * 0.10) + (t2 * 0.10) + (proyecto * 0.40);
    }
    
}
