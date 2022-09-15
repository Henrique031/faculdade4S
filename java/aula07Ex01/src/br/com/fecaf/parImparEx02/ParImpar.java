package aula07Ex01.src.br.com.fecaf.parImparEx02;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        int numIni = 0;
        int numFim = 0;
        int qtdPar = 0;
        int qtdImpar = 0;
        String escolha = "1";
        
        System.out.println("Programa do Par e do Ímpar");

        try (Scanner entradaDados = new Scanner(System.in)) {
            // Entrar Inicíal
            System.out.print("Digite o número inicíal entre [1 e 500]: ");
            numIni = entradaDados.nextInt();
            // Validação
            while (numIni < 0 || numIni > 500 || numIni == 0) {

                while (numIni == 0) {
                    System.out.print("[ERRO], Nenhum dado encontrado por favor, preencha: ");
                    numIni = entradaDados.nextInt();
                }

                while (numIni < 0 || numIni > 500) {
                    System.out.print("[ERRO], Digite um número entre 1 e 500: ");
                    numIni = entradaDados.nextInt();
                }

            }

            // Entrada Final
            System.out.print("Digite o número final entre [100 e 1000]: ");
            numFim = entradaDados.nextInt();
            // Validação Final

            while (numFim < numIni || numIni == numFim || numFim < 100 || numFim > 1000 || numFim == 0) {

                while (numFim < numIni) {
                    System.out.println("[ERRO], Por favor, digite um número entre 100 e 1000: ");
                    numFim = entradaDados.nextInt();
                }
                while (numIni == numFim) {
                    System.out.println("[ERRO], Números iguais, por favor digite novamente: ");
                    numFim = entradaDados.nextInt();
                }
                while (numFim < 100 || numFim > 1000) {
                    System.out.println("[ERRO], Digite um valor entre 100 e 1.000: ");
                    numFim = entradaDados.nextInt();
                }
                while (numFim == 0) {
                    System.out.print("[ERRO], Nenhum dado encontrado por favor, preencha: ");
                    numFim = entradaDados.nextInt();
                }
            }
            System.out.println(" 1 - Par\n 2 - Ímpar\n 3 - Ambos");
            System.out.print("Digite o código do seu interece: ");
            escolha = entradaDados.next();

        }

        // Laços de repetição
        int[] lista = new int[numFim];
        for (int i = 1; i < numFim; i++, numIni++)
        lista[i - 1] = numIni;
        
        switch (escolha) {
            case "1":
            NumPar(lista, qtdPar);
            break;
            case "2":
            NumImpar(lista, qtdImpar);
            break;
            case "3":
            NumPar(lista, qtdPar);
            NumImpar(lista, qtdImpar);
            break;
            default:
            System.out.println("[ERRO] ecolha do [1 ao 3]");
                break;
        }
      /*   System.out.println("");
        System.out.println("Lista de Números Pares\n");
        for (int i = lista[0]; i <= lista.length; i++) {
            if (lista[i - lista[0]] % 2 == 0) {
                qtdPar += 1;
                System.out.println(lista[i - lista[0]]);
            }
        } 
        System.out.println("");
        System.out.println("Qtd de números Pares encontrados: " + qtdPar);
        System.out.println("");
        */
        /* System.out.println("Lista de Números Ímpares\n");
        for (int i = lista[0]; i <= lista.length; i++) {
            if (lista[i - lista[0]] % 2 != 0) {
                qtdImpar += 1;
                System.out.println(lista[i - lista[0]]);
            }
        }
        System.out.println("");
        System.out.println("Qtd de números Ímpares encontrados: " + qtdImpar); */
    }
    public static void NumPar(int[] lista, int qtdPar) {
        System.out.println("");
        System.out.println("Lista de Números Pares\n");
        for (int i = lista[0]; i <= lista.length; i++) {
            if (lista[i - lista[0]] % 2 == 0) {
                qtdPar += 1;
                
                System.out.println(lista[i - lista[0]]);
            }
        }
        System.out.println("");
        System.out.println("Qtd de números Pares encontrados: " + qtdPar);
    }
    public static void NumImpar (int[] lista, int qtdImpar) {
        System.out.println("");
        System.out.println("Lista de Números Ímpares\n");
        for (int i = lista[0]; i <= lista.length; i++) {
            if (lista[i - lista[0]] % 2 != 0) {
                qtdImpar += 1;
                System.out.println(lista[i - lista[0]]);
            }
        }
        System.out.println("");
        System.out.println("Qtd de números Ímpares encontrados: " + qtdImpar);
        System.out.println("");
    }
}
