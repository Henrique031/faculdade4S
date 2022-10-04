package br.com.fecaf.produto;

public class Produto {
    
    public int id;
    public String nome;
    public String descricao;
    public int qtdeEstoque;
    public double valorCompra;
    public double valorVenda;
    public String statusProduto;


    public void listagemProduto() {
        System.out.println("Id do produto: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade de Estoque: " + this.qtdeEstoque);
        System.out.println("Valor da Compra: " + this.valorCompra);
        System.out.println("Valor da Venda: " + this.valorVenda);
        System.out.println("Status do Produto: " + this.statusProduto);

    }

    public void calcularValorVenda (double porcental) {
        double reajuste;
        reajuste = (((porcental / 100) + 1) * this.valorCompra);
        System.out.println("Reajuste é de: " + reajuste);
    }
    
    public void validarEstoque () {
        // System.out.println(qtdeEstoque <= 8 ? "Nível crítico" : "");
        if (this.qtdeEstoque <= 8)
            System.out.println("Nível crítico");
        else if( this.qtdeEstoque <= 12)
            System.out.println("Nível baixo");
        else if (this.qtdeEstoque > 12)
            System.out.println("Nível Normal");
    }

}
