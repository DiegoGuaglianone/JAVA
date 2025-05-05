import COM.aula6.Tipo;
import COM.aula6.Carrinho;
import COM.aula6.Produto;
public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Lápis",5,Tipo.ESCRITORIO);
        Produto p2 = new Produto("Coca Zero",6,Tipo.ALIMENTO);
        Produto p3 = new Produto("Mouse",10,Tipo.ALIMENTO);
        Produto p4 = new Produto("Headset", 30, Tipo.TECNOLOGICO);
        Carrinho k = new Carrinho();
        k.inserir(p4);
        k.inserir(p3);
        k.inserir(p2);
        k.inserir(p1);
        k.listar();
        System.out.println(k.calcularPreco());
        System.out.println(k.calcPrecoTipo(Tipo.ESCRITORIO));
        k.buscar("Lápis");
    }
}
