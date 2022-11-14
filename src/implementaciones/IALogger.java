package implementaciones;

import modelo.Usuario;

public interface IALogger {
    
    public Usuario logearUser(String usuario, String password);
    
}
