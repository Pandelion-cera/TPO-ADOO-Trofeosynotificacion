package servicio;

import implementaciones.IALogger;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class Login implements IALogger{
    
    //LISTA DE USUARIOS PARA TESTEAR - PODRIA SER CHEQUEADA EN UNA BASE DE DATOS
    private List<Usuario> usuarios = new ArrayList<>();
    

    @Override
    public Usuario logearUser(String usuario, String password) {
        
        usuarios.add(new Usuario(25, 1.8, "Masculino", "user", "123"));
        Usuario usuario_nuevo = null;
        
        for (Usuario user : usuarios) {
            if (user.getUsuario().equals(usuario) && user.getPassword().equals(password)){
                usuario_nuevo = new Usuario();
                usuario_nuevo = user; 
            }
        }
           
        return usuario_nuevo;
    }
    
}
