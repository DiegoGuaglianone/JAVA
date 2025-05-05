package COM.simulado;

public class Comando {
    
    private int valor;
    private Acao acao;

    public Comando(int valor, Acao acao) {
        this.valor = 0;
        this.acao = Acao.ZERAR;
    }

    public Acao getAcao(){
        return acao;
    }

    public int getValor(){
        return valor;
    }
    
    public boolean executar(Acao acao) {
        switch (acao) {
            case INCREMENTAR:
                valor += 1;
                break;
            case DECREMENTAR:
                if (valor > 0) {
                    valor -= 1;
                }
                break;
            case DUPLOINCREMENTO:
                valor += 2;
                break;
            case ZERAR:
                valor = 0;
                break;
            default:
                return false;
        }
        return true;
    }

    public void mostrar(){
        System.out.println(valor);
    }
}
