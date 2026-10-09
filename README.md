# 🌳 Gerenciador de Atividades por Prioridade (BST)

Projeto em **Java** desenvolvido para a Fase 2 da disciplina de Programação Orientada a Objetos e Estrutura de Dados. O sistema utiliza uma **Árvore Binária de Busca (Binary Search Tree - BST)** para gerenciar e organizar tarefas por ordem de prioridade.

---

## 🛠️ Tecnologias e Conceitos

* **Linguagem:** Java (JDK 26)
* **IDE:** IntelliJ IDEA
* **Estrutura de Dados:** Árvore Binária de Busca (BST)
* **Algoritmos de Percurso:**
  * **Em-Ordem (In-Order):** Visita a subárvore esquerda, a raiz e a subárvore direita (exibe em ordem crescente de prioridade).
  * **Pré-Ordem (Pre-Order):** Visita a raiz, a subárvore esquerda e a subárvore direita.
  * **Pós-Ordem (Post-Order):** Visita a subárvore esquerda, a subárvore direita e a raiz.

---

## 📂 Estrutura do Projeto

```text
src/
├── Atividade.java          # Modelo de dados (Nome e Prioridade)
├── No.java                 # Estrutura do nó da árvore (ponteiros esq/dir)
├── ArvoreAtividades.java   # Lógica da árvore BST e métodos de percurso
└── Main.java               # Interface via menu no console
