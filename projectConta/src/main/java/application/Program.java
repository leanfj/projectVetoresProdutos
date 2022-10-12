/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Conta;
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

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Titular da conta: ");
        String titularConta = scanner.next();

        System.out.print("Conta com deposito inicial (y/n):");
        String depositoInicial = scanner.next();

        Conta conta;

        if (depositoInicial.equalsIgnoreCase("y")) {
            System.out.print("Saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            conta = new Conta(numeroConta, titularConta, saldoInicial);
        } else {
            conta = new Conta(numeroConta, titularConta);
        }

        System.out.println("Dados da conta: ");

        System.out.println(conta.toString());

        System.out.print("Entre com o valor de deposito: ");
        conta.deposito(scanner.nextDouble());

        System.out.println("Atualização de dados da conta: ");
        System.out.println(conta.toString());

        System.out.print("Entre com o valor de saque: ");
        conta.saque(scanner.nextDouble());

        System.out.println("Atualização de dados da conta: ");
        System.out.println(conta.toString());

        scanner.close();
    }
}
