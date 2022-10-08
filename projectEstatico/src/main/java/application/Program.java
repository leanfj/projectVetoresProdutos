/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculador;

/**
 *
 * @author leandro
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        Calculador calculador = new Calculador();
        
        System.out.println("Entre com o valor do raio:");
        double raio = scanner.nextDouble();

        double valorCircunferencia = calculador.calculaCircunferencia(raio);

        double valorVolume = calculador.calculaVolume(raio);

        System.out.printf("Circunferência: %.2f %n", valorCircunferencia);
        System.out.printf("Volume: %.2f %n", valorVolume);
        System.out.printf("PI value: %.2f %n", calculador.PI);

        scanner.close();

    }

}
