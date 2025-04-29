
package Ejercicio3;

import java.util.Scanner;    
public class EjecutarEquiposCelulares {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         //Crear variables iguales a los atributos
         String s= "IOS 18.4.1";
         double p= 15.3;
         String dm= "12.22.22.33";
         String im= "neojrgnoenr";
         
         //3.Crear el objeto- iphone
         EquiposCelulares iphone = new EquiposCelulares (); // se escribe asi por el nombre del molde donde programamos todo
         EquiposCelulares iphone16 = new EquiposCelulares (); 
         EquiposCelulares iphone15 = new EquiposCelulares (); 
       
         
         //Invocar los metodos set para asociarlos a los objetos
         
         iphone.setsistemaOperativo(s);
         iphone.setdirMac(dm);
         iphone.settamanioPantalla(p);
         iphone.setinfoEmail(im);
         
         //invocar metodos para calcular
         
         iphone.CalcularCosto();
         
         //5. Invoco a obtener datos
         System.out.println("");
         System.out.println("------------------");
         System.out.println("Los datos del iphone son: ");
         System.out.println("SO: " + iphone.getsistemaOperativo());
         System.out.println("TP" + iphone.gettamanioPantalla() + "Pulgadas");
         System.out.println("Costo $" + iphone.getcosto());
         System.out.println("DIRECCION MAC:" + iphone.getdirMac());
         System.out.println("InfoEmail:" + iphone.getinfoEmail());
         
         //objeto iphone16
       iphone16.sistemaOperativo="Javier";
       iphone16.dirMac ="22.22.22.22";
       iphone16.tamanioPantalla=23.5;
       iphone16.infoEmail="VICHEPALACIOS";
       
           System.out.println("");
         System.out.println("------------------");
         System.out.println("Los datos del iphone son: ");
         System.out.println("SO: " + iphone16.getsistemaOperativo());
         System.out.println("TP: " + iphone16.gettamanioPantalla() + "Pulgadas");
         System.out.println("Costo $" + iphone16.getcosto());
         System.out.println("DIRECCION MAC:" + iphone16.getdirMac());
         System.out.println("InfoEmail:" + iphone16.getinfoEmail());
         
         //Iphone 15 + datos con scanner
         String so;
         double pt;
         String dir;
         String IEmail;
         double valor;
         double descuento;
         
         System.out.println("Ingrese los datos del iphone 15");
         System.out.println("---------");
         System.out.println("Ingrese el SO:");
         so = teclado.nextLine();
         System.out.println("Ingrese el tamaño de la pamtalla");
         pt = teclado.nextDouble();
         System.out.println("Ingrese la direccion mac:");
         dir= teclado.nextLine();
         System.out.println("Ingrese el IMEI:");
         IEmail= teclado.nextLine();  
         System.out.println("Ingrese el valor comercial: ");
         valor = teclado.nextDouble();
           System.out.println("Ingrese el descuento");
           descuento = teclado.nextDouble();
    //Invocar set
    
    iphone15.setsistemaOperativo(so);
    iphone15.settamanioPantalla(pt);
    iphone15.setdirMac(dir);
    iphone15.setinfoEmail(IEmail);
    
        
    //CREACION DE OBJETO A TRAVES DEL CONSTRUCTOR CON SO
      EquiposCelulares iphone13 = new EquiposCelulares ("18.5",15); 
      iphone13.dirMac= "43455";
      iphone13.infoEmail= "HGTRTJY";
       System.out.println("");
         System.out.println("------------------");
         System.out.println("Los datos del iphone son: ");
         System.out.println("SO: " + iphone13.getsistemaOperativo());
         System.out.println("TP: " + iphone13.gettamanioPantalla() + "Pulgadas");
         System.out.println("Costo $" + iphone13.getcosto());
         System.out.println("DIRECCION MAC:" + iphone13.getdirMac());
         System.out.println("InfoEmail:" + iphone13.getinfoEmail());
    }
    
    
}

