package br.com.fecaf;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Cargos: \n   [F] => Funcionario\n   [M] => Motorista\n   [S] => Secretaria  ");
            System.out.print("Digite o Código do seu Cargo: ");
            Funcionarios func = new Funcionarios(in.next());

            System.out.println("");
            System.out.println(" ########### " + func.getCargo() + " ########### ");
            System.out.println("");


            if(func.getCargo().equals("Funcionario")) {
                func.setDadosFuncionario();
            }

            Secretaria sec = new Secretaria();
            if(func.getCargo().equals("Secretaria")) {
                sec.setDadosSecretaria();
            }

            Motorista motor = new Motorista();
            if(func.getCargo().equals("Motorista")){
                motor.setDadosMotorista();
            }
            
            
        }
    }
}
