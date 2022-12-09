package principal;
import salud.*;

public class inicio {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la clinica");
        
        empleado martinez = new empleado();
        martinez.pedirDatos();
        martinez.pedirDatosEmpleado();
        martinez.calcularValorHonorarios(martinez.getHorasTrabajadas(), martinez.getValorHora());
        martinez.mostrarEmpleado();
    }
}