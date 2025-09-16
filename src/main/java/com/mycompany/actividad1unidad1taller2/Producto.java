/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1unidad1taller2;

/**
 *
 * @author Zaduke
 */
public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio; 
    }
    
    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
