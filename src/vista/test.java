package vista;

import java.util.Scanner;

import modelo.Rutina;
import modelo.Usuario;


public class test {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        String var;
        Usuario usuario = new Usuario().logearUser();
        System.out.println("Bienvenido: ()" + usuario.getUsuario());       
        usuario.cambiarObjetivo();
        System.out.println("El objetivo es: " + usuario.getObjetivo());
        usuario.actualizarMedicion();
        
        Rutina rutina = new Rutina();
        rutina.crearRutina(usuario);
        rutina.verProgreso();
        
        System.out.println("Queres pesarte (S/N):");
    	var = input.nextLine();
    	
    	while (var != "FIN") {
    		if(usuario.getRutinas().get(usuario.getRutinas().size()-1).isCompleta()) {
    			System.out.println("Queres pesarte (S/N):");
    			var = input.nextLine();
    			
    			if(var == "S") {
    				usuario.actualizarMedicion();
    			}
    			
    			System.out.println("¿Desea comenzar una nueva rutina? (S/N):");
    			var = input.nextLine();
    			
    			if(var == "S") {
    				usuario.cambiarObjetivo();
    				rutina.crearRutina(usuario);
    		        rutina.verProgreso();
    			}
    			
        	
    		} else {
    			
    			System.out.println("¿Desea continuar la rutina? (S/N):");
    			var = input.nextLine();
        	
    			if(var == "S") {
    		        rutina.verProgreso();
    			}
    			
    		}
    		
    		System.out.println("Si desea salir del sistema escriba FIN:");
			var = input.nextLine();
    	}
    }
}
