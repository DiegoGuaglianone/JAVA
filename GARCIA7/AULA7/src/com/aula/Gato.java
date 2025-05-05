package com.aula;

public class Gato extends Animal {
    
    private String raca;

    public Gato(String nome, String raca){
        super(nome); //Esse comando é obrigatório!
        // INICIALIZAÇÃO DE QUALQUER COISA DEVE ACONTECER APÓS O SUPER
        this.raca = raca;
    }

    public void miar(){
        System.out.println(getNome() + ": MIAU MIAU!");
    }

    public void mostrarRaca(){
        System.out.println(raca);
    }
}
