package Exercicio02;

public class Principal {
	public static void main(String[] args) {
//		Aqui estão as simulações e teste de mesa. Por favor, ler o passo a passo, observe as saídas no console.
		
// 		Os sysout estão bem separados para facilitar a visualização.		
		
		
		ListaTemperatura lista = new ListaTemperatura();
		
//		Verifica se está vazia. Neste etapa, o resultado será true, uma vez que nada foi adicionado ainda
		System.out.println(lista.isEmpty());  //resultado == true
		
//		Adicionar elemento no final(18,5):
		double temp = 18.5;
		lista.adicionaFinal(temp);
		
		//Adicionar elemento no final(20.0):
		temp = 20.0;
		lista.adicionaFinal(temp); // Nossa lista até agora está: |18.5|-|---> |20.0|-|---> null 
		
		//Adicionar elemento no começo(15.3):
		temp = 15.3;
		lista.adicionaInicio(temp);// Nossa lista está: |15.3|-| ---> |18.5|-| ----> |20.0|-| ----> null. Vamos testar?
		
		//Mostra lista:
		lista.mostraLista();
		
		//Adicionar elemento no meio da lista (40.0).
		int pos = 2;
		temp = 40.0;
		lista.adicionaPosicao(pos, temp); //Nossa lista está: |15.3|-| ---> |40.0|-| ---->  |18.5|-| ----> |20.0|-| ----> null. Vamos testar?
		System.out.println("\n");
		lista.mostraLista();
		
		//Remove elemento no início
		lista.removeInicio(); //Nossa lista está: |40.0|-| ----> |18.5|-| ----> |20.0|-| ----> null. Vamos testar?
		System.out.println("\n");
		lista.mostraLista();
		
		//Remove elemento no meio da lista
		pos = 2;
		lista.removePosicao(pos); //Nossa lista está: |40.0|-| ---->|20.0|-| ----> null. Vamos testar?
		lista.mostraLista();
		
		//Remove elento no final // Nossta lista está: |40.0|-| --> null.
		lista.removeFinal();
		lista.mostraLista();
		
	}

}
