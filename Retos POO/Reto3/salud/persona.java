package salud;

import java.util.Scanner;

public class persona {
    String tipoDoc, nombre, apellido, sexo;
    int documento, edad;
    double peso, estatura;

    Scanner sc = new Scanner(System.in);
    
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public persona(){}

    public persona(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, double peso, double estatura) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public void pedirDatos()
    {
        System.out.println("Por favor ingrese los datos que se le solicitan sobre el paciente\nIngrese el tipo de documento: ");
        setTipoDoc(sc.next());
        System.out.println("Ingrese el numero de documento: ");
        setDocumento(sc.nextInt());
        System.out.println("Ingrese el nombre: ");
        setNombre(sc.next());
        System.out.println("Ingrese el apellido: ");
        setApellido(sc.next());
        System.out.println("Ingrese el peso en kilogramos: ");
        setPeso(sc.nextDouble());
        System.out.println("Ingrese la estatura en metros: ");
        setEstatura(sc.nextDouble());
        System.out.println("Ingrese la edad: ");
        setEdad(sc.nextInt());
        System.out.println("Ingrese el sexo: ");
        setSexo(sc.next());
    }
    public void mostraPersona()
    {
        System.out.println("\nEstos son los datos del paciente\nTipo de documento: "+getTipoDoc()+"\nDocumento: "+getDocumento()+"\nNombre: "+getNombre()+"\nApellido: "+getApellido());
        System.out.println("Peso: "+getPeso()+"\nEstatura: "+getEstatura()+"\nEdad: "+getEdad()+"\nSexo: "+getSexo());
    }
    public void calculaImc(Double peso, double estatura) {
        double pesoActual;
        pesoActual = peso/(estatura*2);
        if(pesoActual < 20) 
        {
        System.out.println("\nEsta por debajo del IMC recomendado");
        }
        else if(pesoActual > 20 && pesoActual < 25) 
        {
            System.out.println("Esta en el IMC recomendado");
        }
        else 
        {
            System.out.println("Esta por encima del IMC recomendado");
        }
    }
    public void mayorEdad(int edad) {
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