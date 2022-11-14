package servicio;

import implementaciones.IObjetivo;


public class MantenerFigura implements IObjetivo{
    
    private String nombre;

    public MantenerFigura() {
        this.nombre = "Mantener Figura";
    }

    @Override
    public void mostrarObjetivo() {
        
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
