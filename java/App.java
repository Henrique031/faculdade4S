import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tabIni = 0, tabFim = 0,cIni = 0, cFim = 0;
        boolean erro = false;
        
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.print("Insira a tabuada de inicío: ");
            tabIni = entradaDados.nextInt();
            tabIni == 0 ? System.out.println("Nenhum dado indentificado, digite pelo menos um valor.") : System.out.println();
            while(tabIni <= 1 || tabFim >= 101 ){
                System.out.println("Digite um valor entre 2 e 100");
                System.out.print("Insira a tabuada de inicío: ");
                tabIni = entradaDados.nextInt();
            }
            System.out.print("Insira a tabuada de fim: ");
            tabFim = entradaDados.nextInt();
            while(tabIni <= 1 || tabFim >= 101){
                System.out.println("Digite um valor a cima de " + tabIni + " e até 100" );
                System.out.print("Insira a tabuada de fim: ");
                tabFim = entradaDados.nextInt();
            }
            System.out.print("Insira o inicío do contador: ");
            cIni = entradaDados.nextInt();
            System.out.print("Insira o fim do contador: ");
            cFim = entradaDados.nextInt();
        }
        while (tabIni <= tabFim) {
            System.out.println("Tabuada do [" + tabIni + "]");
            while (cIni <= cFim){
                System.out.println(tabIni + " X " + cIni + " = " + tabIni*cIni);
                cIni++;
                }
        System.out.println("");
        tabIni++;
        cIni = 0;
        }
    }
}
