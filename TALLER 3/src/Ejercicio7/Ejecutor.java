/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;


public class Ejecutor {

    public static void main(String[] args) {
        // Crear objetos Automotor y asignar valores usando el constructor
        Automotor automotor1 = new Automotor("123456789", "Toyota", 2015, 20000);
        Automotor automotor2 = new Automotor("987654321", "Honda", 2018, 25000);

        // Mostrar resultados utilizando toString()
        System.out.println(automotor1.toString());
        System.out.println(automotor2.toString());
    }
}


