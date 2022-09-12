package br.com.fecaf.olamundo;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) throws Exception {
        String nome = null;

        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.print("Digitar seu nome: ");
            nome = entradaDados.next();
        }

        System.out.println("Olá mundo para você " + nome);
    }
}
