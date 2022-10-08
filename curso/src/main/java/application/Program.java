/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Triangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        Triangulo x, y;
        
        x = new Triangulo();
        y = new Triangulo();    
        
        System.out.println("Entre com as medidas do triangulo X.");
        
        System.out.println("Informe a medida do lado A:");
        x.ladoA = scanner.nextDouble();
        System.out.println("Informe a medida do lado B:");
        x.ladoB = scanner.nextDouble();
        System.out.println("Informe a medida do lado C:");
        x.ladoC = scanner.nextDouble();
        
        System.out.println("Informe as medidas do triangulo Y.");
        
        System.out.println("Informe a medida do lado A:");
        y.ladoA = scanner.nextDouble();
        System.out.println("Informe a medida do lado B:");
        y.ladoB = scanner.nextDouble();
        System.out.println("Informe a medida do lado C:");
        y.ladoC = scanner.nextDouble();
        
        double areaTrianguloX = x.calculaArea();
        double areaTrianguloY = y.calculaArea();

        System.out.printf("Triangulo X -> %.4f%n", areaTrianguloX);
        System.out.printf("Triangulo y -> %.4f%n", areaTrianguloY);

        
        if (areaTrianguloX > areaTrianguloY) {
            System.out.println("Triangulo X é maior");
        } else {
            System.out.println("Triangulo Y é maior");
        }
        
        scanner.close();
    }
}
