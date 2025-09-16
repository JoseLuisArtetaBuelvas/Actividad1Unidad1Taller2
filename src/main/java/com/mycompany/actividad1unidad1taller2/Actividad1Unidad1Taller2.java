/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1unidad1taller2;

/**
 *
 * @author Zaduke
 */
public class Actividad1Unidad1Taller2 {

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Clase Producto ===");
        Producto producto1 = new Producto("Laptop", 1500.99);
        producto1.mostrarProducto();
        
        System.out.println("\n=== Ejercicio 2: Clase Estudiante ===");
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarEstudiante();
        
        Estudiante estudiante2 = new Estudiante("Juan", 20); 
        estudiante2.mostrarEstudiante();
        
        System.out.println("\n=== Ejercicio 3: Métodos corregidos ===");
        EjemploErrores.metodoCorregido(); 
        
        EjemploErrores ejemplo = new EjemploErrores();
        ejemplo.metodoDeInstancia();
    }
}
