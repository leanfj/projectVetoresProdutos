/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenprojectvetores;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author leandro
 */
public class MavenprojectVetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        
        double[] vect = new double[n];
        
        for(int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }
        
        double soma = 0.0;
        
        for(int i = 0; i < n; i++) {
            soma += vect[i];
            System.out.println("Valor na posição " + i + " = " + vect[i]);
        }
        
        double avg = soma / n;
        
        System.out.printf("Média de %.2f%n ", avg);
        
        scanner.close();
    }
}
