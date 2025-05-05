package com.exgarcia;

public class Endereco {
    private String logradouro;
    private String cidade;
    private Estado estado;

    public Endereco(String logradouro, String cidade, Estado estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void mostrar(){
        System.out.println(logradouro + cidade  + estado);
    }
}
