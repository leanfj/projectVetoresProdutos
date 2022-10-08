/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author leandro
 */
public class Calculador {

    public final double PI = 3.14159;

    public double calculaCircunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public double calculaVolume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
