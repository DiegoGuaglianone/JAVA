package com.aula8;

public class Tabela {
    
    public static String inserir(Cliente cliente){
        String sql = "INSERT INTO Cliente VALUE(";
        sql = sql + "\"" + cliente.getNome() + "\"" + ",\"";
        sql += cliente.getCpf() + "\")"; 
        return sql;
    }

    public static String inserir(Produto produto){
        String sql = "INSERT INTO Cliente VALUE(";
        sql = sql + "\"" + produto.getNome() + "\"" + ",\"";
        sql += produto.getPreco() + "\")";
        return sql;
    }
}
