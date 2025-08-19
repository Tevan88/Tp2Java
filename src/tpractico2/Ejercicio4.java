/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpractico2;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Calculadora de Descuento según categoría. 
        Scanner input = new Scanner(System.in);
        String categoria;
        double precio, precioFinal;
        
        System.out.print("Ingrese el precio de su producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = input.nextLine().toUpperCase();
        
        switch (categoria) {
            case "A" -> System.out.println("Descuento aplicado: 10%\nPrecio final: " + (precio * 0.90));
            case "B" -> System.out.println("Descuento aplicado: 15%\nPrecio final: " + (precio * 0.85));
            case "C" -> System.out.println("Descuento aplicado: 20%\nPrecio final: " + (precio * 0.80));
                    
        }
        
        
    }
    
}
