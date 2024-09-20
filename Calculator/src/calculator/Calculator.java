/*  Jouve Ambre FT2 Présentation de Netbeans 20/09/2024/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("add");
        System.out.println("substract"); 
        System.out.println("multiply"); 
        System.out.println("divide"); 
        System.out.println("modulo"); 
        
    
       int operateur;
       int operande1;
       int operande2;
       Scanner sc = new Scanner(System.in);
       System.out.println("Choisissez une de ces operations :");
       operateur=sc.nextInt();
       System.out.println("Choisissez un premier chiffre");
       operande1=sc.nextInt();
       System.out.println("Choisissez un deuxieme chiffre");
       operande2=sc.nextInt();
        
    }
    
}
