import java.util.Scanner;

public class MediaEscolar {
    public static void main (String[] args) {
        float n1, n2, n3, n4;
        float media;


        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = entradaDados.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = entradaDados.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = entradaDados.nextFloat();
        System.out.print("Digite a quarta nota: ");
        n4 = entradaDados.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é: " + media );
    }
}
