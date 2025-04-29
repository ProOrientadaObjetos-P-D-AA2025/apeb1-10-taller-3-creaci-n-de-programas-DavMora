/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class EquivalenteHora {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
  
    public EquivalenteHora() {
    }
    
 
    public EquivalenteHora(double h) {
        horas = h;
        calcularEquivalencias();
    }
    
    
    public void calcularEquivalencias() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }
    
    
   
    public String toString() {
        return String.format("Equivalente de  horas:"
                + "Minutos: "
                + "Segundos: "
                + "Dias: ",
                horas, minutos, segundos, dias);
    }
}

