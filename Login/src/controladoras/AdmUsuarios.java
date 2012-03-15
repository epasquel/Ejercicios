
package controladoras;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.Usuario;


public class AdmUsuarios {
    
    private ArrayList<Usuario> lstUsuario = new ArrayList<Usuario>();
    
    private void simularTabla(){
        
        this.lstUsuario.add(new Empleado("001", "Ebert", "Pasquel", "epasquel", "ebert123"));
        this.lstUsuario.add(new Empleado("002", "Javier", "Pasquel", "jpasquel", "javier123"));
        this.lstUsuario.add(new Empleado("003", "Alisson", "Pasquel", "apasquel", "alisson123"));
        this.lstUsuario.add(new Empleado("004", "Bryan", "Pasquel", "bpasquel", "bryan123"));
        
    }
    
    public Boolean verificarUsuario(String user){
        
        if (user != null){
            return true;
        }
        return false;
        
    }
    
    /*Verificar que password no sea nulo*/
    public Boolean verificarPassword(String password){
        
        if (password != null){
            return true;
        }
        return false;
        
    }
    
    public Usuario existeUsuario(String userName){
        simularTabla();
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : lstUsuario){
            if(usuario.getUserName().equals(userName)){
                usuarioEncontrado = usuario;
            }            
        }
        return usuarioEncontrado;
    }
    
    public Boolean validarPassword(String userName, String password){
    
        Boolean acceso = false;
        Usuario usuarioValido = existeUsuario(userName);
        if (usuarioValido.getPassword().equals(password)){
            acceso = true;
        }
        return acceso;
    }
    
    
}
