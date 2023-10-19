package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendadaContatoMap;

    public AgendaContatos() {
        this.agendadaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendadaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendadaContatoMap.isEmpty()) {
            agendadaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendadaContatoMap);
    }

    public Integer pesquisarporNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendadaContatoMap.isEmpty()) {
           numeroPorNome = agendadaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Clara", 65498);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarporNome("Clara"));


    }
}
