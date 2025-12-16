package main.java.app;

import main.java.model.Tarefa;
import main.java.repository.TarefaRepository;

public class Main {
    public static void main(String[] args) {
        TarefaRepository tarefaRepository = new TarefaRepository();
        tarefaRepository.criarTarefa("Estudar Java");
        tarefaRepository.criarTarefa("Estudar PHP");
        tarefaRepository.criarTarefa("Estudar C++");
        tarefaRepository.criarTarefa("Estudar Cobol");

        tarefaRepository.atualizarDescricao(3, "Estudar TypeScript");
        tarefaRepository.listarTarefas();

    }
}