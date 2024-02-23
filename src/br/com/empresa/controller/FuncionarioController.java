package br.com.empresa.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.empresa.model.Funcionario;


public class FuncionarioController {
	
	private List<Funcionario> funcionarios;
	
	
	//Construtor 
	public FuncionarioController() {
		this.funcionarios = new ArrayList<>();
	}
	
	//Metodos
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void exibirFuncionarios() {
		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}
	}
	
	public void atualizarFuncionarios(int id, Funcionario novoFuncionario) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getId() == id) {
				funcionarios.set (i, novoFuncionario);
				return;
			}
		}
		System.out.println("Funcionario não encontrado!");
	}
	
	public void excluirFuncionario(int id) {
		funcionarios.removeIf(Funcionario -> (funcionarios -> funcionario.getId() == id);
	}
}
