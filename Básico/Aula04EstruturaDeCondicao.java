package com.helder.estudos.java;

public class Aula04EstruturaDeCondicao {

    public static void main(String args[]) {

        // Caso a condição dentro do if seja true, ele executa o comando
        // caso contrário, executa o else
        int idade = 10;

        if (idade <= 10) { // Se (condição)
            System.out.println("Verdadeiro");
        } else { // Se não
            System.out.println("Falso");
        }

        idade = 17;

        if (idade <= 10) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
        
        // O if não precisa do else para funcionar, mas o contrário não se aplica
        if(idade > 16){
            System.out.println("Ohayo");
        }
    }
}
