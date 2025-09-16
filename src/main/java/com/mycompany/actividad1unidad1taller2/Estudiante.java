/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1unidad1taller2;

/**
 *
 * @author Zaduke
 */
public class Estudiante {
    private String nombre;
    private int edad;
    
    public Estudiante() {
        this("Sin nombre", 0);  
    }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
