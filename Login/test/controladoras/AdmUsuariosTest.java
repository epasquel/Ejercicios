
package controladoras;


import org.junit.Test;
import static org.junit.Assert.*;


public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
    
    @Test
    public void siNoIngresoElUsuarioMeDebeDarError(){    
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacío");        
    }
    
    @Test
    public void siIngresoElUsuarioDebeAceptarlo(){        
        assertTrue(admUsuarios.verificarUsuario("Ebert"));
        System.out.println("Usuario ingresado");        
    }
    
    @Test
    public void siElUsuarioNoExisteDebeMandarMensaje(){        
        assertNull(admUsuarios.existeUsuario(null));
        System.out.println("Usuario Inexistente");        
    }
    
    @Test
    public void siElUsuarioExisteDebeDebeMandarMensaje(){        
        assertNotNull(admUsuarios.existeUsuario("epasquel"));
        System.out.println("Usuario Existe");        
    }
    
    @Test
    public void siElPasswordEsValidoDebeDarmeAcceso(){        
        assertTrue(admUsuarios.validarPassword("epasquel", "ebert123"));
        System.out.println("Usuario Válido");        
    }
    
    @Test
    public void siElPasswordNoEsValidoNoDebeDarmeAcceso(){        
        assertFalse(admUsuarios.validarPassword("epasquel", "ebert555"));
        System.out.println("Usuario No Válido");        
    }
    
    
    
    
}
