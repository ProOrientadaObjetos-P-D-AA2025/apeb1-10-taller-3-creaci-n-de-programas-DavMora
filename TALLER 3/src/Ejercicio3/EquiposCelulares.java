/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
public class EquiposCelulares {
    //Escribir atributos o datos
    protected String sistemaOperativo;
    protected double tamanioPantalla;
    protected double costo;
    protected String dirMac;
    protected String infoEmail;
    
    //Constructores - LLEVAN EL MISMO NOMBRE DE LA CLASE
    
    public EquiposCelulares(){
    //VACIO
    }
public EquiposCelulares (String so){
       sistemaOperativo= so;
       costo = 500;
}
public EquiposCelulares (String so, double tp){
       sistemaOperativo= so;
       tamanioPantalla= tp;
       costo = 700;
}
public EquiposCelulares (String so, double tp, String dir){
       sistemaOperativo= so;
       tamanioPantalla= tp;
       dirMac= dir;
       costo = 1000;
       
}
public EquiposCelulares (String so, double tp, String dir,String i){
       sistemaOperativo= so;
       tamanioPantalla= tp;
       dirMac= dir;
       infoEmail= i;
       costo= 1300;
}
    // Escribir metodos
    public void setsistemaOperativo(String so) {
        sistemaOperativo = so;
    }
    public String getsistemaOperativo() {
        return sistemaOperativo;
    }
    public void settamanioPantalla(double tp) {
        tamanioPantalla = tp;
    }
    public double gettamanioPantalla() {
        return tamanioPantalla;
    }
    public void CalcularCosto() {  //crear clase para calcular el costo
        int valorComercial = 875;
        int descuento = 50;
        costo = (valorComercial - descuento) * 1.15;
    }
    public double getcosto() {
        return costo;
    }
    public void setdirMac(String dir) {
        dirMac = dir;
    }
    public String getdirMac (){   
        return dirMac;
}
    public void setinfoEmail(String i) {
        sistemaOperativo = i;
    }  
    public String getinfoEmail (){
     
        return infoEmail;
}
    public void calcularCostoDatos(double v, double d){
    
        costo= (v-d) * 1.15;
 }
}


