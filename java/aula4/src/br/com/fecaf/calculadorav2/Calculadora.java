package br.com.fecaf.calculadorav2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        float nota1, nota2;
        double result = 0; 
        String operacao;
        Boolean erro = false;

        try (//Instanciar classes
        Scanner entDados = new Scanner(System.in)) {
            //Entradas de dados
            System.out.println("Digite o valor 1: ");
            nota1 = entDados.nextFloat();
            System.out.println("Digite o valor 2: ");
            nota2 = entDados.nextFloat();

            System.out.println("Digite a operação  a ser calculada\n [ Somar | Subtrair | Dividir | Multiplicar ]"); 
            operacao = entDados.next().toUpperCase();
        }

        

       /* //Saída
        if (operacao.equals("SOMAR") || operacao.equals("+")){
        result = nota1 + nota2;
        System.out.println(result);
    }
        else if (operacao.equals("SUBTRAIR") || operacao.equals("-"))
            result = nota1 - nota2;
        else if (operacao.equals("DIVIDIR") || operacao.equals("/")) 
            result = nota1 / nota2;
        else if (operacao.equals("MULTIPLICAR") || operacao.equals("*")) {
            result = nota1 * nota2;
        }
        else {
            System.out.println("[ERRO] digitar novamente! ");
            erro = true;
        } 
        System.out.println(result);
        */
            
        //Saída
        switch (operacao) {
            case "SOMAR", "+":
                result = nota1 + nota2;
            break;
            case "SUBTRAIR", "-":
                result = nota1 - nota2;
            break;
            case "MULTIPLICAR", "*":
                result = nota1 * nota2;
            break;
            case "DIVIDIR", "/":
                result = nota1 / nota2;
            break;

            default:
            System.out.println("Dados invalidos, digitar novamente");
            erro = true;
        }

        if (erro == false)
        System.out.println(result);

        
    } 
}
