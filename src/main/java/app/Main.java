package main.java.app;

import main.java.model.Tarefa;
import main.java.repository.TarefaRepository;

public class Main {
    public static void main(String[] args) {
        // instâncias figurativas para testar a funcionalidade do CRUD

        TarefaRepository tarefaRepository = new TarefaRepository();
        tarefaRepository.criarTarefa("Estudar Java");
        tarefaRepository.criarTarefa("Estudar PHP");
        tarefaRepository.criarTarefa("Estudar C++");
        tarefaRepository.criarTarefa("Estudar Cobol");
    }
}