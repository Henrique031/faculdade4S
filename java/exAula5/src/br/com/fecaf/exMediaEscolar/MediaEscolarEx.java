package exAula5.src.br.com.fecaf.exMediaEscolar;

import java.util.Scanner;

public class MediaEscolarEx {
    public static void main(String[] args) {
        String nomeAluno, nomeProfessor, nomeCurso, nomeDisciplina, sexoAluno, sexoProf;
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0, notaExame;
        boolean femin = false, masc = false;
        
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Digite o nome do aluno: "); //S
            nomeAluno = entradaDados.nextLine();
            if (nomeAluno.length() == 0) {
                System.out.println("Nome não preenchido ");
                System.exit(-1);
            }

            System.out.printf("Digite o nome do professor: "); //S
            nomeProfessor = entradaDados.nextLine();
            if (nomeProfessor.length() == 0) {
                System.out.println("Nome do professor não preenchido ");
                System.exit(-1);
            }

            System.out.printf("Digite o sexo do professor: ");
            sexoProf = entradaDados.nextLine();
            if (sexoProf.length() == 0) {
                System.out.println("Sexo não preenchido ");
                System.exit(-1);
            } 

            System.out.printf("Digite o sexo do aluno: ");
            sexoAluno = entradaDados.nextLine().toLowerCase();
            if (sexoAluno.length() == 0) {
                System.out.println("Sexo não preenchido ");
                System.exit(-1);
            } if (sexoAluno.equals("f") || sexoAluno.equals("feminino") || sexoAluno.equals("femin"))
                femin = true;
                else masc = true;


            System.out.printf("Digite o nome do curso: ");
            nomeCurso = entradaDados.nextLine().toUpperCase();
            if (nomeCurso.length() == 0) {
                System.out.println("Nome do curso não preenchido ");
                System.exit(-1);
            }

            System.out.printf("Digite o nome da disciplina: "); //S
            nomeDisciplina = entradaDados.nextLine();
            if (nomeDisciplina.length() == 0) {
                System.out.println("Nome da disciplina não preenchido ");
                System.exit(-1);
            }

            System.out.printf("Digite a nota 1: ");
            nota1 = entradaDados.nextInt();
            System.out.printf("Digite a nota 2: ");
            nota2 = entradaDados.nextInt();
            System.out.printf("Digite a nota 3: ");
            nota3 = entradaDados.nextInt();
            System.out.printf("Digite a nota 4: ");
            nota4 = entradaDados.nextInt();


            if (nota1 < 0 || nota1 >= 100 )
                System.out.println("[ERRO] Os valores digitados nas notas devem obrigatoriamente estar entre 0 e 100");
                if (nota2 < 0 || nota2 >= 100 )
                System.out.println("[ERRO] Os valores digitados nas notas devem obrigatoriamente estar entre 0 e 100");
                if (nota3 < 0 || nota3 >= 100 )
                System.out.println("[ERRO] Os valores digitados nas notas devem obrigatoriamente estar entre 0 e 100");
                if (nota4 < 0 || nota4 >= 100 )
                System.out.println("[ERRO] Os valores digitados nas notas devem obrigatoriamente estar entre 0 e 100");
   
                media = (nota1 + nota2 + nota3 + nota4) /4;

                if (media >= 70 && femin == true) {
                    System.out.println("A aluna " + nomeAluno + " foi APROVADA na disciplina " + nomeDisciplina );
                    System.out.println("Curso: " + nomeCurso);
                    System.out.println("Professor: " + nomeProfessor);
                    System.out.println("Notas do aluno: " + nota1 + "" + nota2 + "" + nota3 + "" + nota4);
                    System.out.println("Média Final: " + media);

                } else if (media >= 70 && masc == true) {
                    System.out.println("O aluno " + nomeAluno + " foi APROVADO na disciplina de " + nomeDisciplina );
                    System.out.println("Curso: " + nomeCurso);
                    System.out.println("Professor: " + nomeProfessor);
                    System.out.println("Notas do aluno: " + nota1 + "" + nota2 + "" + nota3 + "" + nota4);
                    System.out.println("Média Final: " + media);
                }else if (media < 50) {
                    System.out.println("REPROVADO");
                } else if (media >= 50 && media <= 69) {
                    System.out.println("!EXAME!" );
                    System.out.printf("Digite a nota do exame: ");
                    notaExame = entradaDados.nextFloat();
                if ((media + notaExame) / 2 >= 60 && masc == true) {
                    System.out.println("Se livrou do exeme");
                    System.out.println("O aluno " + nomeAluno + " foi APROVADO na disciplina de " + nomeDisciplina );
                    System.out.println("Curso: " + nomeCurso);
                    System.out.println("Professor(a): " + nomeProfessor);
                    System.out.println("Notas do aluno: " + "Nota 1: " + nota1 + "Nota 2: " + nota2 + "Nota 2: " + nota3 + "Nota 4: " + nota4 + "Nota notaExame: " + notaExame);
                    System.out.println("Média Final: " + media);
                    System.out.println("Média final do Exame: " + (media + notaExame / 2));
                }else if ((media + notaExame) / 2 >= 60 && femin == true) {
                    System.out.println("Se livrou do exame");
                    System.out.println("A aluna " + nomeAluno + " foi APROVADA na disciplina de " + nomeDisciplina );
                    System.out.println("Curso: " + nomeCurso);
                    System.out.println("Professor(a): " + nomeProfessor);
                    System.out.println("Notas da aluna: " + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 2: " + nota3 + "\nNota 4: " + nota4 + "\nNota notaExame: " + notaExame);
                    System.out.println("Média Final: " + media);
                    System.out.println("Média final do Exame: " + (media + notaExame / 2));
                } else System.out.println("REPROVADO");
            }
        }
    }
}
