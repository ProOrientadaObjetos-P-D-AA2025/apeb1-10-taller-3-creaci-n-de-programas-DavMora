/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;


public class Profesor {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor() {
    }

    public Profesor(String nombreProfesor, String apellidoProfesor, String cedulaProfesor, double sueldoBasicoProfesor) {
        nombre = nombreProfesor;
        apellido = apellidoProfesor;
        cedula = cedulaProfesor;
        sueldoBasico = sueldoBasicoProfesor;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreProfesor) {
        nombre = nombreProfesor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoProfesor) {
        apellido = apellidoProfesor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedulaProfesor) {
        cedula = cedulaProfesor;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasicoProfesor) {
        sueldoBasico = sueldoBasicoProfesor;
        calcularSueldoTotal();
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String toString() {
        return String.format("Profesor: Cédula: Sueldo Básico: Sueldo Total: ",
                nombre, apellido, cedula, sueldoBasico, sueldoTotal);
    }
}

