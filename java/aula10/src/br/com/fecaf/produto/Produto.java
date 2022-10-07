package br.com.fecaf.produto;

public class Produto {
    
    private int id;
    private String nome;
    private String descricao;
    private int qtdeEstoque;
    private double valorCompra;
    private double valorVenda;
    private String statusProduto;


    public void listagemProduto() {
        System.out.println("Id do produto: " + this.id);
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade de Estoque: " + this.qtdeEstoque);
        System.out.println("Valor da Compra: " + this.valorCompra);
        System.out.println("Valor da Venda: " + this.valorVenda);
        System.out.println("Status do Produto: " + this.statusProduto);

    }

    public void calcularValorVenda (double porcental) {
        double valorVenda = 0;
        valorVenda = this.valorCompra+((this.valorCompra*porcental))/100;
        this.valorVenda = valorVenda;
    }
    
    public void validarEstoque () {
        // System.out.println(qtdeEstoque <= 8 ? "Nível crítico" : "");
        if (this.qtdeEstoque <= 8)
            this.statusProduto = "Nível crítico";
            else if( this.qtdeEstoque <= 12)
            this.statusProduto = "Nível baixo";
            else if (this.qtdeEstoque > 12)
            this.statusProduto = "Nível normal";
    }

    //set - significa guardar
    //get - significa pegar

    //get Nome
    public void setNome (String nome) {
        this.nome = nome.toUpperCase();
    }

    // get Nome
    public String getNome() {
        return this.nome;
    }

}
