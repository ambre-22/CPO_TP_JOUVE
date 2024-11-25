/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jouve;

import Armes.Baton;
import Armes.Epee;
import Personnage.Guerrier;
import Personnage.Magicien;

/**
 *
 * @author ambre
 */
class tp3_heroic_fantasy_jouve {
    



public class TP3_Heroic_Fantasy_JOUVE {
    public static void main(String[] args) {
        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Guerrier guerrier = new Guerrier("Conan", 78, false);
        Magicien magicien = new Magicien("Gandalf", 65, true);

        // Ajout d'armes au stock des personnages
        guerrier.ajouterArme(excalibur);
        guerrier.ajouterArme(durandal);
        magicien.ajouterArme(chene);
        magicien.ajouterArme(charme);

        // Équipement d'armes
        guerrier.equiperArme("Excalibur");
        magicien.equiperArme("Chêne");

        // Affichage des caractéristiques des personnages
        System.out.println("\nCaractéristiques des personnages :");
        System.out.println(guerrier);
        System.out.println(magicien);

        // Affichage du nombre d'armes préférées
        System.out.println("\nNombre de bâtons dans l'inventaire de Gandalf : " +
                magicien.compterArmesDePredilection("Bâton"));
    }
}}
