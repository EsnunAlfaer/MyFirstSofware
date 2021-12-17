package pessoas;

import java.sql.Date;

public class Pessoa {
	
	private String nomeCompleto;
	private Date dataNascimento;
	private int cpf;
	private String endereco;
	private int telefone;
	
	protected Pessoa() {
		
		nomeCompleto = null;
		dataNascimento = null;
		cpf = 0;
		endereco = null;
		telefone = 0;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) throws Exception {
		
		if(nomeCompleto.isEmpty()) {
			throw new Exception("Nome não digitado!");
		}
		else {
			this.nomeCompleto = nomeCompleto;
		}	
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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
