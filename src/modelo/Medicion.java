package modelo;

import java.util.Date;

public class Medicion {
    
    private String fecha;
    private Double masaMuscular;
    private Double grasaCorporal ;
    private Double pesoActual;
    private Double altura;
    private Double pesoIdeal;

    public Medicion() {
    }

    public Medicion(Double pesoActual, Double altura, String fecha) {
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.fecha = fecha;
    }

    public void calcularGrasa(String sexo, int edad){    
        
        Double grasaCorporalTemp = this.pesoActual - this.pesoIdeal;
        if(grasaCorporalTemp < 0){
            this.grasaCorporal = 0.0;
        }
        else{
            this.grasaCorporal = grasaCorporalTemp;
        }
        System.out.println("Su grasa Corporal es: " + this.grasaCorporal);
    }
    
    public void calcularPeso(){
        // el IMC  promedio es de 21.7 (fuente google): IMC = peso / (altura * altura)
        this.pesoIdeal = (this.altura * 2) * 21.7;
        System.out.println("Su peso ideal es: " + this.pesoIdeal);
    }
    
    public void calcularMusculo(){
        this.masaMuscular = this.pesoActual / (altura * 2);
        System.out.println("Su masa muscular es: " + this.masaMuscular);
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(Double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public Double getGrasaCorporal() {
        return grasaCorporal;
    }

    public void setGrasaCorporal(Double grasaCorporal) {
        this.grasaCorporal = grasaCorporal;
    }

    public Double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(Double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    
    
    

    
}
