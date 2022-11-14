package modelo;

public class Notificacion {
    
    private String mensaje;
    private String titulo;
    
    
	public Notificacion(String mensaje, String titulo) {
		super();
		this.mensaje = mensaje;
		this.titulo = titulo;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getEmail() {
		return titulo;
	}
	public void setEmail(String email) {
		this.titulo = email;
	}
    
}
