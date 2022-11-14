package modelo;

import java.util.ArrayList;
import java.util.List;
import static modelo.GrupoMuscular.*;


public class Ejercicio {
    
    private String nombre;
    private int nivelAerobico;
    private int nivelMuscular;
    private int sets;
    private int repeticiones;
    private GrupoMuscular grupoMuscular;
    private Double duracion;
    private boolean completado;

    public Ejercicio() {
    }

    public Ejercicio(String nombre, int nivelAerobico, int nivelMuscular, int sets, int repeticiones, GrupoMuscular grupoMuscular, Double duracion, boolean completado) {
        this.nombre = nombre;
        this.nivelAerobico = nivelAerobico;
        this.nivelMuscular = nivelMuscular;
        this.sets = sets;
        this.repeticiones = repeticiones;
        this.grupoMuscular = grupoMuscular;
        this.duracion = duracion;
        this.completado = completado;
    }

    public void reforzarEjercicio(){
        
    }
    
    public void actualizarGrupoMuscular(GrupoMuscular grupoMuscular){
        this.grupoMuscular = grupoMuscular;  
    }
    
    public List<Ejercicio> obtenerEjercicios(){
        //es una lista con ejercicios generados para ser filtrados por la rutina segun el tipo de estrategia que se eligio
        
        List<Ejercicio> ejercicios = new ArrayList<>();
        
        Ejercicio ejercicio1 = new Ejercicio("trabajo de piernas", 3, 2, 3, 12, PIERNAS, 1.0, false);
        Ejercicio ejercicio2 = new Ejercicio("trabajo de piernas intensivo", 6, 4, 6, 24, PIERNAS, 1.5, false);
        
        ejercicios.add(ejercicio1);
        ejercicios.add(ejercicio2);
        
        Ejercicio ejercicio3 = new Ejercicio("trabajo de brazos", 3, 2, 3, 12, BRAZOS, 1.0, false);
        Ejercicio ejercicio4 = new Ejercicio("trabajo de brazos intensivo", 6, 4, 6, 24, BRAZOS, 1.5, false);
        
        ejercicios.add(ejercicio3);
        ejercicios.add(ejercicio4);
        
        Ejercicio ejercicio5 = new Ejercicio("trabajo de pecho", 3, 2, 3, 12, PECHO, 1.0, false);
        Ejercicio ejercicio6 = new Ejercicio("trabajo de pecho intensivo", 6, 4, 6, 24, PECHO, 1.5, false);
        
        ejercicios.add(ejercicio5);
        ejercicios.add(ejercicio6);
        
        Ejercicio ejercicio7 = new Ejercicio("trabajo de espalda", 3, 2, 3, 12, ESPALDA, 1.0, false);
        Ejercicio ejercicio8 = new Ejercicio("trabajo de espalda intensivo", 6, 4, 6, 24, ESPALDA, 1.5, false);
        
        ejercicios.add(ejercicio7);
        ejercicios.add(ejercicio8);
        
        Ejercicio ejercicio9 = new Ejercicio("trabajo de hombros", 3, 2, 3, 12, HOMBROS, 1.0, false);
        Ejercicio ejercicio10 = new Ejercicio("trabajo de hombros intensivo", 6, 4, 6, 24, HOMBROS, 1.5, false);
        
        ejercicios.add(ejercicio9);
        ejercicios.add(ejercicio10);
        
        
        return ejercicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public int getNivelMuscular() {
        return nivelMuscular;
    }

    public void setNivelMuscular(int nivelMuscular) {
        this.nivelMuscular = nivelMuscular;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public boolean getCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
    
    
    
}
