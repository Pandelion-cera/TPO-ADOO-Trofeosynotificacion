package implementaciones;

import modelo.Notificacion;
import servicio.NotificacionFireBase;

public interface IAdapterNotificacion {

    public void enviar(Notificacion notificacion);
    
}
