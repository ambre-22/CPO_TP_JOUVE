/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_jouve;

/**
 *
 * @author ambre
 */
public class TP2_manip_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public class Main {
    public static void main(String[] args) {
        // Création de deux objets Tartiflette avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);  // assiette1 a 500 calories
        Tartiflette assiette2 = new Tartiflette(600);  // assiette2 a 600 calories

        // Référence assiette3 à assiette2
        Tartiflette assiette3 = assiette2;

        // Affichage des calories des tartiflettes
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Incrémentation des calories d'une tartiflette
        assiette2.nbCalories += 100;  // Incrémenter les calories de assiette2 de 100

        // Affichage des calories après modification
        System.out.println("nb de calories de Assiette 2 après modification : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 après modification : " + assiette3.nbCalories);
    }
}

}
