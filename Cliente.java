package br.com.pc2.semana8;

import java.util.Arrays;

public class Cliente {
	private String cpf;
	private String nome;
	private Pedido[] pedidos;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", pedidos=" + Arrays.toString(pedidos) + "]";
	}

}
