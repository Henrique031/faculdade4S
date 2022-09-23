import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeFunc, nomeR = "";
        int qtdeAnosEmpresa;
        double reajuste = 0, salFunc = 0;

        DecimalFormat DF = new DecimalFormat("#.0");


        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite o nome do funcionário: ");
            nomeFunc = in.nextLine();

            System.out.println("Digite a quantidade de anos que o funcionário tem de empresa: ");
            qtdeAnosEmpresa = in.nextInt();

            System.out.print("Digite o salário do funcionário: ");
            salFunc = in.nextInt();
        }

        if (qtdeAnosEmpresa <= 5) {
            reajuste = ((0.10 + 1) * salFunc);
            nomeR = "10%";
        } else if (qtdeAnosEmpresa >= 6 && qtdeAnosEmpresa <= 8) {
            reajuste = ((0.20 + 1) * salFunc);
            nomeR = "20%";
        } else if (qtdeAnosEmpresa >= 9 && qtdeAnosEmpresa <= 15) {
            reajuste = ((0.25 + 1) * salFunc);
            nomeR = "25%";
        } else if (qtdeAnosEmpresa >= 16) {
            reajuste = ((0.30 + 1) * salFunc);
            nomeR = "30%";
        }
        System.out.println("");
        System.out.println("O reajuste foi de: " + nomeR);
        System.out.println("Novo salário é: " + DF.format(reajuste) );

    }
}
