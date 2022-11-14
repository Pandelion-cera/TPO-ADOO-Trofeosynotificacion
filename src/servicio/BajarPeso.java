package servicio;

import implementaciones.IObjetivo;


public class BajarPeso implements IObjetivo{

    private String nombre;

    public BajarPeso() {
        this.nombre = "Bajar Peso";
    }

    @Override
    public void mostrarObjetivo() {
        System.out.println("El entrenamiento constara de 1 hora a 1 hora y media de entrenamiento");
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
