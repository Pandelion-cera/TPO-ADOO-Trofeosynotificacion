package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.BajarPeso;
import servicio.MantenerFigura;
import servicio.TonificarCuerpo;

public class Rutina {
    
    private List<Ejercicio> ejercicios = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    public boolean isCompleta() {
    	return true;
    }
    
    public void crearRutina(Usuario usuario){
        
        Double pesoActual = usuario.getMediciones().get(usuario.getMediciones().size()-1).getPesoActual();
        Double pesoIdeal = usuario.getMediciones().get(usuario.getMediciones().size()-1).getPesoIdeal();
        
        Double masaMuscular = usuario.getMediciones().get(usuario.getMediciones().size()-1).getMasaMuscular();
        Double grasaMuscular = usuario.getMediciones().get(usuario.getMediciones().size()-1).getGrasaCorporal();
        

        
        
        if(usuario.getObjetivo() instanceof BajarPeso){
            
            //si no tiene sobre peso
            if(pesoActual - pesoIdeal <= 0){
                System.out.println("No tenes problemas de sobre peso, desea cambiar su objetivo?");
            }
            
            //si tiene sobrepeso
            else{
                System.out.println("la rutina para bajar " + (pesoActual - pesoIdeal) + " Kg");
                System.out.println("Se deberan cumplir 12 ejercicios (1 por dia) en el lapso de 4 semanas");
                
                List<Ejercicio> ejerciciosFiltrados = new Ejercicio().obtenerEjercicios();
                int cont = 0;
                int ejerciciosTotales = ejerciciosFiltrados.size()-1;
                
                while(cont < 12){
                    if(ejerciciosFiltrados.get(ejerciciosTotales).getNivelAerobico() >= 3){
                        ejercicios.add(ejerciciosFiltrados.get(ejerciciosTotales));
                        cont++;
                        ejerciciosTotales--;
                    }
                    else{
                        ejerciciosTotales--;
                    }
                    
                    if(ejerciciosTotales < 0){
                        ejerciciosTotales = ejerciciosFiltrados.size()-1;
                    }
                    
                }
                
            }

            
        }
        
        if(usuario.getObjetivo() instanceof MantenerFigura){
            System.out.println("Su peso actual es de: " + pesoActual + " y su ideal: " + pesoIdeal);
            System.out.println("Su masa muscular es: " + masaMuscular + "y el promedio es: 21.7");
            System.out.println("la rutina para mantener figura es: ");
            
            System.out.println("Se deberan cumplir 12 ejercicios (1 por dia) en el lapso de 4 semanas");
            List<Ejercicio> ejerciciosFiltrados = new Ejercicio().obtenerEjercicios();
            
            int cont = 0;
            int ejerciciosTotales = ejerciciosFiltrados.size()-1;
                
                while(cont < 12){
                    if(ejerciciosFiltrados.get(ejerciciosTotales).getNivelAerobico() >= 2 && ejerciciosFiltrados.get(ejerciciosTotales).getNivelAerobico() <= 4){
                        ejercicios.add(ejerciciosFiltrados.get(ejerciciosTotales));
                        cont++;
                        ejerciciosTotales--;
                    }
                    else{
                        ejerciciosTotales--;
                    }
                    
                    if(ejerciciosTotales < 0){
                        ejerciciosTotales = ejerciciosFiltrados.size()-1;
                    }
                    
                }
            this.ejercicios = ejerciciosFiltrados;

        }
        
        if(usuario.getObjetivo() instanceof TonificarCuerpo){
            System.out.println("la rutina para tonificar cuerpo es: ");
            List<Ejercicio> ejerciciosFiltrados = new Ejercicio().obtenerEjercicios();
                int cont = 0;
                int ejerciciosTotales = ejerciciosFiltrados.size()-1;
                while(cont < 12){
                    if(ejerciciosFiltrados.get(ejerciciosTotales).getNivelAerobico() <= 4){
                        ejercicios.add(ejerciciosFiltrados.get(ejerciciosTotales));
                        cont++;
                        ejerciciosTotales--;
                    }
                    else{
                        ejerciciosTotales--;
                    }
                    
                    if(ejerciciosTotales < 0){
                        ejerciciosTotales = ejerciciosFiltrados.size()-1;
                    }
                    
                }
                
                
        }
        verProgreso();
        
    }
    
    public void verProgreso(){
        int dia = 0;
        boolean verificadorRutinaCompletada = true;
        for (Ejercicio ejercicio : ejercicios) {
            dia++;
            System.out.println("Dia " + dia + ", " + ejercicio.getNombre() + " terminado: " + ejercicio.getCompletado());
            if(ejercicio.getCompletado()== false){
                verificadorRutinaCompletada = false;
            }
        }
        
        if(verificadorRutinaCompletada == false){
            System.out.println("Continuar Rutina? (S/N) / Si desea pesarse ingrese (P):");
            String confirmar = input.nextLine();
            if(confirmar.equals("S")){
                actualizarProgreso();
            } /*else if (confirmar.equals("P")) {
            	usuario.actualizarMedicion();
            	actualizarProgreso(usuario);
            }*/
            
            
            
        }

    }
    
    public void actualizarProgreso(){
        int dia = 0;
        for (Ejercicio ejercicio : ejercicios) {
            dia++;
            if(ejercicio.getCompletado() == false){
                System.out.println("Dia " + dia + " : " +ejercicio.getNombre());
                System.out.println("Terminado? (S/N);");
                String confirmar = input.nextLine();
                if(confirmar.equals("S")){
                    ejercicio.setCompletado(true);
                } else {
                	ejercicio.setCompletado(false);
                }                    
            }
        }
        verProgreso();
        
    }

    
}
