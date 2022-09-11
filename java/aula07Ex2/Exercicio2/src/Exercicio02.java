// import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        int numIni = 2, numFim = 10;
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

        int incPar = numIni;

        System.out.println("Números Pares\n");
        if (numIni % 2 == 0) {
            while (incPar <= numFim) {
                System.out.println(incPar);
                incPar += 2;
            }
        }
        numIni += 1;
        System.out.println("");
        System.out.println("Números Ímpares\n");
        while (numIni <= numFim) {
            System.out.println(numIni);
            numIni += 2;
        }
    }
}
