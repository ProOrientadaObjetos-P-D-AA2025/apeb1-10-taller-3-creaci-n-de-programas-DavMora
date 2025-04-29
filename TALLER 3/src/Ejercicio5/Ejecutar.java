/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;



import java.util.Random;

public class Ejecutar {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        
    
        Random aleatorio = new Random();
        
        
        estudiante1.setNombreEstudiante("Carlos Mendez");
        estudiante1.setCalificacion1(1 + aleatorio.nextDouble() * 9);
        estudiante1.setCalificacion2(1 + aleatorio.nextDouble() * 9);
        estudiante1.setCalificacion3(1 + aleatorio.nextDouble() * 9);
        

        estudiante1.calcularPromedio();
        estudiante1.determinarEstado();
        
        
        System.out.println(estudiante1.toString());
    }
}

