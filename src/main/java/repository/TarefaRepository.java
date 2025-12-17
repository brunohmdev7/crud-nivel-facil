package main.java.repository;

import main.java.model.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TarefaRepository {
    private List<Tarefa> tarefas =  new ArrayList<Tarefa>();

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void buscaPorPosicaoExistente (int posicao) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (posicao > (tarefas.size() - 1) || posicao < 0) {
                System.out.println("❌ Erro ao encontrar tarefa!");
            }
        }
    }

    public void criarTarefa(String descricao) {
        try {
            Tarefa tarefa = new Tarefa();
            tarefa.setDescricao(descricao);
            tarefas.add(tarefa);
            System.out.println("✅ Tarefa criada com sucesso!");
        } catch (Exception e) {
            System.out.println("❌ Erro ao criar tarefa!");
        }
    }

    public void listarTarefas() {
        System.out.println("========================");
        System.out.println("=== LISTA DE TAREFAS ===");
        System.out.println("========================\n");
        for (int i = 0 ; i  < tarefas.size() ; i++) {
            System.out.println("Tarefa " + (i + 1));
            System.out.println(tarefas.get(i).getDescricao());
            System.out.println(tarefas.get(i).isConcluida());
            System.out.println("========================\n");
        }
    }

    public void atualizarDescricao(int posicao, String novaDescricao) {
        try {
            this.buscaPorPosicaoExistente(posicao);
            for (int i = 0 ; i  < tarefas.size() ; i++) {
                if (tarefas.get(posicao) == tarefas.get(i)) {
                    tarefas.get(posicao).setDescricao(novaDescricao);
                    System.out.println("✅ Descrição atualizada com sucesso!");
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Erro ao atualizar descricao!");
        }
    }

    public void marcarConcluida(int posicao) {
        this.buscaPorPosicaoExistente(posicao);
        for (int i = 0 ; i  < tarefas.size() ; i++) {
            if (tarefas.get(posicao) == tarefas.get(i)) {
                tarefas.get(posicao).setConcluida(true);
                System.out.println("✅ Tarefa concluída com sucesso!");
            }
        }
    }

    public void excluirTarefa(UUID id) {
       boolean removeu = tarefas.removeIf(tarefa -> tarefa.getId().equals(id));
       if (removeu) {
           System.out.println("✅ Tarefa removida com sucesso!");
       } else {
           System.out.println("❌ Não foi possível excluir tarefa!");
       }
    }

    public void listarTarefasConcluida() {
        System.out.println("===================================");
        System.out.println("=== LISTA DE TAREFAS CONCLUÍDAS ===");
        System.out.println("===================================\n");

        boolean temTarefaConcluida = false;

        for (int i = 0 ; i  < tarefas.size() ; i++) {
            if (tarefas.get(i).getConcluida()) {
                temTarefaConcluida = true;
                System.out.println("Tarefa " + (i + 1));
                System.out.println(tarefas.get(i).getDescricao());
                System.out.println(tarefas.get(i).isConcluida());
                System.out.println("========================\n");
            }
        }

        if (!temTarefaConcluida) {
            System.out.println("Não há nenhuma tarefa concluída no momento!\n");
        }
    }

    public void listarTarefasNaoConcluidas() {
        System.out.println("===================================");
        System.out.println("=== LISTA DE TAREFAS NÃO CONCLUÍDAS ===");
        System.out.println("===================================\n");

        boolean temTarefaNaoConcluida = false;

        for (int i = 0 ; i  < tarefas.size() ; i++) {
            if (!tarefas.get(i).getConcluida()) {
                temTarefaNaoConcluida = true;
                System.out.println("Tarefa " + (i + 1));
                System.out.println(tarefas.get(i).getDescricao());
                System.out.println(tarefas.get(i).isConcluida());
                System.out.println("========================\n");
            }
        }

        if (!temTarefaNaoConcluida) {
            System.out.println("Não há nenhuma tarefa não concluída no momento!\n");
        }
    }
}
