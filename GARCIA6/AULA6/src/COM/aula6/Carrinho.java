package COM.aula6;

//HAS - Many '1 para n' é quando uma classe A possui várias referências de B

public class Carrinho {
    

    private Produto[] produtos;

    private static final int QT_MAX = 5;
    private int qtAtual;

    public Carrinho(){
        //Nesse caso temos um array de 5 produtos.
        produtos = new Produto[QT_MAX];
    }

    public void inserir(Produto p) throws Exception{
        if(p != null){
            throw new Exception ("Produto nulo não pode");
        }
        if(qtAtual >= QT_MAX){
            throw new Exception ("Não há espaço para mais produtos");
        }
        produtos[qtAtual++] = p;
    }

    public Produto remover(){
        Produto topo = produtos[qtAtual-1];
        produtos[--qtAtual] = null;
        return topo; 
    }

    public void listar(){
        for(int i = 0; i < qtAtual; i++){
            produtos[i].mostrar();
        }
    }

    public double calcularPreco(){
        double total = 0;
        for(int i = 0; i < qtAtual; i++){
            total = total + produtos[i].getPreco();
        }
        return total;
    }

    public double calcPrecoTipo(Tipo tipo){
        double total = 0;
        for(int i = 0; i<qtAtual; i++){
            if(produtos[i].verificarTipo(tipo))
                total = total +  produtos[i].getPreco();
        }
        return total;
    }

    public void buscar(String nome){
        for(int i=0; i < qtAtual; i++){
            if(produtos[i].getNome().equals(nome)){
                produtos[i].mostrar();
            }
        }
    }
}
