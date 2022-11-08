package br.com.fecaf;

import java.util.Scanner;

public class Motorista extends Funcionarios {

    Scanner in = new Scanner(System.in);

    private String categoria;
    private String dataPrimHabit;
    private String dataValid;
    private float sal;
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

    public float getSal() {
        return sal;
    }

    public void setSal (int sal) {
        this.sal = sal;
    }


    public void setDadosMotorista () {
        
        setDadosFuncionario();
        
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
        // this.setNumCNH(in.nextInt());
        System.out.print("Salario: ");
        this.setSal(in.nextInt());

        //media de hrsTBLDs são 220hrs
        
    }

    public void getDadosMotorista () {
        
    }

}
