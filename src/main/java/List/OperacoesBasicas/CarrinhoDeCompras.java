package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco , int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem (String nome) {
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
        }
        listaItens.removeAll(itemRemover);
    }

    public double calcularValorTotal() {

        double valorTotal = 0;
        for (Item i : listaItens) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItem () {
        System.out.println(this.listaItens);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Caneta", 2.20, 1);
        carrinho.adicionarItem("Borracha", 3.00, 1);
        carrinho.adicionarItem("Lapiseira", 5.00, 1);

        carrinho.exibirItem();

        carrinho.removerItem("Lápis");

        carrinho.exibirItem();

        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());

    }
}
