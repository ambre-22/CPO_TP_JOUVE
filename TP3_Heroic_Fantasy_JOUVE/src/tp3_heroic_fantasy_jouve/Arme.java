/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jouve;

/**
 *
 * @author ambre
 */
public class Arme {
  
    private final String nom;
    private final int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque de l'arme
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = (niveauAttaque <= 100) ? niveauAttaque : 100; // Niveau max limité à 100
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'arme
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}

