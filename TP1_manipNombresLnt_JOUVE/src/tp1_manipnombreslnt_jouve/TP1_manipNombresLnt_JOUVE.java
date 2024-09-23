/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_jouve;

import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class TP1_manipNombresLnt_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
         System.out.print("Veuillez entrer un premier entier : ");
         int premierEntier = scanner.nextInt();
         
       System.out.print("Veuillez entrer un deuxieme entier : ");
        int deuxiemeEntier = scanner.nextInt();
        
         System.out.println("Le premier entier est : " + premierEntier);
        System.out.println("Le deuxieme entier est : " + deuxiemeEntier);
        
        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        
        // Calcul de la somme, différence, produit
         System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La difference des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        
        // Pour éviter une division par zéro et calcul du quotient et  du reste
         if (deuxiemeEntier != 0) {
            int quotient = premierEntier / deuxiemeEntier;
            int reste = premierEntier % deuxiemeEntier;
            
            System.out.println("Le quotient de la division entiere est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("La division par zéro n'est pas possible.");
    }
    
    } }
