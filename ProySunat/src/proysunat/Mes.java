
package proysunat;


public class Mes {

    private double Enero;

    public double getAbril() {
        return Abril;
    }

    public void setAbril(double Abril) {
        this.Abril = Abril;
    }

    public double getAgosto() {
        return Agosto;
    }

    public void setAgosto(double Agosto) {
        this.Agosto = Agosto;
    }

    public double getDiciembre() {
        return Diciembre;
    }

    public void setDiciembre(double Diciembre) {
        this.Diciembre = Diciembre;
    }

    public double getEnero() {
        return Enero;
    }

    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    public double getFebrero() {
        return Febrero;
    }

    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    public double getJulio() {
        return Julio;
    }

    public void setJulio(double Julio) {
        this.Julio = Julio;
    }

    public double getJunio() {
        return Junio;
    }

    public void setJunio(double Junio) {
        this.Junio = Junio;
    }

    public double getMarzo() {
        return Marzo;
    }

    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }

    public double getMayo() {
        return Mayo;
    }

    public void setMayo(double Mayo) {
        this.Mayo = Mayo;
    }

    public double getNoviembre() {
        return Noviembre;
    }

    public void setNoviembre(double Noviembre) {
        this.Noviembre = Noviembre;
    }

    public double getOctubre() {
        return Octubre;
    }

    public void setOctubre(double Octubre) {
        this.Octubre = Octubre;
    }

    public double getSetiembre() {
        return Setiembre;
    }

    public void setSetiembre(double Setiembre) {
        this.Setiembre = Setiembre;
    }
    private double Febrero;
    private double Marzo;
    private double Abril;
    private double Mayo;
    private double Junio;
    private double Julio;
    private double Agosto;
    private double Setiembre;
    private double Octubre;
    private double Noviembre;
    private double Diciembre;

   public double pagoImpMes(double mes){
        double pago = 0;
        if (mes > 5000){
            pago = (12*mes)/100;
        }
        return pago;
    }

}
