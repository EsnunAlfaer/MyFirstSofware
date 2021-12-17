package produtos;

public class Armacao extends Produto{
	
	private String marca;
	private String cor;
	private String nomeModelo;
	private String codPreco;
	
	public Armacao() {
		
		marca = null;
		cor = null;
		nomeModelo = null;
		codPreco = null;
	}
	
	public void criarArmacao() {
		
	}
	
	public void editarArmacao() {
		
	}
	
	public void pesquisarArmacao() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) throws Exception {
		
		if(nomeModelo.isEmpty()) {
			throw new Exception("Nome não digitado!");
		}
		else {
			this.nomeModelo = nomeModelo;
		}	
	}

	public String getCodPreco() {
		return codPreco;
	}

	public void setCodPreco(String codPreco) {
		this.codPreco = codPreco;
	}
}
