package salud;

import java.util.Scanner;

public class empleado extends persona {
    String cargo, departamento;
    int horasTrabajadas;
    double valorHora;

    Scanner sc = new Scanner(System.in);

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public empleado(){}
    
    public empleado(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, double peso,
            double estatura, String cargo, String departamento, int horasTrabajadas, double valorHora) {
        super(tipoDoc, nombre, apellido, sexo, documento, edad, peso, estatura);
        this.cargo = cargo;
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public void pedirDatosEmpleado()
    {
        System.out.println("Por favor digite el cargo del empleado: ");
        cargo = sc.next();
        System.out.println("Por favor digite el departamento del empleado: ");
        departamento = sc.next();
        System.out.println("Por favor digite el total de horas en las que trabajo el empleado: ");
        horasTrabajadas = sc.nextInt();
        System.out.println("Por favor digite el valor por hora: ");
        valorHora = sc.nextDouble();
    }

    public double calcularValorHonorarios(int horasTrabajadas, double valorHora)
    {
        double totalAPagar = (horasTrabajadas * valorHora) - 0.966 / (horasTrabajadas * valorHora);
        return totalAPagar;
    }

    public void mostrarEmpleado()
    {
        System.out.println("\nNumero documento: "+getDocumento()+"\nTipo documento: "
        +getTipoDoc()+"\nNombre: "+getNombre()+"\nApellido: "+getApellido()
        +"\nCargo: "+cargo+"Departamento: "+departamento+"\nHoras trabajadas: "+horasTrabajadas
        +"\nValor por hora: $"+valorHora+"\nTotal a pagar: $"+calcularValorHonorarios(horasTrabajadas, valorHora));
    }
}