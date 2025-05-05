package com.main;

import com.exgarcia.Cliente;
import com.exgarcia.Endereco;
import com.exgarcia.Estado;

public class App {
    public static void main(String[] args){
        Endereco e = new Endereco("Rua do grito", "Santos", Estado.SP);
        Cliente diego = new Cliente("Diego@gmail", e , "Diego");

        diego.mostrar();
    }
}
