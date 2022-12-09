package principal;

import salud.*;

public class inicio {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la clinica");
        
        persona paciente = new persona();
        paciente.pedirDatos();
        paciente.mostraPersona();
        double calculo = paciente.calculaImc();
        if(calculo < 20) 
        {
            System.out.println("PESO BAJO");
        }
        else if(calculo > 20 && calculo < 25) 
        {
            System.out.println("PESO IDEAL");
        }
        else 
        {
            System.out.println("SOBREPESO");
        }
        paciente.mayorEdad();
    }
}