package br.com.fecaf;

import java.util.Scanner;

public class Motorista extends Funcionarios {

    Scanner in = new Scanner(System.in);

    private String categoria;
    private String dataPrimHabit;
    private String dataValid;
    private int numCNH;
    

    public Motorista() {

    }

    public int getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(int numCNH) {
        this.numCNH = numCNH;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataPrimHabit() {
        return dataPrimHabit;
    }

    public void setDataPrimHabit(String dataPrimHabit) {
        this.dataPrimHabit = dataPrimHabit;
    }

    public String getDataValid() {
        return dataValid;
    }

    public void setDataVaid(String dataValid) {
        this.dataValid = dataValid;
    }

    public void setDadosMotorista() {

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
        this.setValorHora(2);
        // this.setValorHora(in.nextFloat());
        System.out.print("Número de Matricula: ");
        this.setMatricula(30225);
        // this.setMatricula(in.nextInt());
        System.out.print("Horas trabalhas no mês: ");
        this.setHrsTBLsMes(220);
        // this.setHrsTBLsMes(in.nextInt());

        System.out.print("Categorias: \n   [C] => Carro\n   [M] => Moto\n   [V] => Van\n   [CM] => Caminhão\n");
        System.out.print("Código: ");
        this.setCategoria(in.next());
        System.out.print("Data da Primeira Habilitação: ");
        this.setDataPrimHabit("03/05/1990");
        // this.setDataPrimHabit(in.next());
        System.out.print("Data de Validade da Habilitação: ");
        this.setDataVaid("01/01/2023");
        // this.setDataVaid(in.next());
        System.out.print("Número CNH: ");
        this.setNumCNH(123);
        // this.setNumCNH(in.nextInt())

    }

    public void getDadosMotorista() {

        System.out.println("");
        
        System.out.println(" ############ " + this.getCategoria() + " ############# ");
        
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
        System.out.println("Data da Primeira habilitação: " + this.getDataPrimHabit());
        System.out.println("Data de Validade da Habilitação: " + this.getDataValid());
        System.out.println("Número da CNH: " + this.getNumCNH());

    }




}
