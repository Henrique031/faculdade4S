package aula006.src.br.com.fecaf.tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) throws Exception {
        int tab;
        int i;

        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.print("Favor digitar uma tabuada a ser calculada: ");
            tab = entradaDados.nextInt();
        }

        if (tab > 0) {
            for (i = 1; i <= 10; i++) {
                System.out.println(tab + " X " + i + " = " + tab * i);
            }
        } else
            System.out.println("Valor informado inválido! ");
    }
    
}
