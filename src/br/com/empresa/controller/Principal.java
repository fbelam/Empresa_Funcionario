package br.com.empresa.controller;
import br.com.empresa.model.Funcionario;

public class Principal {
    public static void main(String[] args) {
    	FuncionarioController cadastro = new FuncionarioController();

        // Adicionando funcionários
        cadastro.adicionarFuncionario(new Funcionario(1, "João", "Silva"));
        cadastro.adicionarFuncionario(new Funcionario(2, "Maria", "Santos"));

        // Exibindo funcionários
        System.out.println("Lista de Funcionários:");
        cadastro.exibirFuncionarios();

        // Atualizando um funcionário
        //cadastro.atualizarFuncionario(1, new Funcionario(1, "João", "Silva"));

        // Excluindo um funcionário
        cadastro.excluirFuncionario(2);

        // Exibindo novamente após as alterações
        System.out.println("\nLista de Funcionários Atualizada:");
        cadastro.exibirFuncionarios();
    }
}
