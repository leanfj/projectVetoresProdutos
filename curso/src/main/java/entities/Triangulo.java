/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author leandro
 */
public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;
 
    public double calculaArea () {
        double p = (this.ladoA + this.ladoB + this.ladoC) / 2.0;
        
        double areaTriangulo = Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC));
        
        return areaTriangulo;
    }
}
