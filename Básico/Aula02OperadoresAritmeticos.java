package com.helder.estudos.java;

public class Aula02OperadoresAritmeticos {
    
    public static void main(String args[]) {
        /*Operadores Aritméticos:
            Operador de soma: +
            Operador de subtração: -
            Operador de multiplicação: *
            Operador de divisão: /
        */
                
        // Maneira diferente de declara mais de uma variavel do mesmo tipo
        int valor1 = 20, valor2 = 4;
        
        int soma = valor1 + valor2;
        int sub = valor1 - valor2;
        int mult = valor1 * valor2;
        int div = valor1 / valor2;
        
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
        
    }
}
