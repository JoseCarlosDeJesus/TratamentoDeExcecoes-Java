package br.com.pc2.semana8;

public class Jogador {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}

}
