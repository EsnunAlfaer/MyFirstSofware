package pessoas;

import java.sql.Date;

public class Funcionario extends Pessoa {
	
	private Date dataContrato;

	
	public Funcionario() {
		
		dataContrato = null;
	}
	
	public void cadastrarUsuario() {
		
	}

	public void editarUsuario() {
			
	}

	public void excluirUsuario() {
		
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

}


