/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;


public class Automotor {
    private String cedulaDueno;
    private String marca;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

   
    public Automotor() {
    }


    public Automotor(String cedulaDueno, String marca, int añoFabricacion, double valorVehiculo) {
        cedulaDueno = cedulaDueno;
        marca = marca;
        añoFabricacion = añoFabricacion;
        valorVehiculo = valorVehiculo;
        calcularValorMatricula();  
    }

    public void calcularValorMatricula() {
        int antiguedad = 2025 - añoFabricacion;  
        valorMatricula = (valorVehiculo * 0.002 / 100) * antiguedad;
    }

    // Métodos `get` y `set`
    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        cedulaDueno = cedulaDueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        añoFabricacion = añoFabricacion;
        calcularValorMatricula();  
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        valorVehiculo = valorVehiculo;
        calcularValorMatricula();  
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

   
    public String toString() {
        return String.format("Automotor: Cédula del dueño: Marca: Año de fabricación: Valor del vehículo: Valor de la matrícula: ",
                marca, cedulaDueno, marca, añoFabricacion, valorVehiculo, valorMatricula);
    }
}
