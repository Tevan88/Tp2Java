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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
         System.out.print("Ingrese una nota (0-10): ");
         num = Integer.parseInt(input.nextLine());     
          
         if (num < 0 || num > 10) {
         do {
            System.out.print("Error: Nota invalida. Ingrese una nota entre 0 y 10: ");
            num = Integer.parseInt(input.nextLine());
                          
         }while (num > 10 || num < 0);
             System.out.println("Nota ingresada correctamente"); 
        }
    }
}
