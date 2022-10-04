package br.com.fecaf.produto;

public class Principal {
    public static void main(String[] args) throws Exception {

        Produto produto = new Produto();

        produto.id = 1;
        produto.nome = "Henrique";
        produto.descricao = "Uma lenda imortal";
        produto.qtdeEstoque = 1;
        produto.valorCompra = 500;
        produto.valorVenda = 400;
        produto.statusProduto = "Ativado";

        produto.listagemProduto();
        produto.calcularValorVenda(0.2);
        produto.validarEstoque();


    }
}
