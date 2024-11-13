/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ambre
 */
public class Arme {
  
    private final String nom;
    private final int niveauAttaque;

    
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = (niveauAttaque <= 100) ? niveauAttaque : 100; // Niveau max limité à 100
    }

    
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    
    public String getNom() {
        return nom;
    }

    
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}

