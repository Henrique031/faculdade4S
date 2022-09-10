package aula07Ex2;

import java.util.Scanner;

public class ex002 {

    static void main(String[] args) {

        int numIni = 0, numFim = 0;
        try (Scanner entradaDados = new Scanner(System.in)) {

            System.out.println("Programa do Par e do Ímpar");

            System.out.print("Digite o número inicíal: ");
            numIni = entradaDados.nextInt();
            System.out.print("Digite o número final: ");
            numIni = entradaDados.nextInt();
        }

        while (numIni < numFim) {

            System.out.println("Lista de números pares");
            while (numIni % 2 == 0) {
                System.out.println(numIni);
                numIni += 2;
            }
            System.out.println("");
            System.out.println("Lista de números Ímpares");
            System.out.println("");
            while (numIni % 2 != 0) {
                System.out.println(numIni);
                numIni += 1;
            }
        }
    }
}
