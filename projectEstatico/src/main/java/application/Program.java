/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Program {
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Entre com o valor do raio:");
        double raio = scanner.nextDouble();
        
        double valorCircunferencia = calculaCircunferencia(raio);
        
        double valorVolume = calculaVolume(raio);
        
        System.out.printf("Circunferência: %.2f %n", valorCircunferencia);
        System.out.printf("Volume: %.2f %n", valorVolume);
        System.out.printf("PI value: %.2f %n", PI);
        
        scanner.close();

    }

    private static double calculaCircunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    private static double calculaVolume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
