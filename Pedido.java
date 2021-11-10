package br.com.pc2.semana8;

public class Pedido {
	private Double valor;
	private Cliente cliente;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [valor=" + valor + ", cliente=" + cliente + "]";
	}

}
