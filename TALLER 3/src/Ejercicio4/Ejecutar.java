/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;



public class Ejecutar {

    public static void main(String[] args) {

        EquipoCelular celular1 = new EquipoCelular(
                "Android 14", 
                6.5, 
                450.00, 
                12.0, 
                "00:1B:44:11:3A:B7", 
                "356789045612347"
        );
        
  
        System.out.println(celular1.toString());
    }
}

