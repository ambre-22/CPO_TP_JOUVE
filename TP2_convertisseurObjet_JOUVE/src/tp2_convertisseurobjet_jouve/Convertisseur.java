/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_jouve;

/**
 *
 * @author ambre
 */


public class Convertisseur{

    int nbConversions = 0 ;
   

        public static double CelciusVersKelvin (double tCelcius) {
    double tKelvin;
    tKelvin = tCelcius + 273;
    return tKelvin;
}
public static double KelvinVersCelcius (double tKelvin) {
    double tCelcius;
    tCelcius = tKelvin - 273;
    return tCelcius;
}
public static double FarenheitVersCelcius (double tFarenheit) {
    double tCelcius;
    tCelcius = (tFarenheit - 32) * 5.0 / 9.0 ;
    return tCelcius;
}

public static double CelciusVersFarenheit (double tCelcius) {
    double tFarenheit;
    tFarenheit = tCelcius * (5.0/9.0) + 32 ;
    return tFarenheit;
}

public static double KelvinVersFarenheit (double tKelvin) {
    double tFarenheit;
    double tCelcius;
    tCelcius = KelvinVersCelcius(tKelvin);
    tFarenheit = CelciusVersFarenheit(tCelcius);
    return tFarenheit;
}

public static double FarenheitVersKelvin (double tFarenheit) {
    double tKelvin;
    double tCelcius;
    tCelcius = FarenheitVersCelcius(tFarenheit);
    tKelvin = CelciusVersKelvin(tCelcius);
    return tKelvin;
}

@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}


}  




