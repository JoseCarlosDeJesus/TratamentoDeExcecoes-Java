package br.com.pc2.semana8;

import java.util.Arrays;

public class Aluno {
	private String ra;
	private String nome;
	private Matricula[] matriculas;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Matricula[] getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Matricula[] matriculas) {
		this.matriculas = matriculas;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", matriculas=" + Arrays.toString(matriculas) + "]";
	}

}
