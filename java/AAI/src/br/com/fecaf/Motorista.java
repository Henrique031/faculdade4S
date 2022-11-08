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

    public void setDadosMotorista () {
        
        setDadosFuncionario();
        
        System.out.print("Categoria: [Moto, Carro, Van ou Caminhão]");
        this.setCategoria(in.next());
        System.out.print("Data da Primeira Habilitação: ");
        this.setDataPrimHabit(in.next());
        System.out.print("Data de Validade da Habilitação: ");
        this.setDataVaid(in.next());
        System.out.print("Número CNH: ");
        this.setNumCNH(in.nextInt());
        
    }

    public void getDadosMotorista () {
        
    }

}
