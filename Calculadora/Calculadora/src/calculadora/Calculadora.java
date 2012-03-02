
package calculadora;


public class Calculadora {
                
    private int operando1;
    private int operando2;

    public int suma(int operando1, int operando2){
        int resultado = operando1 + operando2;
        return resultado;
    }

    public int resta(int operando1, int operando2){
        int resultado = operando1 - operando2;
        return resultado;
    }

    public int producto(int operando1, int operando2){
        int resultado = operando1 * operando2;
        return resultado;
    }

    private boolean esCero(int numero){
        if (numero == 0){
            return true;
        }else{
            return false;
        }

    }

    public int cociente(int operando1, int operando2){
        if(esCero(operando2)){
            return 0;
        }else{
            return operando1 / operando2;
        }

    }
}
