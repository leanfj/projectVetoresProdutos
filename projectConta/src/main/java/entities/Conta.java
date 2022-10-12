/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author leandro
 */
public class Conta {
    private final double TAXA_SAQUE = 5;
    
    private int numero;
    private String titular;
    private double saldo;
    
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito( double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void saque (double valor) {
        this.setSaldo((this.getSaldo() - valor) - TAXA_SAQUE);
    }

    @Override
    public String toString() {
        return "Numero: " + numero + ", Titular: " + titular + ", Saldo: " + saldo;
    }
    
    
    
}
