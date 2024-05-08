import java.util.ArrayList;
import java.util.List;


class agenda {

    private List<Contato> contatos;

    public agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                System.out.println("Contato removido: " + nome);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }
}
