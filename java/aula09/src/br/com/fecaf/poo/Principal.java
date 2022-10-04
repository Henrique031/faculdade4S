package br.com.fecaf.poo;

public class Principal {
    static void main (String[] args) throws Exception {
        
        Cliente cliente = new Cliente();

        cliente.id = 0;
        cliente.nome = "Henrique Lenda Imortal";
        cliente.cpf = "512.477.279.35";
        cliente.email = "riqueLendaViva@hotmail.com";
        cliente.telefone = "1198498-5242";
        cliente.dataNascimento = "31/01/2001";

        Cliente cliente1 = new Cliente();
        cliente1.id = 1;
        cliente1.nome = "Fernando de noronha";
        cliente1.cpf = "477.336.345.22";
        cliente1.email = "FutebolVeia@outlook.com";
        cliente1.telefone = "1196434-5132";
        cliente1.dataNascimento = "01/01/2002";

    }
}
