package br.com.fecaf;

import java.util.Scanner;

public class Secretaria extends Funcionarios {

    Scanner in = new Scanner(System.in);

    private String nomeGrad;
    private String anoIniGrad;
    private int qntdIdioma;

    public Secretaria() {

    }

    public int getQntdIdioma() {
        return qntdIdioma;
    }

    public void setQntdIdioma(int qntdIdioma) {
        this.qntdIdioma = qntdIdioma;
    }

    public String getNomeGrad() {
        return nomeGrad;
    }

    public void setNomeGrad(String nomeGrad) {
        this.nomeGrad = nomeGrad;
    }

    public String getAnoIniGrad() {
        return anoIniGrad;
    }

    public void setAnoIniGrad(String anoIniGrad) {
        this.anoIniGrad = anoIniGrad;
    }

    public void setDadosSecretaria () {
        
        System.out.print("Nome: ");
        this.setNome("Henrique");
        // this.setNome(in.next());
        System.out.print("Data de Nascimento: ");
        this.setDataNasc("31/01/2001");
        // this.setDataNasc(in.next());
        System.out.print("Telefone: ");
        this.setCel("4138-5242");
        // this.setTelFixo(in.next());
        System.out.print("Celular: ");
        this.setTelFixo("1198498-5242");
        // this.setCel(in.next());
        System.out.print("E-mail: ");
        this.setEmail("rique.31galdino@hotmail.com");
        // this.setEmail(in.next());
        System.out.print("Data de Admissão: ");
        this.setDataAdmiss("01/05/2010");
        // this.setDataAdmiss(in.next());
        System.out.print("Data de Demissão: ");
        this.setDataDemiss("10/05/2020");
        // this.setDataDemiss(in.next());
        System.out.print("Valor hora: "); //220
        this.setValorHora(in.nextFloat());
        System.out.println("Valor Hora: " + getValorHora());
        System.out.print("Número de Matricula: ");
        this.setMatricula(30225);
        // this.setMatricula(in.nextInt());
        System.out.print("Horas trabalhas no mês: ");
        this.setHrsTBLsMes(in.nextInt());
        System.out.println("Horas trabalhadas: " + getHrsTBLsMes());
        
        System.out.print("Nome da Graduação: ");
        this.setNomeGrad("ADS");
        // this.setNomeGrad(in.next());
        System.out.print("Ano de Início da Graduação: ");
        this.setAnoIniGrad("2010");
        // this.setAnoIniGrad(in.next());
        System.out.print("Quantidade de Idiomas: ");
        this.setQntdIdioma(in.nextInt()); 
        
    }

    public void getDadosSecretaria () {

        System.out.println("");
        System.out.println(" ############ Secretária ############# ");
        System.out.println("");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("Telefone: " + this.getTelFixo());
        System.out.println("Celular: " + this.getCel());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Data de Admissão: " + this.getDataAdmiss());
        System.out.println("Data de Demissão: " + this.getDataDemiss());
        System.out.println("Valor da hora: " + this.getValorHora());
        System.out.println("Número da Matricula: " + this.getMatricula());
        System.out.println("Horas Trabalhadas no mês: " + this.getHrsTBLsMes());
        System.out.println("Gradução: " + this.getNomeGrad());
        System.out.println("Ano de Inicio da Gradução: " + this.getAnoIniGrad());
        System.out.println("Quantidade de Idiomas Falados: " + this.getQntdIdioma());
        
    }

}
