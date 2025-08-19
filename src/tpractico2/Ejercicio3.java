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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad en anios: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un ninio/a");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto/a");
        } else {
            System.out.println("Eres un/a Adulto/a mayor");
        }
    }
    
}
