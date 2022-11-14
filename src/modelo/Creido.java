package modelo;

import java.util.List;

public class Creido extends Trofeo{
    
    public void chequearPremio(Usuario usuario){
    	List<Medicion> mediciones = usuario.getMediciones();
    	String[] fecha1;
    	String[] fecha2;
    		
    	fecha1 = mediciones.get(mediciones.size()-4).getFecha().split("/");
        fecha2 = mediciones.get(mediciones.size()-1).getFecha().split("/");
    		
    	if(Integer.parseInt(fecha2[1]) - Integer.parseInt(fecha1[1]) <= 1 && Integer.parseInt(fecha2[0]) <= Integer.parseInt(fecha1[0]) && Integer.parseInt(fecha1[2]) == Integer.parseInt(fecha2[2])) {
    		usuario.otorgarTrofeo(this);
    		notificadoPor(usuario);
    	}
    	
    }
    
    public void notificadoPor(Usuario usuario){
        Notificacion noti = new Notificacion("Te pesaste 3 veces en un mes", "Trofeo Creido");
        super.notificador.enviar(noti);
        System.out.println("Se envio notificacion de trofeo \"Creido\"");
    }
}
