package produtos;

public class Lente extends Produto{
	
	private String laboratorio;
	private float grau;
	private String tipo;
	private String tratamento;
	
	public Lente() {
		laboratorio = null;
		grau = 0.0f;
		tipo = null;
		tratamento = null;
	}
	
	public void criarLente() {
		
	}
	
	public void editarLente() {
		
	}
	
	public void pesquisarLente() {
		
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
}
