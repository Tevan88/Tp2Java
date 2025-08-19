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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros. 

        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;     
        
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese un numero entero (el que tu quieras): ");
            num = Integer.parseInt(input.nextLine());
            
                  if (num == 0) {
                    ceros += 1;
         }       else if (num > 0) {
                    positivos += 1;
         }       else if (num < 0) {
                    negativos +=1;
               
         }
            
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
                
        
        
    }
    
}
