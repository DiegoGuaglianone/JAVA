import COM.simulado.Comando;
import COM.simulado.Acao;
import COM.simulado.Contador;
import COM.simulado.Fita;
import COM.simulado.Intervalo;

public class App {
    public static void main(String[] args) throws Exception {
        
        //EXERCICIO 1
        Comando k = new Comando(0,Acao.ZERAR);
        k.executar(Acao.INCREMENTAR);
        k.executar(Acao.DUPLOINCREMENTO);
        k.executar(Acao.DECREMENTAR);
        k.mostrar();
        k.executar(Acao.ZERAR);
        k.mostrar();
        //

        //EXERCICIO 2
        Contador c = new Contador(0);
        Contador a = new Contador(0);
        Contador b = new Contador(0);

        Fita f = new Fita();
        f.criaContador(a);
        f.Contar();
        f.criaContador(b);
        f.Contar();
        f.criaContador(c);
        f.Impar();
        f.Soma();
        f.Zerados();
        System.out.println(f.Impar());
        System.out.println(f.Zerados());
        System.out.println(f.Soma());

        //EXERCICIO 3
        Intervalo i = new Intervalo(0, 5);
        System.out.println(i.pertence(10));
    }

}
