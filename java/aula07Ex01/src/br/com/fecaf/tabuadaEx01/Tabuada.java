package aula07Ex01.src.br.com.fecaf.tabuadaEx01;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {

        int tabIni = 0, tabFim = 0, cIni = 0, cFim = 0;

        try (Scanner entradaDados = new Scanner(System.in)) {

            System.out.print("Insira a tabuada de inicío: ");
            tabIni = entradaDados.nextInt();

            while (tabIni == 0 || (tabIni <= 1 || tabIni >= 101)) {

                while (tabIni == 0) {
                    System.out.println("Nenhum dado indentificado, digite pelo menos um valor: .");
                    tabIni = entradaDados.nextInt();
                }
                while (tabIni <= 1 || tabIni >= 101) {
                    System.out.println("Digite um valor entre 2 e 100: ");
                    tabIni = entradaDados.nextInt();
                }
            }

            System.out.print("Insira a tabuada de fim: ");
            tabFim = entradaDados.nextInt();
            while (tabIni == tabFim || tabFim == 0 || (tabFim <= tabIni || tabFim >= 100)) {

                while (tabIni == tabFim) {
                    System.out.println("Dados repetidos, digite novamente: ");
                    tabFim = entradaDados.nextInt();
                }
                while (tabFim == 0) {
                    System.out.println("Nenhum dado encontrado, digite novamente: ");
                    tabFim = entradaDados.nextInt();
                }
                while (tabFim <= tabIni || tabFim >= 100) {
                    System.out.println("Digite um valor a cima de " + tabIni + " e até 100: ");
                    tabFim = entradaDados.nextInt();
                }
            }

            System.out.print("Insira o inicío do contador: ");
            cIni = entradaDados.nextInt();
            while (cIni == cFim || cIni == 0 || (cIni < 0 || cIni >= 51)) {

                while (cIni == cFim) {
                    System.out.println("Valor repetido, digite novamente: ");
                    cIni = entradaDados.nextInt();
                }
                while (cIni == 0) {
                    System.out.println("Nenhum dado encontrado, digite novamente: ");
                    cIni = entradaDados.nextInt();
                }
                while (cIni < 0 || cIni >= 51) {
                    System.out.println("Insira um valor entre 0 e 50: ");
                    cIni = entradaDados.nextInt();
                }
            }

            System.out.print("Insira o fim do contador: ");
            cFim = entradaDados.nextInt();
            while (cIni == cFim || cFim == 0 || (cFim < cIni || cFim >= 50)) {

                while (cIni == cFim) {
                    System.out.println("Valor repetido! \nDigite novamente: ");
                }
                while (cFim == 0) {
                    System.out.println("Nenhum dado encontrado! Digite novamente: ");
                    cFim = entradaDados.nextInt();
                }
                while (cFim < cIni || cFim >= 50) {
                    System.out.println("Digite um valor a cima de " + cIni + " e até 50: ");
                    cFim = entradaDados.nextInt();
                }

            }
        }
        while (tabIni <= tabFim) {
            System.out.println("Tabuada do [" + tabIni + "]");
            while (cIni <= cFim) {
                System.out.println(tabIni + " X " + cIni + " = " + tabIni * cIni);
                cIni++;
            }
            System.out.println("");
            tabIni++;
            cIni = 0;
        }
    }
}
