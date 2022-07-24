package com.helder.estudos.java;

public class Aula03OperadoresRelacionais {

    public static void main(String args[]) {
        
        /*Operadores Relacionais:
            Operador de igual: ==
            Operador de diferente: !=
            Operador de maior: >
            Operador de menor: <
            Operador de maior ou igual: >=
            Operador de menor ou igual: <=
        OBS: O sinal '=' equivale a 'recebe', enquanto '==' equivale a 'igual'
        */
        
        int valor1 = 20, valor2 = 10;
        // É retornado um valor booleano
        System.out.println(valor1 == valor2); // false
        System.out.println(valor1 != valor2); // true
        System.out.println(valor1 > valor2); // true
        System.out.println(valor1 <= valor2); // false
    }
}
