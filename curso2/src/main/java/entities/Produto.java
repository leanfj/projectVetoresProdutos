/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author leandro
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor padrão
    public Produto () {
        
    }
    
    public Produto(int quantidade, String nome, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }
    
    //Sobrecarga de construto - modificação de assinatura de construtor
    public Produto(String nome, double preco) {
        this.quantidade = 0;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque () {
        
        return this.getQuantidade() * this.getPreco();
    }
    
    public void adicionarProduto (int quantidadeProdutos) {
        this.setQuantidade(this.quantidade + quantidadeProdutos);
        this.imprirStatus();
    }
    
    public void removerProduto (int quantidadeProdutos) {
        this.setQuantidade(this.quantidade - quantidadeProdutos);
        this.imprirStatus();
    }
    
    public void imprirStatus() {
        System.out.printf("Dados do produto: %s, R$ %.2f, %d unidades, total: R$ %.2f %n", this.getNome(), this.getPreco(), this.getQuantidade(), this.valorTotalEmEstoque());
    }
}
