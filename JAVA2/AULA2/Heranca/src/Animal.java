public abstract class Animal {
    //UPCAST quanto mais para cima, mais genérico, abstrato
    //DOWNCAST quanto mais baixo, mais concreto, específico
    private String nome,raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract String emitirSom();
    
}
