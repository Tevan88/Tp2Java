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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingrese un primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese un segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese un tercer numero entero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        }else if (num1 < num2 && num2 > num3) {
            System.out.println("El mayor es " + num2);
        }else {
            System.out.println("El mayor es " + num3);
        }
    }
    
}
