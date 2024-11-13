/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Personnage.Personnage;

/**
 *
 * @author ambre
 */

    public class Magicien extends Personnage {
    private boolean estConfirme;

    public Magicien(String nom, int niveauDeVie, boolean estConfirme) {
        super(nom, niveauDeVie);  
        this.estConfirme = estConfirme;
    }

    public boolean estConfirme() {
        return estConfirme;
    }

    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + estConfirme;
    }
}

