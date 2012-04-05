
package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        int[] arreglo = new int[10];
        int resultado;
        
        try{
            arreglo[2] = 10;
            resultado = 9/0;
        }catch(java.lang.ArrayIndexOutOfBoundsException ex){
            System.out.println("Error en el programa!");
            System.out.println("No existe el índice: " + ex.getMessage());
        }catch(java.lang.ArithmeticException ex){
            System.out.println("No se puede dividir: " + ex.getMessage());
        }
        
    }
}
