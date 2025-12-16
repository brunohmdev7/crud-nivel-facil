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
            for (int i = 0 ;  i  < tarefas.size() ; i++) {
                if (posicao > (tarefas.size() - 1) || posicao < 0) {
                    System.out.println("❌ Erro ao encontrar tarefa!");
                }

                if (tarefas.get(posicao) == tarefas.get(i)) {
                    tarefas.get(posicao).setDescricao(novaDescricao);
                    System.out.println("✅ Descrição atualizada com sucesso!");
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Erro ao atualizar descricao!");
        }
    }
}
