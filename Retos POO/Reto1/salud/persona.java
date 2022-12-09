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
    public void calculaImc() {
        double Imc;
        Imc = peso/(estatura*2);
        if(Imc < 20) 
        {
        System.out.println("\nEsta por debajo del IMC recomendado");
        }
        else if(Imc > 20 && Imc < 25) 
        {
            System.out.println("Esta en el IMC recomendado");
        }
        else 
        {
            System.out.println("Esta por encima del IMC recomendado");
        }
    }
    public void mayorEdad() {
        if(edad > 18) 
        {
            System.out.println("\nEs mayor de edad");
        }
        else 
        {
            System.out.println("Es menor de edad");
        }
    }
}