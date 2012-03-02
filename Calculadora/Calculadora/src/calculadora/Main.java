
package calculadora;


public class Main {

    public static void main(String[] args) {

        Calculadora objCalc = new  Calculadora();
        
       System.out.println(objCalc.suma(4,5));
       System.out.println(objCalc.resta(8,5));
       System.out.println(objCalc.producto(4,5));
       System.out.println(objCalc.cociente(10,0));
       
    }

}
