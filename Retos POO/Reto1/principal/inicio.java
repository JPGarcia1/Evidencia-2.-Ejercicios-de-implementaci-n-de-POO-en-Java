package principal;
import salud.*;

public class inicio {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la clinica");
        
        persona paciente = new persona();
        paciente.pedirDatos();
        paciente.mostraPersona();
        paciente.calculaImc();
        paciente.mayorEdad();
    }
}