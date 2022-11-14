package servicio;

import implementaciones.IObjetivo;

public class TonificarCuerpo implements IObjetivo{
    
    private String nombre;

    public TonificarCuerpo() {
        this.nombre = "Tonificar Cuerpo";
    }

    @Override
    public void mostrarObjetivo() {
        
        
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
