package br.com.fecaf.olaMundo;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        String nome = null;

        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.print("Digitar seu nome: ");
            nome = entradaDados.next();
        }

        System.out.println("Olá mundo para você " + nome);
    }
}