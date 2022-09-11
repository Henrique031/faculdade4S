// import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int numIni = 2;
        int numFim = 10;

        // int numFim = 10;
        /*
         * try (Scanner entradaDados = new Scanner(System.in)) {
         * 
         * System.out.println("Programa do Par e do Ímpar");
         * 
         * System.out.print("Digite o número inicíal: ");
         * numIni = entradaDados.nextInt();
         * System.out.print("Digite o número final: ");
         * numFim = entradaDados.nextInt();
         * }
         */

        // 2
        // [0]
        int[] lista = new int[numFim];
        numFim -= 1;
        for (int i = 0; i < numFim; i++, numIni++) {
            lista[i] = numIni;
        }

        System.out.println("Números Pares\n");
        for (int i = 1; i < lista.length; i++) {
            if (lista[i - 1] % 2 == 0) {
                System.out.println(lista[i - 1]);
            }
        }
        System.out.println("");
        System.out.println("Números Ímpares\n");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 != 0) {
                System.out.println(lista[i]);
            }
        }
    }
}
