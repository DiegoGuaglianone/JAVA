package com.aula;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void mostrarNome(){
        System.out.println("Nome: " + nome);
    }

    public void emitirSom(){
        //não sabemos qual animal
        System.out.println("SOM GENÈRICO");
    }

    public String getNome() {
        return nome;
    }
}
