package com.helder.estudos.java;

public class Aula08Switch {

    public static void main(String args[]) {

        int opcao = 0;

        // Aqui se passa um argumento
        switch(opcao){ 
            case 1: // Aqui o argumento será testado, se for igual a '1', ele exibe a mensagem
                System.out.println("Abra a sua conta");
                break; // O 'break' serve para interromper os testes
            
            // case "dois": // Também é permitido colocar 'String'
            case 2:
                System.out.println("Fatura do Cartão");
                break;
                
            case 3:
                System.out.println("Crédito imobiliário");
                break;
                
            default: // Se o argumento passado não para em nenhum case, ele exibe o 'default'
                System.out.println("Escolha alguma opção válida");
        }
    }
}
