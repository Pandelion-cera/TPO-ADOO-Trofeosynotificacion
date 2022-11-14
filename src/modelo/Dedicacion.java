package modelo;

import java.util.List;

public class Dedicacion extends Trofeo{
    
    public void chequearPremio(Usuario usuario){
    	usuario.otorgarTrofeo(this);
    	Notificacion noti = new Notificacion("Alcanzaste tu objetivo", "Trofeo dedicacion");
    	super.notificador.enviar(noti);
    }
}
