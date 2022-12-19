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
    private int hrsTBLsMes;

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


    public int getHrsTBLsMes() {
        return hrsTBLsMes;
    }

    public void setHrsTBLsMes(int hrsTBLsMes) {
        this.hrsTBLsMes = hrsTBLsMes;
    }

    public void setDadosFuncionario () {

        System.out.print("Nome: ");
        this.setNome(in.next());
        // this.setNome("Henrique");

        System.out.print("Data de Nascimento: ");
        this.setDataNasc(in.next());
        // this.setDataNasc("31/01/2001");

        System.out.print("Telefone: ");
        this.setTelFixo(in.nextLine());
        // this.setCel("4138-5242");

        System.out.print("Celular: ");
        this.setCel(in.nextLine());
        // this.setTelFixo("1198498-5242");

        System.out.print("E-mail: ");
        this.setEmail(in.nextLine());

        System.out.print("Data de Admissão: ");
        this.setDataAdmiss(in.nextLine());
        // this.setDataAdmiss("01/05/2010");

        System.out.print("Data de Demissão: ");
        this.setDataDemiss(in.nextLine());
        // this.setDataDemiss("10/05/2020");

        System.out.print("Valor hora: "); //220
        this.setValorHora(in.nextFloat());

        System.out.print("Número de Matricula: ");
        this.setMatricula(in.nextInt());
        // this.setMatricula(30225);

        System.out.print("Horas trabalhas no mês: ");
        this.setHrsTBLsMes(in.nextInt());

    }

    public void getDadosFunc () {

        System.out.println("");
        System.out.println(" ############ Funcionario ############# ");
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
        
    }

}
