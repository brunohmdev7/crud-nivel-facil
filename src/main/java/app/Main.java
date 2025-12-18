package main.java.app;

import main.java.repository.TarefaRepository;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TarefaRepository tarefaRepo = new TarefaRepository();

        String opcao = "";

        while (!opcao.equals("-1")) {
            tarefaRepo.exibirMenu();
            opcao = teclado.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Descreva sua tarefa: ");
                    String descricao = teclado.nextLine();
                    tarefaRepo.criarTarefa(descricao);
                    System.out.flush();
                    break;
                case "-1":
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }
}