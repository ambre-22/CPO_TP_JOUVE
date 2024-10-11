/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_jouve;

/**
 *
 * @author ambre
 */
public class BouteilleBiere {
    String nom; // Le nom de la bière
    float degreAlcool; // Son degré d’alcool
    String brasserie; // Le nom de la brasserie
    boolean ouverte; // Indique si la bouteille est ouverte

    BouteilleBiere(String leffe, double d, String abbaye_de_Leffe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    BouteilleBiere() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;


}
public BouteilleBiere(String unNom, float unDegre, String
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " est maintenant ouverte.");
            return true; // Succès
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false; // Échec
        }
        
    }
 @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés), Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;

}}
