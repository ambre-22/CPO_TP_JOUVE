/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_jouve;

/**
 *
 * @author ambre
 */
public class TP2_relation_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Main {
    public static void main(String[] args) {
        
        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Affichage des objets Voiture
        System.out.println("Liste des voitures disponibles : ");
        System.out.println(uneClio);  // Affichage de uneClio (appelle toString() de Voiture)
        System.out.println(uneAutreClio);  // Affichage de uneAutreClio (appelle toString() de Voiture)
        System.out.println(une2008);  // Affichage de une2008 (appelle toString() de Voiture)
        System.out.println(uneMicra);  // Affichage de uneMicra (appelle toString() de Voiture)
    }




