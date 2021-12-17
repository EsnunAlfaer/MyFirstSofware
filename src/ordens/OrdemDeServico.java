package ordens;

import pessoas.Cliente;
import ordens.Receita;
import produtos.Produto;

public class OrdemDeServico {
	
	private int numero;
	private String status;
	private float valorTotal;
	private String formaDePagamento;
	private Cliente cliente;
	private Receita receita;
	private Produto produto[];
	
	public OrdemDeServico() {
		numero = 0;
		status = null;
		valorTotal = 0.0f;
		formaDePagamento = null;
		cliente = null;
		receita = null;
		produto = null;
	}
	
	public void criarOrdem() {
		
	}
	
	public void editarOrdem() {
		
	}
	
	public void pesquisarOrdem() {
		
	}
	
	public void excluirOrdem() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
}
