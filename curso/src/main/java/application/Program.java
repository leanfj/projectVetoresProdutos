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
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
        
        double xA, xB, xC;
        double yA, yB, yC;
        
        System.out.println("Entre com as medidas do triangulo X.");
        
        System.out.println("Informe a medida do lado A:");
        xA = scanner.nextDouble();
        System.out.println("Informe a medida do lado B:");
        xB = scanner.nextDouble();
        System.out.println("Informe a medida do lado C:");
        xC = scanner.nextDouble();
        
        System.out.println("Informe as medidas do triangulo Y.");
        
        System.out.println("Informe a medida do lado A:");
        yA = scanner.nextDouble();
        System.out.println("Informe a medida do lado B:");
        yB = scanner.nextDouble();
        System.out.println("Informe a medida do lado C:");
        yC = scanner.nextDouble();
        
        double pX = (xA + xB + xC) / 2.0;
        double pY = (yA + yB + yC) / 2.0;
        
        double trianguloX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
        double trianguloY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Triangulo X -> %.4f%n", trianguloX);
        System.out.printf("Triangulo y -> %.4f%n", trianguloY);

        
        if (trianguloX > trianguloY) {
            System.out.println("Triangulo X é maior");
        } else {
            System.out.println("Triangulo Y é maior");
        }
        
        scanner.close();
    }
}
