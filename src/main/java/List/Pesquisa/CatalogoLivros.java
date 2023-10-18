package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> catalagoLivros;

    public CatalogoLivros() {
        this.catalagoLivros = new ArrayList<>();
    }

    public void adicionarLivro (String nome, String autor, int anoPublicacao) {
        Livro livro = new Livro(nome, autor, anoPublicacao);
        catalagoLivros.add(livro);
    }

    public List<Livro> pesqueisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalagoLivros.isEmpty()) {
           for (Livro l : catalagoLivros) {
               if (l.getAutor().equalsIgnoreCase(autor)) {
                   livrosPorAutor.add(l);
               }
           }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!catalagoLivros.isEmpty()) {
            for (Livro l : catalagoLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPortitulo = null;
        if (!catalagoLivros.isEmpty()) {
            for (Livro l : catalagoLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPortitulo = l;
                    break;
                }
            }
        }
        return livroPortitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesqueisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
