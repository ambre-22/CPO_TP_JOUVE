/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_jouve;

import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class TP1_convertisseur_JOUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
     
     // Demande de saisir une valeur réelle (double)
     System.out.print("Veuillez entrer une valeur reelle : ");
        double valeurReelle = scanner.nextDouble();
        System.out.println("La valeur reelle saisie est : " + valeurReelle);
        
        // Conversion de la température en Kelvin
        double temperatureKelvin = valeurReelle + 273.15;
        
         // Affichage de la temperature en Kelvin
        System.out.println("La temperature correspondante en degres Kelvin est : " + temperatureKelvin);
  
    }
     // Méthode pour convertir Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public static double FahrenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public static double CelciusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin vers Fahrenheit
    public static double KelvinVersFahrenheit(double tKelvin) {
        // Conversion via Celsius
        double tCelsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFahrenheit(tCelsius);
    }

    // Méthode pour convertir Fahrenheit vers Kelvin
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        // Conversion via Celsius
        double tCelsius = FahrenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelsius);}
}
     