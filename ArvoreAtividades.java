public class ArvoreAtividades {
    private No raiz;

    public ArvoreAtividades() {
        this.raiz = null;
    }

    // Inserir atividade na árvore com base na prioridade
    public void inserir(String nome, int prioridade) {
        Atividade novaAtividade = new Atividade(nome, prioridade);
        raiz = inserirRecursivo(raiz, novaAtividade);
        System.out.println("Atividade cadastrada com sucesso!");
    }

    private No inserirRecursivo(No atual, Atividade atividade) {
        if (atual == null) {
            return new No(atividade);
        }

        if (atividade.getPrioridade() < atual.atividade.getPrioridade()) {
            atual.esquerda = inserirRecursivo(atual.esquerda, atividade);
        } else if (atividade.getPrioridade() > atual.atividade.getPrioridade()) {
            atual.direita = inserirRecursivo(atual.direita, atividade);
        } else {
            System.out.println("Já existe uma atividade com essa prioridade!");
        }

        return atual;
    }

    // Buscar atividade por prioridade
    public Atividade buscarPorPrioridade(int prioridade) {
        No resultado = buscarRecursivo(raiz, prioridade);
        if (resultado != null) {
            return resultado.atividade;
        }
        return null;
    }

    private No buscarRecursivo(No atual, int prioridade) {
        if (atual == null || atual.atividade.getPrioridade() == prioridade) {
            return atual;
        }

        if (prioridade < atual.atividade.getPrioridade()) {
            return buscarRecursivo(atual.esquerda, prioridade);
        }

        return buscarRecursivo(atual.direita, prioridade);
    }

    // Percurso Em-Ordem (In-Order: Esquerda -> Raiz -> Direita)
    public void percursoEmOrdem() {
        System.out.println("\n--- Percurso Em-Ordem ---");
        emOrdemRecursivo(raiz);
    }

    private void emOrdemRecursivo(No no) {
        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.println(no.atividade);
            emOrdemRecursivo(no.direita);
        }
    }

    // Percurso Pré-Ordem (Pre-Order: Raiz -> Esquerda -> Direita)
    public void percursoPreOrdem() {
        System.out.println("\n--- Percurso Pré-Ordem ---");
        preOrdemRecursivo(raiz);
    }

    private void preOrdemRecursivo(No no) {
        if (no != null) {
            System.out.println(no.atividade);
            preOrdemRecursivo(no.esquerda);
            preOrdemRecursivo(no.direita);
        }
    }

    // Percurso Pós-Ordem (Post-Order: Esquerda -> Direita -> Raiz)
    public void percursoPosOrdem() {
        System.out.println("\n--- Percurso Pós-Ordem ---");
        posOrdemRecursivo(raiz);
    }

    private void posOrdemRecursivo(No no) {
        if (no != null) {
            posOrdemRecursivo(no.esquerda);
            posOrdemRecursivo(no.direita);
            System.out.println(no.atividade);
        }
    }
}
