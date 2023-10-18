package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra (String palavra) {
        String palavrasParaRemover = null;
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavrasParaRemover = p;
                break;
            }
        }

        palavrasSet.remove(palavrasParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavra() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavras("Java");
        conjuntoPalavrasUnicas.adicionarPalavras("Python");
        conjuntoPalavrasUnicas.adicionarPalavras("C++");
        conjuntoPalavrasUnicas.adicionarPalavras("Python");
        conjuntoPalavrasUnicas.adicionarPalavras("Ruby");

//        conjuntoPalavrasUnicas.exibirPalavra();

        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavra();

        System.out.println("A linguagem Python está no conjunto " + conjuntoPalavrasUnicas.verificarPalavra("Python"));
    }
}
