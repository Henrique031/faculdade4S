package br.com.fecaf.calculadoraV1;
import java.util.Scanner;

public class CalculadoraV1 {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        float n1, n2;
        double result = 0;
        String operacao;

        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.print("Digite a valor 1: ");
            n1 = entradaDados.nextFloat();
            System.out.print("Digite a valor 2: ");
            n2 = entradaDados.nextFloat();

            System.out.println("Digite a ação:\n [Somar || Subtrair || Multiplicar & Dividir");
            operacao = entradaDados.next().toLowerCase();
        }

        // Entrada de dados

        if (operacao.equals("somar") || operacao.equals("+"))
            result = n1 + n2;
        else if (operacao.equals("subtrair") || operacao.equals("-")) {
            result = n1 - n2;
        } else if (operacao.equals("multiplicar") || operacao.equals("*"))
            result = n1 * n2;
        else if (operacao.equals("dividir") || operacao.equals("/"))
            result = n1 / n2;
        else {
            System.out.println("ERRO, [caracteres invalidos] ");
        }
        System.out.println(result);
    }
}
