/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jouve;

/**
 *
 * @author ambre
 */
public class Baton extends Arme {
    private final int age;

   
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appelle le constructeur de Arme
        this.age = (age < 100) ? age : 99; // Limite l'âge à 99
    }

    
    public int getAge() {
        return age;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}

    
