package set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private long cod;

    private String nome;

    private int quantidade;

    private double preco;

    public Produto(long cod, String nome, int quantidade, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
