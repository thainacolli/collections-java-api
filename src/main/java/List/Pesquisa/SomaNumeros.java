package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> listsoma;

    public SomaNumeros() {
        this.listsoma = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        this.listsoma.add(numero);
    }

    public int calcularSoma () {
        int soma = 0;
        if (!listsoma.isEmpty()) {
            for (Integer numero : listsoma) {
                soma += numero;
            }
        }

        return soma;
    }

    public int encontraMaiorNumero() {
        int maiorNumero = 0;
        if (!listsoma.isEmpty()) {
            for(Integer numero : listsoma) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontraMenorNumero() {
        int menorNumero = 0;
        if (!listsoma.isEmpty()) {
            for (Integer numero : listsoma) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNuemros() {
        if (!listsoma.isEmpty()) {
            System.out.println(this.listsoma);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados: ");
        somaNumeros.exibirNuemros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontraMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontraMenorNumero());




    }
}
