package Exercicio03;

public class Aluno {
	
	private String nome;
	private int RA;
	private String turma;
	private String semestre;
	private Aluno proximo;


	public Aluno() {}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getRA() {
		return RA;
	}


	public void setRA(int rA) {
		RA = rA;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}


	public String getSemestre() {
		return semestre;
	}


	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	public Aluno getProximo() {
		return proximo;
	}


	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}
	
	

}	

	
