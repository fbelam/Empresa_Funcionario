package br.com.empresa.model;

public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	
	public Funcionario (int id, String nome, String funcao) {
		this.id = id;
		this.nome = nome;
		this.cargo = funcao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
