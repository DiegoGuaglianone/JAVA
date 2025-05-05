package com.exgarcia;

public class Cliente {
    private String email;
    private Endereco endereco;
    private String nome;
    public Cliente(String email, Endereco endereco, String nome) {
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
    }

    public boolean valido(){
        return nome != null;
    }

    public void mostrar(){
        if (valido()) {
            System.out.println(nome + email);
            endereco.mostrar(); 
        }
    }
}
