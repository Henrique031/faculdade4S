package aula06;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
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

/*
 * 
 * if (tab > 0) {
 * i = 1;
 * while (i <= 10) {
 * System.out.println(tab + " X " + i + " = " + i * tab);
 * i = i + 1;
 * }
 * } else
 * System.out.println("Valor informado inválido! ");
 */
