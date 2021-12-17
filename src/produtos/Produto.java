package produtos;

import java.sql.Date;

public class Produto {
	
	private String tipo;
	private float precoDeCusto;
	private Date dataCompra;
	private float precoVenda;
	private int quantidade;
	private Date dataVenda;
	
	public Produto() {
		tipo = null;
		precoDeCusto = 0.0f;
		dataCompra = null;
		precoVenda = 0.0f;
		quantidade = 0;
		dataVenda = null;
	}
	
	public void excluirProduto() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(float precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
}
