package aula07Ex01.src.br.com.fecaf.tabuadaEx01;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {

        int tabIni = 0, tabFim = 0, cIni = 0, cFim = 0;

        try (Scanner entradaDados = new Scanner(System.in)) {

            System.out.print("Insira a tabuada de inicío entre [2 e 100]: ");
            tabIni = entradaDados.nextInt();
            ValidacaoIni(tabIni);

            System.out.print("Insira a tabuada de fim entre [" + tabIni + " e 100]: ");
            tabFim = entradaDados.nextInt();
            ValidacaoFim(tabIni, tabFim);

            System.out.print("Insira o inicío do contador entre [0 e 50]: ");
            cIni = entradaDados.nextInt();
            ValidContadorIni(cIni, cFim);


            System.out.print("Insira o fim do contador entre [" + cIni + " e 50]: ");
            cFim = entradaDados.nextInt();
            ValidContadorFim(cIni, cFim);
           
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

    public static void ValidacaoIni(int x) {
        Scanner entradaDados = new Scanner(System.in);
        while (x == 0 || (x <= 1 || x >= 101)) {

            while (x == 0) {
                System.out.println("[ERRO] Nenhum dado indentificado, digite pelo menos um valor: .");
                x = entradaDados.nextInt();
            }
            while (x <= 1 || x >= 101) {
                System.out.println("[ERRO] Digite um valor entre 2 e 100: ");
                x = entradaDados.nextInt();
            }
        }

    }

    public static void ValidacaoFim(int x, int y) {
        Scanner entradaDados = new Scanner(System.in);
        while (x == y || y == 0 || (y <= x || y >= 100)) {

            while (x == y) {
                System.out.println("[ERRO] Dados repetidos, digite novamente: ");
                y = entradaDados.nextInt();
            }
            while (y == 0) {
                System.out.println("[ERRO] Nenhum dado encontrado, digite novamente: ");
                y = entradaDados.nextInt();
            }
            while (y <= x || y >= 100) {
                System.out.println("[ERRO] Digite um valor a cima de " + x + " e até 100: ");
                y = entradaDados.nextInt();
            }
        }
    }

    public static void ValidContadorIni(int cIni, int cFim) {
        Scanner entradaDados = new Scanner(System.in);
        while (cIni == cFim || cIni == 0 || (cIni < 0 || cIni >= 51)) {
            while (cIni == cFim) {
                System.out.println("[ERRO] Valor repetido, digite novamente: ");
                cIni = entradaDados.nextInt();
            }
            while (cIni == 0) {
                System.out.println("[ERRO] Nenhum dado encontrado, digite novamente: ");
                cIni = entradaDados.nextInt();
            }
            while (cIni < 0 || cIni >= 51) {
                System.out.println("[ERRO] Insira um valor entre 0 e 50: ");
                cIni = entradaDados.nextInt();
            }

        }
    }

    public static void ValidContadorFim(int cIni, int cFim) {
        Scanner entradaDados = new Scanner(System.in);
        while (cIni == cFim || cFim == 0 || (cFim < cIni || cFim >= 50)) {

            while (cIni == cFim) {
                System.out.println("[ERRO] Valor repetido! \nDigite novamente: ");
                cFim = entradaDados.nextInt();
            }
            while (cFim == 0) {
                System.out.println("[ERRO] Nenhum dado encontrado! Digite novamente: ");
                cFim = entradaDados.nextInt();
            }
            while (cFim < cIni || cFim >= 50) {
                System.out.println("[ERRO] Digite um valor a cima de " + cIni + " e até 50: ");
                cFim = entradaDados.nextInt();
            }

        }

    }
}
