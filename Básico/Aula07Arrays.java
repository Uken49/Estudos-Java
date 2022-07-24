package com.helder.estudos.java;

import java.util.ArrayList;
import java.util.List;


public class Aula07Arrays {
    /*Array - Vetor
        Para definir o Array, é necessário informar o tipo e colocar os colchetes
        As posições do Array é denomidada 'índice', onde o primeiro item da lista
          começa na posição 0, depois 1, etc.
    */
    public static void main(String args[]) {
        /*Duas formas de criar um Array
        String[] lista_games = new String[3];
        lista_nome[0] = "Minecraft 2";
        lista_nome[1] = "Dark Souls II 2";
        lista_nome[2] = "Xadrez 2";
        */
        String[] lista_games = {"Minecraft 2", "Xadrez 2", "Dark Souls II 2"};
                                //0        1        2
        System.out.println("Lista nome: "+lista_games[1]+"\n"); //Resultado = Xadrez 2
        
        // Para exibir todos os itens da lista, será necessário uma estrutura de repetição
        for(int contador = 0; contador < lista_games.length ; contador++){ // Com o comando '.length', é possível saber o tamanho do array
            System.out.println("Lista nome:"+lista_games[contador]);
        }
        
        /*Criando um ArrayList
            Diferente de um Array comum, o ArrayList não possui um limite
              de tamanho, podendo ser adicionando constantemente.
        OBS: Para poder usar o ArrayList, é precisso importar o 'java.util'
          que estão na linha 3 e 4.
        */ 
        
        List<String> lista_desenhos;
        lista_desenhos = new ArrayList<>();
        
        lista_desenhos.add("Apenas uma aventura"); // Adicionando elemento
        lista_desenhos.add("O incrivel mundo de show");
        System.out.println("\nLista desenhos: "+lista_desenhos);
        
    }
}
