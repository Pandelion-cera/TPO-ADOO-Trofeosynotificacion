package modelo;

import java.util.List;

public class Constancia extends Trofeo{
    
    public void chequearPremio(Usuario usuario){
    	usuario.otorgarTrofeo(this);
    	Notificacion noti = new Notificacion("Completaste una rutina al pie de la letra", "Trofeo Constancia");
    	super.notificador.enviar(noti);
    	
    }
    
}
