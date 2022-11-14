package modelo;

import implementaciones.IAdapterNotificacion;

public class Notificador {
    
    private IAdapterNotificacion adapter;
    private Notificacion notificacion;
    
    public void enviar(Notificacion notificacion){
        adapter.enviar(notificacion);
    }
    
    
    
}
