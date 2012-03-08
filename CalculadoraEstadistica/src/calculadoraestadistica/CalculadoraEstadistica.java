
package calculadoraestadistica;


public class CalculadoraEstadistica {


    public static void main(String[] args) {
       
        Calculadora objCalc = new Calculadora();
        objCalc.AddDato(12.0);
        objCalc.AddDato(18.0);
        objCalc.AddDato(7.0);
        
       //  objCalc.getOperandos().size(); devuelve el tamaño del arreglo
        
        for ( Dato p : objCalc.getOperandos() ) {
            System.out.println(p.getValor());
        }
        
        System.out.println( "La suma es " + objCalc.getSuma());
        System.out.println("El máximo es " + objCalc.getMax());
        System.out.println("La mínimo es " + objCalc.getMin());
        System.out.println("El promedio es " + objCalc.getPromedio());
        
    }
}
