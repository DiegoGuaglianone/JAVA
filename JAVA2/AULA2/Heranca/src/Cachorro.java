public class Cachorro extends Animal{
    
    public Cachorro(String nome, String raca){
        super(nome,raca);
    }

    // public String latir(){
    //     return "AUAUAU";
    // }

    @Override
    public String emitirSom() {
        return "AUAUAU";
    }
}
