import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreAtividades arvore = new ArvoreAtividades();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== GERENCIADOR DE ATIVIDADES (ÁRVORE) ===");
            System.out.println("1 - Inserir Atividade");
            System.out.println("2 - Buscar Atividade por Prioridade");
            System.out.println("3 - Percorrer Em-Ordem");
            System.out.println("4 - Percorrer Pré-Ordem");
            System.out.println("5 - Percorrer Pós-Ordem");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            try {
                int op = Integer.parseInt(sc.nextLine());

                if (op == 0) {
                    System.out.println("Encerrando o sistema...");
                    break;
                }

                switch (op) {
                    case 1:
                        System.out.print("Nome da atividade: ");
                        String nome = sc.nextLine();
                        System.out.print("Prioridade (número inteiro): ");
                        int prio = Integer.parseInt(sc.nextLine());
                        arvore.inserir(nome, prio);
                        break;

                    case 2:
                        System.out.print("Digite a prioridade a buscar: ");
                        int prioBusca = Integer.parseInt(sc.nextLine());
                        Atividade encontrada = arvore.buscarPorPrioridade(prioBusca);
                        if (encontrada != null) {
                            System.out.println("Encontrada -> " + encontrada);
                        } else {
                            System.out.println("Nenhuma atividade encontrada com essa prioridade.");
                        }
                        break;

                    case 3:
                        arvore.percursoEmOrdem();
                        break;

                    case 4:
                        arvore.percursoPreOrdem();
                        break;

                    case 5:
                        arvore.percursoPosOrdem();
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido!");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        sc.close();
    }
}