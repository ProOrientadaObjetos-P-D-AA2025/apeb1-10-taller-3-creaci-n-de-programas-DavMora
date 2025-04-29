
package Ejercicio5;


import java.util.Random;

public class Estudiante {
    // Atributos
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private String estado;
    
    public Estudiante() {
    }
    
    public void setNombreEstudiante(String nombre) {
        nombreEstudiante = nombre;
    }
    
    public void setCalificacion1(double nota) {
        calificacion1 = nota;
    }
    
    public void setCalificacion2(double nota) {
        calificacion2 = nota;
    }
    
    public void setCalificacion3(double nota) {
        calificacion3 = nota;
    }
    
    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    
    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }
    

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    
    public double getCalificacion1() {
        return calificacion1;
    }
    
    public double getCalificacion2() {
        return calificacion2;
    }
    
    public double getCalificacion3() {
        return calificacion3;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public String getEstado() {
        return estado;
    }
    
   
    public String toString() {
        return String.format("Nombre del Estudiante: "
                + "Calificacion 1: "
                + "Calificacion 2: "
                + "Calificacion 3: "
                + "Promedio: "
                + "Estado: ",
                getNombreEstudiante(), getCalificacion1(), getCalificacion2(), getCalificacion3(),
                getPromedio(), getEstado());
    }
}



