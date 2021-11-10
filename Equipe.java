package br.com.pc2.semana8;

import java.util.Arrays;

public class Equipe {
	private String nome;
	private Jogador[] jogadores;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", jogadores=" + Arrays.toString(jogadores) + "]";
	}

}
