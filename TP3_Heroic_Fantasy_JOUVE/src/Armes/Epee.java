/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author ambre
 */
public class Epee extends Arme {
    private final int finesse;

    
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Appelle le constructeur de Arme
        this.finesse = (finesse < 100) ? finesse : 99; // Limite la finesse à 99
    }

  
    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}
