# Gerenciador de Tarefas (Java CRUD)

Este é um projeto de estudo desenvolvido em **Java Puro**, focado em aplicar conceitos de Programação Orientada a Objetos (POO) e manipulação de coleções em memória.

## 📋 Sobre o Projeto

O projeto consiste em um sistema de CRUD (Create, Read, Update, Delete) para gerenciamento de tarefas. Por ser uma aplicação de nível educacional, **não há persistência de dados em banco de dados ou arquivos**; todas as informações são armazenadas na memória RAM durante a execução do programa.

---

## 🏗️ Estrutura do Código

A aplicação foi estruturada seguindo o princípio de separação de responsabilidades, dividida em duas classes principais:

### 1. `Tarefa` (Model)
Classe responsável pela definição do objeto. Contém os atributos fundamentais:
- `id`: Identificador único da tarefa.
- `descricao`: O texto descritivo do que deve ser feito.
- `concluida`: Um booleano para indicar o status da tarefa.

### 2. `TarefaRepository` (Repository)
Classe responsável pela lógica de negócio e gerenciamento dos dados.
- **Armazenamento:** Utiliza um `ArrayList<Tarefa>` (ou array equivalente) para guardar os objetos.
- **Métodos:** Contém as funções de lógica para adicionar, listar, atualizar, concluir e remover tarefas da lista.

---

## 🖥️ Interface de Usuário (Console)

Ao executar o programa, o usuário interage através de um menu via terminal:

```text
=== MENU DE TAREFAS ===
Digite 1 para adicionar novo tarefa
Digite 2 para listar todas as tarefas
Digite 3 para atualizar a descrição de uma tarefa
Digite 4 para concluir uma tarefa
Digite 5 para excluir uma tarefa
Digite -1 para encerrar o programa