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
     * @param args
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
    
     // Convertir Celsius en Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }
     // Convertir Kelvin en Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }
     // Convertir Fahrenheit en Celsius
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }
    
    // Convertir Celsius en Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }
    
    // Convertir Kelvin en Fahrenheit (via Celsius)
    public static double KelvinVersFarenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }

    // Méthode pour convertir Fahrenheit en Kelvin (via Celsius)
public static double FarenheitVersKelvin(double tFahrenheit) {
    double tCelcius = FarenheitVersCelcius(tFahrenheit);
    return CelciusVersKelvin(tCelcius);
}
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une température en Celsius : ");
        double tCelcius = scanner.nextDouble();
        
        // Conversion et affichage
        double tKelvin = CelciusVersKelvin(tCelcius);
        System.out.println("En Kelvin, cette valeur vaut: " + tKelvin);

        double tFarenheit = CelciusVersFarenheit(tCelcius);
        System.out.println("En Farenhiet, cette valeur vaut : " + tFarenheit);

        System.out.println("Entrez une température en Kelvin : ");
        double tKelvinInput = scanner.nextDouble();
        double tCelciusFromKelvin = KelvinVersCelcius(tKelvinInput);
        System.out.println("En Celcius, cette valeur vaut : " + tCelciusFromKelvin);
        
        double tFarenheitFromKelvin = KelvinVersFarenheit(tKelvinInput);
        System.out.println("En Farenheit, cette valeur vaut : " + tFarenheitFromKelvin);

        System.out.println("Entrez une température en Fahrenheit : ");
        double tFarenheitInput = scanner.nextDouble();
        double tCelciusFromFarenheit = FarenheitVersCelcius(tFarenheitInput);
        System.out.println("En Celcius, cette valeur vaut : " + tCelciusFromFarenheit);

        double tKelvinFromFarenheit = FarenheitVersKelvin(tFarenheitInput);
        System.out.println("En Kelvin, cette valeur  : " + tKelvinFromFarenheit); }

}

    