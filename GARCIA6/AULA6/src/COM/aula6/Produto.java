package COM.aula6;

public class Produto {
    
    private String nome;
    private double preco;
    private Tipo tipo; //this.tipo <<

    public Produto(String nome, double preco, Tipo tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo; // tipo << 
    }

    public boolean verificarTipo(Tipo tipo){
        return this.tipo == tipo; 
        // verifica se o tipo do atributo é o mesmo da variável local
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrar(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(tipo);
    }
}
