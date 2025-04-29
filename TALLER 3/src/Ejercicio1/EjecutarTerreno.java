/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;


import java.util.Scanner;

public class EjecutarTerreno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
     
        Terreno terreno1 = new Terreno();
        
      
        double ancho, largo, valorMetroCuadrado;
        
       
        System.out.println("Ingrese el ancho del terreno en metros:");
        ancho = teclado.nextDouble();
        
        System.out.println("Ingrese el largo del terreno en metros:");
        largo = teclado.nextDouble();
        
        System.out.println("Ingrese el valor del metro cuadrado:");
        valorMetroCuadrado = teclado.nextDouble();
        
        
        terreno1.setAncho(ancho);
        terreno1.setLargo(largo);
        terreno1.setValorMetroCuadrado(valorMetroCuadrado);
        
  
        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();
        
   
        System.out.println("");
        System.out.println(terreno1.toString());
    }
}


    

