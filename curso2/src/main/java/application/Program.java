/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Produto;
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
        
        Produto produto;
              
        produto = new Produto();
        
        System.out.println("Informe os dados do produto:");
                
        System.out.println("Informe o nome:");
        produto.setNome(scanner.next());
        System.out.println("Informe o preço");
        produto.setPreco(scanner.nextDouble());
        System.out.println("Informe a quantidade:");
        produto.setQuantidade(scanner.nextInt());
        
        produto.imprirStatus();
        
        System.out.println("Entre a quantidade de produtos para adicionar ao estoque:");
        produto.adicionarProduto(scanner.nextInt());
        
        System.out.println("Entre a quantidade de produtos para remover do estoque:");
        produto.removerProduto(scanner.nextInt());        
        
        scanner.close();
    }
}
