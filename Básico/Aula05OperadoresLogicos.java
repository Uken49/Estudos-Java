package com.helder.estudos.java;

public class Aula05OperadoresLogicos {

    public static void main(String args[]) {
        /*Operadores Lógicos:
            Operador 'E': && , se uma das condições forem falso, retorna 'false'
            Operador 'Ou': || , se uma das condições forem verdadeiro, retorna 'true'
        */
        
        // (true   &&   false)= false, exibe a mensagem do 'else'
        if(10 == 10 && 10 > 20){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        
        // (true   &&   false)= true, exibe a mensagem do 'if'
        if(10 == 10 || 10 > 20){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}
