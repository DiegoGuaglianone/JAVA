package com.aula8;

public class Produto {
    
    private String nome;
    private double preco;
    private int id;
    public Produto(String nome, double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getId() {
        return id;
    }

    
    
}
