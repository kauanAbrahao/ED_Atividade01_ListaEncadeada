package Exercicio03;

public class Principal {
	public static void main(String[] args) {
//		Aqui estão as simulações e teste de mesa. Por favor, ler o passo a passo, observe as saídas no console.
		
//		Os sysout estão bem separados para facilitar a visualização.
		
		ListaAlunos lista = new ListaAlunos();
		System.out.println(lista.isEmpty()); //Vamos conferir se a lista está vazia, se inicio == null. Como não colocamos nenhum item ainda, retornará true.
		lista.removeFinal(); //Não há como remover elementos de uma lista vazia!
		
		
		//Vamos começar a montar a lista
		
		
		// Adicionar elemento no início
		lista.adicionaInicio("José Almeida", 112584, "ADS Noite", "1 Sem.");
		lista.mostraLista(); //Nossa lista está: (Jose|dados|-)-----> null
		
		//Adicionar elemento no final
		lista.adicionaFinal("Beatriz Ferreira", 112580, "Marketing Noite", "2 Sem.");
		lista.mostraLista(); //Nossa lista está: (Jose|dados|-) --> (Beatriz|dados|-) ---> null
		
		//Adicionar elemento no final
		lista.adicionaFinal("Gilberto Abrahão", 112590, "ADS Tarde", "4 Sem.");
		lista.mostraLista();//Nossa lista está: (Jose|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Adicionar no meio da lista
		int pos = 2;
		lista.adicionaPosicao(pos, "Larissa Villa", 112503, "ADS Manhã", "3 Sem.");
		lista.mostraLista(); //Nossa lista está: (Jose|dados|-) -->(Larissa|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Remover no inicio
		lista.removeInicio();
		lista.mostraLista();//Nossa lista está: (Larissa|dados|-) --> (Beatriz|dados|-) ---> (Gilberto|dados|-) --> null
	
		//Remove na posição
		pos = 2;
		lista.removePosicao(pos);
		lista.mostraLista();//Nossa lista está: (Larissa|dados|-) --> (Gilberto|dados|-) --> null
		
		//Adiocionar no inicio
		lista.adicionaInicio("Gabriel Monteiro", 112500, "ADS Noite", "2. Sem");
		lista.mostraLista();//Nossa lista está: (Gabriel|dados|-) ---> (Larissa|dados|-) --> (Gilberto|dados|-) --> null
		
		//Remover no final
		lista.removeFinal();
		lista.mostraLista(); //Nossa lista está: (Gabriel|dados|-) ---> (Larissa|dados|-) --> null
		
		//Adiciona na posição
		pos = 3;
		lista.adicionaPosicao(pos, "Guilherme Campos", 112599, "ADS Manhã", "1 Sem.");
		lista.mostraLista(); //Nossa lista está: (Gabriel|dados|-) ---> (Larissa|dados|-) --> (Guilherme|dados|-) ---> null
		
		//Remover no inicio
		lista.removeInicio();
		lista.mostraLista(); //Nossa lista está: (Larissa|dados|-) --> (Guilherme|dados|-) ---> null
		
		//Adiciona na posicao
		pos = 2;
		lista.adicionaPosicao(pos, "Maria Eduarda", 112690, "Marketing Noite", "5 Sem.");
		lista.mostraLista();//Nossa lista está: (Larissa|dados|-) --> (Maria|dados|-) ---> (Guilherme|dados|-) ---> null
		
		//Remove na posicao
		pos = 1;
		lista.removePosicao(pos);
		lista.mostraLista(); // Nossa lista está: (Maria|dados|-) ---> (Guilherme|dados|-) ---> null
		
		//No mínimo 2 simulações para cada método foram realizadas. Todos os métodos estão listados abaixo:
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
