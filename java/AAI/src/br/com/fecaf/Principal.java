package br.com.fecaf;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Escolha o seu Cargo na Lista Abaixo");
            System.out.println("Cargos: \n   [F] => Funcionario\n   [M] => Motorista\n   [S] => Secretaria  ");
            System.out.print("Digite o Código do seu Cargo: ");
            Funcionarios func = new Funcionarios(in.next());

            Secretaria sec = new Secretaria();
            Motorista motor = new Motorista();


            if (func.getCargo().equals("Funcionario")) {
                func.setDadosFuncionario();
                float valorHoraFunc = func.getValorHora();
                int hrsTBLDsMes = func.getHrsTBLsMes();

                float salFunc = (hrsTBLDsMes * valorHoraFunc);
                func.getDadosFunc();
                System.out.println("Salario: " + salFunc);
            } else if (func.getCargo().equals("Secretaria")) {
                sec.setDadosSecretaria();

                float sal;
                float valorHora = sec.getValorHora();
                float hrsTBLsMes = sec.getHrsTBLsMes();
                float qntdIdioma = sec.getQntdIdioma();

                double result = qntdIdioma * 3.80;

                valorHora += result;

                sal = valorHora * hrsTBLsMes;

                sec.getDadosSecretaria();
                System.out.println("Salario: " + sal);

            } else if (func.getCargo().equals("Motorista")) {

                float bonusMotor = 0;

                motor.setDadosMotorista();

                float sal;
                float valorHora = motor.getValorHora();
                float hrsTBLsMes = motor.getHrsTBLsMes();

                if (motor.getCategoria().toUpperCase().equals("M")) {
                    // System.out.println("Moto");
                    motor.setCategoria("Motociclista");
                    bonusMotor += 1;
                } else if (motor.getCategoria().toUpperCase().equals("C")) {
                    // System.out.println("Carro");
                    motor.setCategoria("Motorista");
                    bonusMotor += 2;
                } else if (motor.getCategoria().toUpperCase().equals("V")) {
                    // System.out.println("Van");
                    motor.setCategoria("Motorista");
                    bonusMotor += 3;
                } else if (motor.getCategoria().toUpperCase().equals("CM")) {
                    // System.out.println("Caminhão");
                    motor.setCategoria("Caminhoneiro");
                    bonusMotor += 4;
                } else {
                    System.out.println("Nenhuma COD encontrado");
                    System.exit(-1);
                }
                bonusMotor += 2;

                sal = (valorHora + bonusMotor) * hrsTBLsMes;

                motor.getDadosMotorista();
                System.out.println("Salario: " + sal);


            } else {
                System.out.println("Nenhuma cargo encontrado");
                System.exit(-1);
            }
        }
    }

}
