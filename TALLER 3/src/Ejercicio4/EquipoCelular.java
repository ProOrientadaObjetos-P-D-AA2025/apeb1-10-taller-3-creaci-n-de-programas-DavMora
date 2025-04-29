/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;



public class EquipoCelular {
    // Atributos
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaDelCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
   
    public EquipoCelular() {
    }
    

    public EquipoCelular(String so, double tp, double ci, double iva, String mac, String imei) {
        sistemaOperativo = so;
        tamanioPantalla = tp;
        costoInicial = ci;
        ivaPorcentaje = iva;
        direccionMac = mac;
        informacionImei = imei;
        calcularCostoFinal();
    }
    
    
    public void calcularCostoFinal() {
        ivaDelCostoInicial = costoInicial * (ivaPorcentaje / 100);
        costoFinal = costoInicial + ivaDelCostoInicial;
    }
    
   
    public String toString() {
        return String.format("Datos del Equipo Celular"
                + "Sistema Operativo: "
                + "Tamano Pantalla: "
                + "Costo Inicial: "
                + "IVA Porcentaje: "
                + "IVA del Costo Inicial:"
                + "Costo Final: "
                + "Direccion MAC: "
                + "Informacion IMEI: ",
                sistemaOperativo, tamanioPantalla, costoInicial, ivaPorcentaje,
                ivaDelCostoInicial, costoFinal, direccionMac, informacionImei);
    }
}

