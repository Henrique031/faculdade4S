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
        
        setDadosFuncionario();
        
        System.out.print("Nome da Graduação: ");
        this.setNomeGrad(in.next());
        System.out.print("Ano de Início da Graduação: ");
        this.setAnoIniGrad(in.next());
        System.out.print("Quantidade de Idiomas: ");
        this.setQntdIdioma(in.nextInt()); 
        
    }

    public void getDadosSecretaria () {
        
    }

}
