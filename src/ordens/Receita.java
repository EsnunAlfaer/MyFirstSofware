package ordens;

import java.sql.Date;
import pessoas.Cliente;

public class Receita {
	
	private String nomeMedico;
	private Date dataReceita;
	private Cliente paciente;
	private float grauLongDir;
	private float graulongEsq;
	
	public Receita() {
		
		nomeMedico = null;
		dataReceita = null;
		paciente = null;
		grauLongDir = 0.0f;
		graulongEsq = 0.0f;
	}
	
	public void criarReceita() {
		
	}
	
	public void editarReceita() {
		
	}
	
	public void excluirReceta() {
		
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) throws Exception {

        if(nomeMedico.isEmpty()) {
            throw new Exception("Nome não digitado!");
        }
        else {
            this.nomeMedico = nomeMedico;
        }
	}

	public Date getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(Date dataReceita) {
		this.dataReceita = dataReceita;
	}

	public Cliente getPaciente() {
		return paciente;
	}

	public void setPaciente(Cliente paciente) {
		this.paciente = paciente;
	}

	public float getGrauLongDir() {
		return grauLongDir;
	}

	public void setGrauLongDir(float grauLongDir) {
		this.grauLongDir = grauLongDir;
	}

	public float getGraulongEsq() {
		return graulongEsq;
	}

	public void setGraulongEsq(float graulongEsq) {
		this.graulongEsq = graulongEsq;
	}
}
