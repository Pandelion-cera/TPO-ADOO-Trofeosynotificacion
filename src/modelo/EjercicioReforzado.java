package modelo;

public class EjercicioReforzado extends Decorado{


    public EjercicioReforzado(Ejercicio ejercicio) {
        super(ejercicio);
    }
    
    public void modificarSets(){  
        ejercicio.setSets(ejercicio.getSets() * 2);
        
    }
    
    public void modificarRepeticiones(){
        ejercicio.setRepeticiones(ejercicio.getRepeticiones() * 2);
    }
    
    
    
    
}
