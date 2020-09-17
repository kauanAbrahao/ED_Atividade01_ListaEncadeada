package Exercicio03;

public class Principal {
	public static void main(String[] args) {
//		Aqui est�o as simula��es e teste de mesa. Por favor, ler o passo a passo, observe as sa�das no console.
		
//		Os sysout est�o bem separados para facilitar a visualiza��o.
		
		ListaAlunos lista = new ListaAlunos();
		System.out.println(lista.isEmpty()); //Vamos conferir se a lista est� vazia, se inicio == null. Como n�o colocamos nenhum item ainda, retornar� true.
		lista.removeFinal(); //N�o h� como remover elementos de uma lista vazia!
		
		
		//Vamos come�ar a montar a lista
		
		
		// Adicionar elemento no in�cio
		lista.adicionaInicio("Jos� Almeida", 112584, "ADS Noite", "1 Sem.");
		lista.mostraLista(); //Nossa lista est�: (Jose|dados|-)-----> null
		
		//Adicionar elemento no final
		lista.adicionaFinal("Beatriz Ferreira", 112580, "Marketing Noite", "2 Sem.");
		lista.mostraLista(); //Nossa lista est�: (Jose|dados|-) --> (Beatriz|dados|-) ---> null
		
		//Adicionar elemento no final
		lista.adicionaFinal("Gilberto Abrah�o", 112590, "ADS Tarde", "4 Sem.");
		lista.mostraLista();//Nossa lista est�: (Jose|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Adicionar no meio da lista
		int pos = 2;
		lista.adicionaPosicao(pos, "Larissa Villa", 112503, "ADS Manh�", "3 Sem.");
		lista.mostraLista(); //Nossa lista est�: (Jose|dados|-) -->(Larissa|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Remover no inicio
		lista.removeInicio();
		lista.mostraLista();//Nossa lista est�: (Larissa|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Remove na posi��o
		pos = 2;
		lista.removePosicao(pos);
		lista.mostraLista();//Nossa lista est�: (Larissa|dados|-) --> (Gilberto|dados|-) --> null
		
		//Adiocionar no inicio
		lista.adicionaInicio("Gabriel Monteiro", 112500, "ADS Noite", "2. Sem");
		lista.mostraLista();//Nossa lista est�: (Gabriel|dados|-) ---> (Larissa|dados|-) --> (Gilberto|dados|-) --> null
		
		//Remover no final
		lista.removeFinal();
		lista.mostraLista(); //Nossa lista est�: (Gabriel|dados|-) ---> (Larissa|dados|-) --> null
		
		//Adiciona na posi��o
		pos = 3;
		lista.adicionaPosicao(pos, "Guilherme Campos", 112599, "ADS Manh�", "1 Sem.");
		lista.mostraLista(); //Nossa lista est�: (Gabriel|dados|-) ---> (Larissa|dados|-) --> (Guilherme|dados|-) ---> null
		
		//Remover no inicio
		lista.removeInicio();
		lista.mostraLista(); //Nossa lista est�: (Larissa|dados|-) --> (Guilherme|dados|-) ---> null
		
		//Adiciona na posicao
		pos = 2;
		lista.adicionaPosicao(pos, "Maria Eduarda", 112690, "Marketing Noite", "5 Sem.");
		lista.mostraLista();//Nossa lista est�: (Larissa|dados|-) --> (Maria|dados|-) ---> (Guilherme|dados|-) ---> null
		
		//Remove na posicao
		pos = 1;
		lista.removePosicao(pos);
		lista.mostraLista(); // Nossa lista est�: (Maria|dados|-) ---> (Guilherme|dados|-) ---> null
		
		//No m�nimo 2 simula��es para cada m�todo foram realizadas. Todos os m�todos est�o listados abaixo:
		/*
		adicionaInicio();
		adicionaFinal();
		adicionaPosicao();
		removeInicio();
		removeFinal();
		removePosicao();
		isEmpty();
		mostraLista()	*/
	}
}
