package loja;

import pessoas.Funcionario; 

public class Loja {
	
	private String nome;
	private String endereco;
	private int telefone;
	
	public Loja() {
		
		nome = null;
		endereco = null;
		telefone = 0;
	}
	
	public void criarLoja() {
		
	}
	
	public void editarLoja() {
		
	}
	
	public void excluirLoja() {
		
	}
	
	public void pesquisarLoja() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {

        if(nome.isEmpty()) {
            throw new Exception("Nome não digitado!");
        }
        else {
            this.nome = nome;
        }
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}