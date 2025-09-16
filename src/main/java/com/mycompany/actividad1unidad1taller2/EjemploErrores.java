/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1unidad1taller2;

/**
 *
 * @author Zaduke
 */
public class EjemploErrores {
    private String dato = "Dato de instancia";
    public static void metodoCorregido() {
        System.out.println("Método static ejecutado correctamente");
    }
    
    public void metodoDeInstancia() {
        System.out.println(this.dato);
    }
}
