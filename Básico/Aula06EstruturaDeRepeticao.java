package com.helder.estudos.java;

public class Aula06EstruturaDeRepeticao {

    public static void main(String args[]) {
        /*Estrutura de repetição:
            WHILE - Enquanto
            DO WHILE - Faça Enquanto
            FOR - sla
        INFO: Todo o código que estiver dentro da estrutura, se repetirá
                enquanto a condição for 'true'
        */

        int contador = 0;

        // Executa o código caso for 'true'
        while (contador <= 5) {
            System.out.println("While: "+contador);
            contador += 1; // '+=' equivale a: (contador = contador + 1)
            /* OBS: Sem um contador, a condição sempre seria 'true',
                     resultando em um loop infinito que acabaria travando tudo*/
        }
        
        int contador2 = 0;
        // Executa o código uma vez, depois repete caso for 'true'
        do{
            System.out.println("Do While: "+contador2);
            contador2 += 1;
        }while(contador2 <= 2);
        
        // (variavel; condição; ultimo comando da estrutura)
        // Faz a mesma coisa que o 'While', porém as infomações são passadas nos parentesses
        for(int contador3 = 0; contador3 <= 6; contador3++){
            System.out.println("For: "+ contador3);
        }
    }
}
