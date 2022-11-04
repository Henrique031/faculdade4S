package br.com.fecaf.encapsulamento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Escolha o Curso: ");

        // Instanciar a classe Aluno
        Aluno aluno1 = new Aluno(entradaDados.next());

        System.out.print("Digite o RA:");
        aluno1.setRa(entradaDados.next());
        System.out.print("Digite o Nome:");
        aluno1.setNome(entradaDados.next());
        System.out.print("Digite o SobreNome:");
        // Cria uma nova instancia do objeto para resolver o bug do nextLine()
        entradaDados = new Scanner(System.in);
        aluno1.setSobreNome(entradaDados.nextLine());
        System.out.print("Digite o sexo [M | F]:");
        aluno1.setSexo(entradaDados.next());
        System.out.print("Digite a data de nascimento:");
        aluno1.setDataNascimento(entradaDados.next());
        // aluno1.setTipoCurso("P");

        aluno1.getDadosAluno();

        Aluno aluno2 = new Aluno("C");

    }

}
