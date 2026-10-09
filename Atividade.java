public class Atividade {
    private String nome;
    private int prioridade; // Ex: prioridades numéricas (quanto maior, maior a prioridade)

    public Atividade(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + " | Prioridade: " + prioridade;
    }
}
