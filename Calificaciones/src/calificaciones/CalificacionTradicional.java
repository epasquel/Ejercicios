
package calificaciones;

public class CalificacionTradicional extends Calificacion{
    private double pc1;
    private double pc2;

    public CalificacionTradicional() {
        super();
        this.pc1 = 0.0;
        this.pc2 = 0.0;
    }

    public double getPc1() {
        return pc1;
    }

    public void setPc1(double pc1) {
        this.pc1 = pc1;
    }

    public double getPc2() {
        return pc2;
    }

    public void setPc2(double pc2) {
        this.pc2 = pc2;
    }
    
    
    public double calcularPromedioFinal(){
        return (examenFinal * 0.30) + (examenParcial * 0.30) + (pc1 * 0.20) + (pc2 * 0.20);
    }
        
}
