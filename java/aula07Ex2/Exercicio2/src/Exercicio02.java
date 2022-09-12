import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int numIni = 10;
        int numFim = 1000;
        int qtdPar = 0;
        int qtdImpar = 0;

        try (Scanner entradaDados = new Scanner(System.in)) {

            System.out.println("Programa do Par e do Ímpar");

            // Entrar Inicíal
            // System.out.print("Digite o número inicíal entre [0 e 500]: ");
            // numIni = entradaDados.nextInt();
            // Validação Inicíal
            /*
             * while (numIni < 0 || numIni > 500) {
             * System.out.print("[ERRO], Digite um número entre 0 e 500: ");
             * numIni = entradaDados.nextInt();
             * }
             * while (numIni == 0) {
             * System.out.print("[ERRO], Nenhum dado encontrado por favor, preencha: ");
             * numIni = entradaDados.nextInt();
             * }
             */
            // Entrada Final
            // System.out.print("Digite o número final entre [100 e 1000]: ");
            // numFim = entradaDados.nextInt();
            // Validação Final
            /*
             * while (numFim < numIni) {
             * System.out.println("[ERRO], Por favor, digite um núemro maior que " + numIni
             * + " e maior e entre 100 e 1000" + ": ");
             * numFim = entradaDados.nextInt();
             * }
             * while (numIni == numFim) {
             * System.out.println("[ERRO], Números iguais, por favor digite novamente: ");
             * numFim = entradaDados.nextInt();
             * }
             * while (numFim < 100 || numFim > 1000) {
             * System.out.println("[ERRO], Digite um valor entre 100 e 1.000: ");
             * numFim = entradaDados.nextInt();
             * }
             * while (numFim == 0) {
             * System.out.print("[ERRO], Nenhum dado encontrado por favor, preencha: ");
             * numFim = entradaDados.nextInt();
             * }
             */

        }

        // Laços de repetição
        int[] lista = new int[numFim -= 1];
        for (int i = 0; i < numFim; i++, numIni++)
            lista[i] = numIni;

        System.out.println("");
        System.out.println("Lista de Números Pares\n");
        for (int i = 1; i <= lista.length; i++) {
            if (lista[i - 1] % 2 == 0) {
                qtdPar += 1;
                System.out.println(lista[i - 1]);
            }
        }
        System.out.println("");
        System.out.println("Qtd de números Pares encontrados: " + qtdPar);
        System.out.println("");
        System.out.println("Lista de Números Ímpares\n");
        for (int i = 0; i <= lista.length; i++) {
            if (lista[i] % 2 != 0) {
                qtdImpar += 1;
                System.out.println(lista[i]);
            }
        }
        System.out.println("");
        System.out.println("Qtd de números Ímpares encontrados: " + qtdImpar);
    }
}
