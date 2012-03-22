
package calificaciones;


public abstract class  Calificacion {

    public Calificacion() {
        this.examenParcial = 0.0;
        this.examenFinal = 0.0;
    }
    
    protected double examenParcial;
    protected double examenFinal;

    public abstract double calcularPromedioFinal();

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getExamenParcial() {
        return examenParcial;
    }

    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }
    


    
}
