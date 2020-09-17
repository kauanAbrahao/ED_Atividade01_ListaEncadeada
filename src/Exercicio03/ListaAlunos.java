package Exercicio03;

public class ListaAlunos {
	private Aluno inicio;
	
	public ListaAlunos() {
		inicio = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null) {
			return true;
		}
		else {
			return false;
		}
	}

//---------------------------------------------
	public void adicionaInicio(String nome, int RA, String turma, String semestre) {
		Aluno novoaluno = new Aluno();
			novoaluno.setNome(nome);
			novoaluno.setRA(RA);
			novoaluno.setTurma(turma);
			novoaluno.setSemestre(semestre);
			novoaluno.setProximo(inicio);
			inicio = novoaluno;
			
	}
//	-----------------------------------------
	public void adicionaFinal(String nome, int RA, String turma, String semestre) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
		novoaluno.setRA(RA);
		novoaluno.setTurma(turma);
		novoaluno.setSemestre(semestre);
		
		if (isEmpty()) {
			inicio = novoaluno;
		}
		else {
			Aluno aux = inicio;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoaluno);
		}
	}
//	--------------------------------------------
	public void adicionaPosicao(int pos, String nome, int RA, String turma, String semestre) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
		novoaluno.setRA(RA);
		novoaluno.setTurma(turma);
		novoaluno.setSemestre(semestre);
		if (pos == 1) {
			adicionaInicio(nome, RA, turma, semestre);
		}
		else {
			Aluno aux = inicio;
			int i = 1;
			
			while(aux.getProximo() != null && i<pos-1) {
				aux = aux.getProximo();
				i++;
			}
			if (i == pos-1) {
				novoaluno.setProximo(aux.getProximo());
				aux.setProximo(novoaluno);
			}
			else {
				System.out.println("Posição inválida!");
			}
		}
	}
//	--------------------------------------------
	public void removeInicio() {
		if (isEmpty()) {
			System.out.println("A lista já está vazia!");
		}
		else {
			inicio = inicio.getProximo();
		}
	}
	
//	--------------------------------------------
	public void removeFinal() {
		Aluno aux = inicio;
		Aluno aux2 = aux;
		if (isEmpty()) {
			System.out.println("A lista já está vazia!");
		}
		else {
			if (inicio.getProximo() == null) { //Condição caso haja apenas 1 elemento na lista.
				inicio = null;
			}
			else {
				while(aux.getProximo() != null) {
					aux2 = aux;
					aux = aux.getProximo();
				}
				aux2.setProximo(null);
			}
		}
	}
	
//	--------------------------------------------
	public void removePosicao(int pos) {
		int i = 1;
		Aluno aux = inicio;
		if (isEmpty()) {
			System.out.println("A lista já está vazia!");
		}
		else {
			if(pos == 1){
					removeInicio();
				}
			else {
				while(aux.getProximo()!= null) {
					aux = aux.getProximo();
					i++;
				}
				if(pos>i || pos == 0) {//Se a posição for maior que a quantidade de elementos e/ou a posição escolhida for 0 (não existe)
					System.out.println("Posição inválida!");
				}
				else {
					if (pos == i) {//Caso tenha escolhido o último elemento (ou seja, o final).
						removeFinal();
					}
					else {
						aux = inicio;
						Aluno aux2 = aux;
						while(pos>1) {
							aux2 = aux;
							aux = aux.getProximo();
							pos--;
						}
						aux2.setProximo(aux.getProximo());
						aux = null;
				}
			}
			}
	}
	}
//	---------------------------------------------
		public void mostraLista() {
			Aluno aux = inicio;
			String r = " ";
			while (aux!=null) {
				r = r + "\n" +"Nome: " + aux.getNome() + " | RA: " + aux.getRA() +
					" | Turma: " + aux.getTurma() + " | Semestre: " + aux.getSemestre();
				aux = aux.getProximo();
			}
			System.out.println(r);
		}
	

}
