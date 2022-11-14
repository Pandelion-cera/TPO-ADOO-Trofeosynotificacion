package modelo;

public abstract class Decorado extends Ejercicio {
	protected Ejercicio ejercicio; // el decorado afecta a un ejercicio
        protected GrupoMuscular grupoMuscular;
	
	public Decorado(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}
	
	public void reforzarEjercicio(){
            
        }
        
        public void actualizarGrupoMuscular(GrupoMuscular grupoMuscular){
        this.grupoMuscular = grupoMuscular; 
        
        
    }
}
