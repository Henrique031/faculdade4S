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

                float salTotal = 0;

                motor.setDadosMotorista();

                float hrsTBLsMes = motor.getValorHora();
                // System.out.println(hrsTBLsMes);
                float sal = motor.getSal();
                // System.out.println(sal);

                if (motor.getCategoria().toUpperCase().equals("M")){
                    System.out.println("Moto");
                    salTotal += 1;
                }
                else if (motor.getCategoria().toUpperCase().equals("C")) {
                    System.out.println("Carro");
                    salTotal += 2;
                }
                else if (motor.getCategoria().toUpperCase().equals("V")) {
                    System.out.println("Van");
                    salTotal += 3;
                }
                else if (motor.getCategoria().toUpperCase().equals("CM")) {
                    System.out.println("Caminhão");
                    salTotal += 4;
                }
                else {
                    System.out.println("Nenhuma COD encontrado");
                    System.exit(-1);
                }

                //2,00 por hrsTBLDsMes mais o salario
                salTotal = hrsTBLsMes * 2 + sal;

                System.out.println(salTotal);

            }
        }
    }


}
