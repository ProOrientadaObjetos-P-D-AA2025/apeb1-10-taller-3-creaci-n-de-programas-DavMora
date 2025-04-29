/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;


import java.util.Random;

public class Ejecutar {

    public static void main(String[] args) {
        Random rand = new Random();

        String[] nombresClientes = {"Carlos Pérez", "Ana Gómez", "Luis Rodríguez", "Pedro Sánchez"};
        String[] nombresBancos = {"Banco Nacional", "Banco de Occidente", "Banco Popular", "Banco Internacional"};

        String nombreCliente1 = nombresClientes[rand.nextInt(nombresClientes.length)];
        String nombreBanco1 = nombresBancos[rand.nextInt(nombresBancos.length)];
        double valorCheque1 = 1000 + (5000 - 1000) * rand.nextDouble();  // Valor entre 1000 y 5000

        String nombreCliente2 = nombresClientes[rand.nextInt(nombresClientes.length)];
        String nombreBanco2 = nombresBancos[rand.nextInt(nombresBancos.length)];
        double valorCheque2 = 1000 + (5000 - 1000) * rand.nextDouble();  // Valor entre 1000 y 5000

        Cheque cheque1 = new Cheque(nombreCliente1, nombreBanco1, valorCheque1);
        Cheque cheque2 = new Cheque(nombreCliente2, nombreBanco2, valorCheque2);

        System.out.println(cheque1.toString());
        System.out.println(cheque2.toString());
    }
}

