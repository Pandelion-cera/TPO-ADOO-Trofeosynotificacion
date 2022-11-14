package modelo;

import implementaciones.IALogger;
import implementaciones.IObjetivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.BajarPeso;
import servicio.Login;
import servicio.MantenerFigura;
import servicio.TonificarCuerpo;

public class Usuario {
    
    private int edad;
    private Double altura;
    private String sexo;
    private IObjetivo objetivo;
    private String usuario;
    private String password;
    private List<Medicion> mediciones = new ArrayList<>();
    private List<Trofeo> trofeos;
    private List<Rutina> rutinas;
    
    private Scanner input = new Scanner(System.in);
    
    public Usuario(){
    };

    public Usuario(int edad, Double altura, String sexo, String usuario, String password) {
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.usuario = usuario;
        this.password = password;
        this.rutinas = new ArrayList<>();
    }

    public Usuario logearUser(){
        
        System.out.println("Ingrese el usuario: (user)");
        String verficar_usuario = input.nextLine();
        System.out.println("Ingrese el password: (123)");
        String verficar_password = input.nextLine();
        
        IALogger iALogger = new Login();
        Usuario socio = iALogger.logearUser(verficar_usuario,verficar_password);
        
        return socio;
    }
    
    public void cambiarObjetivo(){
        System.out.println("Ingrese su objetivo: (1) Bajar Peso (2) Tonificar cuerpo (3) Mantener Figura");
        String opcion = input.nextLine();
        
        if(opcion.equals("1")){
            this.objetivo = new BajarPeso();
        }
        if(opcion.equals("2")){
            this.objetivo = new TonificarCuerpo();
        }
        if(opcion.equals("3")){
            this.objetivo = new MantenerFigura();
        }

    }
    
    public void actualizarRutina(){
        
        if(rutinas.isEmpty()){
            Rutina rutina = new Rutina();
            rutina.crearRutina(this);
            rutinas.add(rutina);
        } else if (rutinas.get(rutinas.size()-1).isCompleta()) {
        	Rutina rutina = new Rutina();
            rutina.crearRutina(this);
            rutinas.add(rutina);
            
            if(chequearTrofeo("Constancia")) {
            	Constancia constancia = new Constancia();
            	constancia.chequearPremio(this);
            }
            
        }

        
    }
    
    public void actualizarMedicion(){
        
        
        
        //primera medicion del usuario
        //if(mediciones.isEmpty()){
            
            System.out.println("Por favor ingrese su peso:");
            Double peso = Double.parseDouble(input.nextLine());
            
            if(mediciones.isEmpty()){
            	System.out.println("Por favor ingrese su altura:");
            	Double altura = Double.parseDouble(input.nextLine());
            	this.altura = altura;
            } else if(peso <= this.mediciones.get(mediciones.size()-1).getPesoIdeal() && chequearTrofeo("Dedicacion")) {
            	Dedicacion trofeo = new Dedicacion();
            	trofeo.chequearPremio(this);
            }
            
            System.out.println("Por favor ingrese la fecha (DD/MM/AAAA):");
            String fecha = input.nextLine();
            
            Medicion medicion = new Medicion(peso, altura, fecha);
            
            medicion.calcularPeso();
            medicion.calcularGrasa(this.sexo, this.edad);
            medicion.calcularMusculo();
            

            mediciones.add(medicion);
        //}
        
        //else{
        //    System.out.println("Su peso actual es de: " + mediciones.get(mediciones.size()-1).getPesoActual() + "y el deseado es: " + mediciones.get(mediciones.size()-1).getPesoIdeal());
        //}
            
        if(mediciones.size() >= 3 && chequearTrofeo("Creido")) {
        	Creido trofeo = new Creido();
        	trofeo.chequearPremio(this);
        }
            

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public IObjetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(IObjetivo objetivo) {
        this.objetivo = objetivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }
    
    public boolean chequearTrofeo(String trofeo) {
    	boolean fin = true;
    	
    	if(!trofeos.isEmpty()) {
    		
    		if(trofeo == "Creido") {
    			for(int i = 0; i < trofeos.size(); i++) {
    				if(trofeos.get(i) instanceof Creido) {
    					fin = false;
    				}
    			}
    		} else if(trofeo == "Constancia") {
    			for(int i = 0; i < trofeos.size(); i++) {
    				if(trofeos.get(i) instanceof Constancia) {
    					fin = false;
    				}
    			}
    		} else if(trofeo == "Dedicacion") {
    			for(int i = 0; i < trofeos.size(); i++) {
    				if(trofeos.get(i) instanceof Dedicacion) {
    					fin = false;
    				}
    			}
    		}
    		
    	}
    	
    	return fin;
    }
    
    public void otorgarTrofeo(Trofeo trofeo) {
    	this.trofeos.add(trofeo);
    }

    public List<Trofeo> getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(List<Trofeo> trofeos) {
        this.trofeos = trofeos;
    }

    public List<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(List<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + '}';
    }

}
