package tp2_relation_jouve;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ambre
 */
public class Voiture {
   
    // Attributs de la classe Voiture
    String marque;
    String modele;
    int nbPlaces;
    private Personne proprietaire;

    // Constructeur pour initialiser les attributs
    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
    }

    // Méthode toString() pour afficher les informations de la voiture
    @Override
    public String toString() {
        return "Voiture { Modele: " + modele + ", Marque: " + marque + ", Nombre de places: " + nbPlaces + " }";
    }
    
   // Méthode pour définir le propriétaire de la voiture
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }
//@Override
public String toString() {
        String proprietaireInfo = (proprietaire != null) ? proprietaire.toString() : "Aucun propriétaire";
        return "Voiture { Modele: " + modele + ", Marque: " + marque + ", Nombre de places: " + nbPlaces + ", Propriétaire: " + proprietaireInfo + " }";
    }
   
}




