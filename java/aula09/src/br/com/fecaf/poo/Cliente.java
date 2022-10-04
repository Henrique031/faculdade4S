package br.com.fecaf.poo;

public class Cliente {
    
    public int id;
    public String nome;
    public String cpf;
    public String email;
    public String dataNascimento;
    public String telefone;

    public void ListagemCliente() {
        System.out.println("Código do cliente: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Telefone: " + this.telefone);
    }
}
