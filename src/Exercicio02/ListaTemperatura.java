package Exercicio02;

public class ListaTemperatura {
	private No inicio;
	
	public ListaTemperatura(){
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
	
//	---------------------------------------
	
	public void adicionaFinal(double temp) {
		if (inicio == null) {
			No novo = new No(temp);
			inicio = novo;
		}
		else {
			No aux = inicio;
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			No novo = new No(temp);
			aux.proximo = novo;
		}
		
	}
	
//	---------------------------------------
	public void adicionaInicio(double temp) {
		No novo = new No(temp);
		novo.proximo = inicio;
		inicio = novo;
	}
	
//	----------------------------------------
	
	public void adicionaPosicao(int pos, double temp) {
		No novo = new No(temp);
		if (pos == 1) { //Chamamos o método adicionaInicio pois (pos = 1) == inicio da lista.
			adicionaInicio(temp);
		}
		else {
			No aux = inicio;
			int i = 1;
			
			while(aux.proximo != null && i<pos-1) {
				aux = aux.proximo;
				i++;
			}
			if (i == pos-1) {
				novo.proximo = aux.proximo;
				aux.proximo = novo;
			}
			else {
				System.out.println("Posição inválida");
			}
			
		}
	}
//----------------------------------------------------------------
	public void removeInicio() {
		if (inicio == null) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			inicio = inicio.proximo;
		}
	}
	
//	--------------------------------------------------------------
	public void removeFinal() {
		No aux = inicio;
		No aux2 = aux;
		if (inicio == null) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			if (inicio.proximo == null) { //Condição caso haja apenas 1 elemento na lista.
				inicio = null;
			}
			else {
				while(aux.proximo != null) {
					aux2 = aux;
					aux = aux.proximo;
				}
				aux2.proximo = null;
			}
		}
	}

//	--------------------------------------------------------------
	
	public void removePosicao(int pos) {
		int i = 1;
		No aux = inicio;
		if (inicio == null) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			if (pos == 1) {
				removeInicio();
			}
			else {
				while(aux.proximo != null) {
					aux = aux.proximo;
					i++;
				}
				if(pos>i || pos == 0) { //Se a posição for maior que a quantidade de elementos e/ou a posição escolhida for 0 (não existe).
					System.out.println("Posição inválida!");
				}
				else {
					if (pos == i) { 
						removeFinal();
					}
					else {
						aux = inicio;
						No aux2 = aux;
						while(pos>1) {
							aux2 = aux;
							aux = aux.proximo;
							pos--;
						}
						aux2.proximo = aux.proximo;
						aux.proximo = null;
					}
				}
			}
		
		}	
	}
	
	public void mostraLista() {
		No aux = inicio;
		String r = " ";
		while (aux != null) {
			r = r + "\n" + aux.temp + " °C";
			aux = aux.proximo;
		}
		System.out.println(r);
	}
	
}
