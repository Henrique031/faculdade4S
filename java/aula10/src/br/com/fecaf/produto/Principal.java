package br.com.fecaf.produto;

public class Principal {
    public static void main(String[] args) throws Exception {

        // System.out.println("Olá mundo");
        Produto produto = new Produto();

        produto.id = 1;
        produto.setNome("Henrique");
        produto.descricao = "Uma lenda imortal";
        produto.qtdeEstoque = 1;
        produto.valorCompra = 500;
        // produto.valorVenda = 400;
        produto.statusProduto = "";


        produto.validarEstoque();
        produto.calcularValorVenda(10);
        produto.listagemProduto();


    }
}
