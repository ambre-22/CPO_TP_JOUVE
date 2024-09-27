/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_jouve;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class TP1_GuessMyNumber_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Créer un générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // 5 nombres aléatoires inférieurs ou égaux à 100
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(101); // Génère un nombre entre 0 et 100
            System.out.println("Nombre aleatoire " + (i + 1) + " : " + n);

            // Générer un nombre aléatoire entre 0 et 100
            int nombreSecret = generateurAleat.nextInt(101); // 101 pour inclure 100
        

            Scanner scanner = new Scanner(System.in);
            int essai = -1; // Initialiser avec une valeur qui ne correspond pas

            // Boucle tant que l'utilisateur n'a pas deviné le nombre
            while (essai != nombreSecret) {
                System.out.print("Saisissez un nombre entre 0 et 100 : ");
                essai = scanner.nextInt();

                if (essai < 0 || essai > 100) {
                    System.out.println("Veuillez saisir un nombre valide entre 0 et 100.");
                } else if (essai < nombreSecret) {
                    System.out.println("Trop petit !");
                } else if (essai > nombreSecret) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Gagne !");
                }
            }

        }
    }
}
