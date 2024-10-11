/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jouve;

/**
 *
 * @author ambre
 */
public class TP2_Bieres_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // Création des bières
        BouteilleBiere biere1 = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere biere3 = new BouteilleBiere("Chimay Blue", 9.0f, "Chimay");
        BouteilleBiere biere4 = new BouteilleBiere("Kronenbourg 1664", 5.0f, "Kronenbourg");

        // Affichage de l'état initial de chaque bière
        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);

        // Décapsuler certaines bières
        System.out.println("Décapsulons quelques bières...");
        biere1.decapsuler();
        biere3.decapsuler();

        // Affichage de l'état après décapsulage
        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);

        // Essayer de décapsuler à nouveau une bière déjà ouverte
        if (!biere1.decapsuler()) {
            System.out.println("Impossible de décapsuler à nouveau " + biere1.nom + ".");
        }

        // Affichage final de l'état de toutes les bières
        System.out.println("État final des bières :");
        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);
    }
}

    
