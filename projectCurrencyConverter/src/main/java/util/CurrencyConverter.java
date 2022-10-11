/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author leandro
 */
public class CurrencyConverter {
    public static final double IOF = 6;
    
    public static double converteParaReal (double valorEmReal, double valorDolar) {
        double result = valorEmReal * valorDolar;
        double valorIOF = (result * IOF) / 100;
   
        return result + valorIOF;
    }
    
}
