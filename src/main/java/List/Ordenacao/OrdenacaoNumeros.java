package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenarAscendente = new ArrayList<>(numeros);
        Collections.sort(ordenarAscendente);

        return ordenarAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(numeros);
        numerosDescendentes.sort(Collections.reverseOrder());
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros();

        numero.adicionarNumero(2);
        numero.adicionarNumero(5);
        numero.adicionarNumero(4);
        numero.adicionarNumero(1);
        numero.adicionarNumero(99);

        System.out.println(numero.ordenarAscendente());

        System.out.println(numero.ordenarDescendente());
    }


}
