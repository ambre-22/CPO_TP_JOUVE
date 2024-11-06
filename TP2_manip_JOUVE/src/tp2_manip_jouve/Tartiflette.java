/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_jouve;

/**
 *
 * @author ambre
 */
public class Tartiflette {
    
    // Attribut pour stocker le nombre de calories
    int nbCalories;

    // Constructeur pour initialiser nbCalories
    public Tartiflette(int nbCalories) {
        this.nbCalories = nbCalories;
    }

    public static void main(String[] args) {
        // Création de deux objets Tartiflette avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);  // assiette1 a 500 calories
        Tartiflette assiette2 = new Tartiflette(600);  // assiette2 a 600 calories

        // Affichage avant l'inversion
        System.out.println("Avant l'inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Assiette 2 : " + assiette2.nbCalories);

        // Inverser les objets
        Tartiflette temp = assiette1;  // Stocker la référence de assiette1 dans temp
        assiette1 = assiette2;         // assiette1 référence maintenant l'objet de assiette2
        assiette2 = temp;              // assiette2 référence maintenant l'objet de assiette1

        // Affichage après l'inversion
        System.out.println("Après l'inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Assiette 2 : " + assiette2.nbCalories);
        
        //réponse à la denrière question : Oui, une référence à un objet peut être un attribut d'un autre objet, et cela représente souvent une relation entre ces objets
    }
}

