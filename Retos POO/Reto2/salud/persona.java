package salud;

import java.util.Scanner;

public class persona {
    String tipoDoc, nombre, apellido, sexo;
    int documento, edad;
    double peso, estatura;

    Scanner sc = new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("Por favor ingrese los datos que se le solicitan sobre el paciente\nIngrese el tipo de documento: ");
        tipoDoc = sc.next();
        System.out.println("Ingrese el numero de documento: ");
        documento = sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese el apellido: ");
        apellido = sc.next();
        System.out.println("Ingrese el peso en kilogramos: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese la estatura en metros: ");
        estatura = sc.nextDouble();
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese el sexo: ");
        sexo = sc.next();
    }
    public void mostraPersona()
    {
        System.out.println("\nEstos son los datos del paciente\nTipo de documento: "+tipoDoc+"\nDocumento: "+documento+"\nNombre: "+nombre+"\nApellido: "+apellido);
        System.out.println("Peso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }
    public double calculaImc() {
        double Imc = peso/(estatura*2);
        return Imc;
    }
    public void mayorEdad() {
        if(edad > 18) 
        {
            System.out.println("Es mayor de edad");
        }
        else 
        {
            System.out.println("Es menor de edad");
        }
    }
}