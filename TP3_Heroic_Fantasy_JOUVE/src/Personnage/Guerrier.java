/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author ambre
 */

    public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);  
        this.aCheval = aCheval;
    }

    public boolean aCheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", À cheval: " + aCheval;
    }
}

    
