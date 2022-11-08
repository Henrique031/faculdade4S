package br.com.fecaf;

import java.util.Scanner;

public class Funcionarios {

    Scanner in = new Scanner(System.in);

    private String nome;
    private String dataNasc;
    private String telFixo;
    private String cel;
    private String email;
    private String dataAdmiss;
    private String dataDemiss;
    private String cargo;
    private float valorHora;
    private int matricula;

    public Funcionarios() {

    }

    public Funcionarios(String cargo) { // construtor Funcionarios
        if (cargo.toUpperCase().equals("S"))
            this.cargo = "Secretaria";
        else if (cargo.toUpperCase().equals("M"))
            this.cargo = "Motorista";
        else if (cargo.toUpperCase().equals("F"))
            this.cargo = "Funcionario";
        else {
            System.out.println("Nenhum Codigo Encontrado");
            System.exit(-1);
        }
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAdmiss() {
        return dataAdmiss;
    }

    public void setDataAdmiss(String dataAdmiss) {
        this.dataDemiss = dataAdmiss;
    }

    public String getDataDemiss() {
        return dataDemiss;
    }

    public void setDataDemiss(String dataDemiss) {
        this.dataDemiss = dataDemiss;
    }

    public void setDadosFuncionario () {
        System.out.print("Nome: ");
        this.setNome(in.next());
        System.out.print("Data de Nascimento: ");
        this.setDataNasc(in.next());
        System.out.print("Telefone: ");
        this.setTelFixo(in.next());
        System.out.print("Celular: ");
        this.setCel(in.next());
        System.out.print("E-mail: ");
        this.setEmail(in.next());
        System.out.print("Data de Admissão: ");
        this.setDataAdmiss(in.next());
        System.out.print("Data de Demissão: ");
        this.setDataDemiss(in.next());
        System.out.print("Valor Hora: ");
        this.setValorHora(in.nextFloat());
        System.out.print("Número de Matricula: ");
        this.setMatricula(in.nextInt());



    }

}
