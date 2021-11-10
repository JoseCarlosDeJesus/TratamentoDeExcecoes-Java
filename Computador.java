package br.com.pc2.semana8;

public class Computador {
	private String patrimonio;
	private String descricao;
	private Funcionario funcionario;

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Computador [patrimonio=" + patrimonio + ", descricao=" + descricao + ", funcionario=" + funcionario
				+ "]";
	}

}
