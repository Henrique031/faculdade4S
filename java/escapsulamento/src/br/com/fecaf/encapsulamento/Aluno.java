package br.com.fecaf.encapsulamento;

import java.time.LocalDate;

public class Aluno {
    // Atributos da classe (sempre para ser acessado precisa do this)
    private int id;
    private String ra;
    private String nome;
    private String sobreNome;
    private String nomeCompleto;
    private String sexo;
    private String descricaoSexo;
    private String dataNascimento;
    private int idade;
    private String tipoCurso;

    // Construtor
    public Aluno(String tipoCurso) {
        if (tipoCurso.toUpperCase().equals("G"))
            this.tipoCurso = "Graduação";
        else if (tipoCurso.toUpperCase().equals("C"))
            this.tipoCurso = "Colégio";
        else if (tipoCurso.toUpperCase().equals("P"))
            this.tipoCurso = "Pós-Graduação";
    }

    // Getters e Setters

    // Get id
    public int getId() {
        return this.id;
    }

    // Get ra
    public String getRa() {
        return this.ra;
    }

    // Set ra
    public void setRa(String ra) {
        this.ra = ra;
    }

    // Get nome
    public String getNome() {
        return this.nome;
    }

    // Set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get sobreNome
    public String getSobreNome() {
        return this.sobreNome;
    }

    // Set sobreNome
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        if (!this.nome.equals(null) && !this.sobreNome.equals(null))
            this.nomeCompleto = this.nome + " " + this.sobreNome;
        else
            System.out.println("Nome ou sobreNome não pode ser vazio!");
    }

    // Get nomeConpleto (Junção do nome e do sobreNome)
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    // Get sexo
    public String getSexo() {
        return this.sexo;
    }

    // Set sexo
    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase(); // Padroniza para MAIUSCULO a letra
        if (this.sexo.equals("M"))
            this.descricaoSexo = "Masculino";
        else if (this.sexo.equals("F"))
            this.descricaoSexo = "Feminino";
        else if (this.sexo.equals("") || this.sexo.equals(null))
            System.out.println("O sexo precisa ser informado corretamente");

    }

    // Get descricaoSexo (Esse item será criado no momento de gravar
    // a letra correspondente ao sexo do aluno [M/F])
    public String getDescricaoSexo() {
        return this.descricaoSexo;
    }

    // Get dataNascimento
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    // Set dataNascimento
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;

        // Retorna apenas a parte referente ao ano da data de nascimento do aluno
        int anoNascimento = Integer.parseInt(this.dataNascimento.substring(6, 10));

        // Retorna a data atual
        LocalDate dataAtual = LocalDate.now();

        // Retorna somente o ano da data atual
        int anoAtual = dataAtual.getYear();

        // Guarda a idade atualizada do aluno
        this.idade = anoAtual - anoNascimento;

    }

    // Get idade (Será o calculado conforme o ano corrente e
    // a data de nascimento do aluno)
    public int getIdade() {
        return this.idade;
    }

    // Retorna o tipo do curso
    public String getTipoCurso() {
        return this.tipoCurso;
    }

    // Guarda o tipo do curso
    private void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    // Metodos da classe

    // Retorna o print de todos os dados referente a um aluno
    public void getDadosAluno() {
        System.out.println(" ################ Relatório de dados do aluno ##################");
        System.out.println("RA: " + this.getRa());
        System.out.println("Nome: " + this.getNomeCompleto());
        System.out.println("Sexo: [" + this.getSexo() + "]-" + this.getDescricaoSexo());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("O aluno " + this.getNome() + " tem " + this.getIdade() + " anos.");
        System.out.println("Tipo do Curso: " + this.getTipoCurso());
    }
}

// Metodos da classe

// Construtor
// Ele é um método especial, que é executado sempre que a classe é instaciada

// Oque é uma sobrecarga de construtor
// São métodos especiais que podem ser executados no momento que a classe é
// instaciada (Oque vai diferenciar o construtor do outro é a quantidade de
// argumentos e os tipos de dados)