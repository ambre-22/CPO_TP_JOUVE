/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author ambre
 */

    public abstract class Personnage {
    private final String nom;
    private final int niveauDeVie;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau de vie: " + niveauDeVie;
    }
}


