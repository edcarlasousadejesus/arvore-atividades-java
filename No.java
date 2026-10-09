public class No {
    Atividade atividade;
    No esquerda;
    No direita;

    public No(Atividade atividade) {
        this.atividade = atividade;
        this.esquerda = null;
        this.direita = null;
    }
}