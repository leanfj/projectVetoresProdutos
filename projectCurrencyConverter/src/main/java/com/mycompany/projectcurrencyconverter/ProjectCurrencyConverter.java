/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectcurrencyconverter;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author leandro
 */
public class ProjectCurrencyConverter {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner;        
        scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor de cotação do dolar: ");
        double dolar = scanner.nextDouble();
        
        System.out.println("Informe quantos dolares quer comprar: ");
        double dolarComprar = scanner.nextDouble();
        
        System.out.printf("Quanto deve ser pago em reais: %.2f %n ", CurrencyConverter.converteParaReal(dolarComprar, dolar));   
    }
}
