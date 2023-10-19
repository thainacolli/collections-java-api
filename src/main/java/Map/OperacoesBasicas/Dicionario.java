package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> paralvrasMap;

    public Dicionario() {
        this.paralvrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String paralvra, String definicao) {
        paralvrasMap.put(paralvra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!paralvrasMap.isEmpty()) {
            paralvrasMap.remove(palavra);
        }
    }

    public void exibirPalavra() {
        System.out.println(paralvrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!paralvrasMap.isEmpty()) {
            definicaoPorPalavra = paralvrasMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavra();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da Linguagem Java: " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavra();
    }
}
