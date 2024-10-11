/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jouve;

/**
 *
 * @author ambre
 */
public class TP2_Bieres_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();

       
        uneBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        uneBiere.lireEtiquette();
        
       
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chimay Blue", 9.0f, "Chimay");
        troisiemeBiere.lireEtiquette();

       
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Kronenbourg 1664", 5.0f, "Kronenbourg");
        quatriemeBiere.lireEtiquette();
       
System.out.println(uneBiere) ;

    }
    
}
