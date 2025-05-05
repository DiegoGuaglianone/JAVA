package com.aula5;

// + public
// - private
//   default
// # protected
 
// HAS - A ("1-1"): é uma relação em que há referencia da classe A na classe B
// A has-a B (A acessa metodos da classe B)

//TIER LIST DE COISAS QUE O GARCIA GOSTA
// 1 - HASKELL
// 2 - MATEMÁTICA
// 3 - SANTOS
// 4 - BITCOIN
// 5 - SERENA 

//TIER LIST DE COISAS QUE O GARCIA ODEIA
// 1 - INSETOS
// 2 - JAVASCRIPT
// 3 - PHP
// 4 - MORTE
// 5 - 


public class Bateria {

    private int ponto;
    //final deixa o atributo constante => const do JS
    private static final int MAX_CARGA = 5;

    public Bateria(int ponto){
        this.ponto = Math.min(MAX_CARGA,ponto);
    }

    public boolean isVazio(){
        return ponto == 0;
    }

    public void gastar(){
        if(!isVazio())
            ponto--;
    }

    public void recarregar(){
        if(ponto < MAX_CARGA)
        ponto++;
    }

}
