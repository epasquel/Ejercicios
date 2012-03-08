
package calculadoraestadistica;

import java.util.ArrayList;


public class Calculadora {
    
    
    private ArrayList<Dato> operandos;
    
    public Calculadora(){
        
        operandos = new ArrayList<Dato>();
                
    }
    
    public void AddDato(double valor){
        
        operandos.add(new Dato(valor));
        
    }
    
    public ArrayList<Dato> getOperandos(){
        
        return operandos;
        
    }
    
    public double getSuma(){
        
        double resultado = 0;
        for (Dato p : operandos)
        {
            resultado += p.getValor();
        }
        
        return resultado;
    }
    
    public double getMax(){
        
        double resultado = 0;
        for (Dato p : operandos)
        {
            if (p.getValor() > resultado ){
                resultado = p.getValor();
            }
            
        }
        
        return resultado;
        
    }
    
    public double getMin(){
        double resultado = 0;
        int cont = 1;
        for (Dato p : operandos)
        {
            if (cont == 1){
                resultado = p.getValor();
            }else{
                if (p.getValor() < resultado ){
                    resultado = p.getValor();
                }
            }
            cont ++;
        }
        
        return resultado;
    }
    
    public int getCantidadOperandos(){
        
        return operandos.size();
        
    }
    
    public double getPromedio(){
        
        int cant = getCantidadOperandos();
        return (cant == 0) ? 0 :  getSuma()/cant;
                
    }
    
}
