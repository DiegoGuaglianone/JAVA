package COM.simulado;

import java.util.ArrayList;

public class Fita {

    private ArrayList<Contador> contadores;

    public Fita(){
        this.contadores = new ArrayList<>();
    }

    public void criaContador(Contador contador){
        this.contadores.add(contador);
    }

    public void Contar(){
        for (Contador c : contadores){
            c.contar();
        }
    }

    public int Soma(){
        int soma = 0;
        for(Contador contador : contadores){
            soma = soma + contador.getValor();
        }
        return soma;
    }

    public int Impar(){
        int aux = 0;
        for (Contador contador : contadores){
            if (contador.getValor() % 2 != 0){
                aux ++;
            }
        }
        return aux;
    }

    public int Zerados(){
        int aux = 0;
        for(Contador contador : contadores){
            if (contador.getValor() == 0){
                aux++;
            }
        }
        return aux;
    }
    
    public void mostrar(){
        System.out.println();
    }


}