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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa que solicite números al usuario y sume solo los números pares.
        Scanner input = new Scanner(System.in);
        int num = 1;
        int numFinal = 0;
        
        System.out.println("Ingrese numeros enteros (ingrese 0 para terminar)");
       
        while (num != 0) {
            System.out.print("Ingrese otro numero entero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0) {
                numFinal += num;
            }
         
        }
        System.out.println("La suma de los numeros pares es: " + numFinal);
    }
    
}
