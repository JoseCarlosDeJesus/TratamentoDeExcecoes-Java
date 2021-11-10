package br.com.pc2.semana8;

import java.util.Arrays;

public class Edificio {
	private String nome;
	private String localizacao;
	Andar[] andares;
	
	// Declarando uma constante
	private static final int NUM_MAX_ANDAR = 6;

	public Edificio() {
		andares = new Andar[NUM_MAX_ANDAR];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Andar[] getAndares() {
		return andares;
	}

	public void setAndares(Andar[] andares) {
		this.andares = andares;
	}

	@Override
	public String toString() {
		return "Edificio [nome=" + nome + ", localizacao=" + localizacao + ", andares=" + Arrays.toString(andares)
				+ "]";
	}

}
