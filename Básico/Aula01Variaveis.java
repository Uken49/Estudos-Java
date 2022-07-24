package com.helder.estudos.java;

/*Tipos de dados:
    String - Textos
    byte - Números Inteiros (-128 até 127)
    int - Números Inteiros (-2147483648 até 214748364)
    long - Números (-9223372036854775808 até 9223372036854775807)
    float - Números Decimais (ex: 1.1234567 até 7 casas decimais)
    double - Números Decimais (ex: 1.123456789 até 15 casas decimais)
    boolean - Valores booleanos (true ou false)
*/

public class Aula01Variaveis {
            
    public static void main(String[] args) {
        // 'final' é o equivalente a 'constante', uma vez declarada, não pode ser alterado o valor
        final String NOME = "Chico Bento"; //É uma boa prática colocar em caixa-alta o nome de constante
        long taxa = 1214214124l; //Tem que colocar o 'l' no final
        float preco = 1.1234567f; // Tem que colocar o 'f' no final
        preco = 1.2414f; // Alterando o valor da váriavel após ser declarada
                
        // Comando para exibir alguma coisa no console
        System.out.println("Nome: "+NOME); 
        System.out.println("Taxa: "+taxa);
        System.out.println("Preço: "+preco);
        
        // A apartir do Java 10, é possível utilizar 'var' para declarar variavel
        // ele identifica o tipo da variavel olhando após o sinal "="
        var nome = "Gelda";
        var taxa2 = 5323125l;
        var preco2 = 591.46f;
        System.out.println("\nNome: "+nome);
        System.out.println("Taxa: "+taxa2);
        System.out.println("Preco: "+preco2);
    }
}

