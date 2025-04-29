
package Ejercicio1;

public class Terreno {
    
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
  
    public Terreno() {
    }
    
  
    public void setAncho(double a) {
        ancho = a;
    }
    
    public void setLargo(double l) {
        largo = l;
    }
    
    public void setValorMetroCuadrado(double vmc) {
        valorMetroCuadrado = vmc;
    }
   
    
    public double getAncho() {
        return ancho;
    }
    
    public double getLargo() {
        return largo;
    }
    
    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getCostoTerreno() {
        return costoTerreno;
    }
    

    public void calcularArea() {
        area = largo * ancho;
    }
    

    public void calcularCostoTerreno() {
        costoTerreno = valorMetroCuadrado * area;
    }
    

    public String toString() {
        return String.format("Datos del Terreno\n"
                + "Ancho: "
                + "Largo: "
                + "Área: "
                + "Valor por metro cuadrado: "
                + "Costo total del terreno: ",
                ancho, largo, area, valorMetroCuadrado, costoTerreno);
    }
}



