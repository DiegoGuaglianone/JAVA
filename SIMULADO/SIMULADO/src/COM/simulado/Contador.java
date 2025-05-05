package COM.simulado;

public class Contador {

    private int valor;

    public Contador(int valor){
        this.valor = valor;
    }

    public void contar(){
        valor += 1;
    }

    public int getValor(){
        return valor;
    }
}