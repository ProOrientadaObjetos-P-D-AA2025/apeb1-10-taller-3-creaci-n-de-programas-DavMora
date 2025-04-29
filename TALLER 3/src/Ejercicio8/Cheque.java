/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;


public class Cheque {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque() {
    }

    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        nombreCliente = nombreCliente;
        nombreBanco = nombreBanco;
        valorCheque = valorCheque;
        calcularComision();  
    }

    public void calcularComision() {
        comisionBanco = (valorCheque * 0.003) / 100;  
    }

 
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        valorCheque = valorCheque;
        calcularComision();  
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

  
    public String toString() {
        return String.format("Cheque: Cliente: Banco: Valor del Cheque: Comisión del Banco: ",
                nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}


