package controller;

public class SorterControllers {
	public SorterControllers() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		boolean trocou = false;
		
		System.out.println("Vetor inicial: ");
		for (int a : vetor) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		for (int i = 0; i < tamanho; i++) {
			trocou = false;
			
			for (int j = 0; j < tamanho-1; j++) {
				if (vetor[j] > vetor[j+1]) {
					trocou = true;
					int aux =  vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
			if (trocou == true) {
				System.out.println("\nRodada " + (i+1) + ":");
				for (int a : vetor) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
		}
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor, int ini, int fim) {
		for (int i = ini; i <= fim; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		if (ini < fim) {
			
			int meio = (ini + fim) /2;
			mergeSort(vetor, ini, meio);
			mergeSort(vetor, meio+1, fim);
			intercala(vetor, ini, meio, fim);
		}
		return vetor;
	}

	private void intercala(int[] vetor, int ini, int meio, int fim) {
		int novoVetor[] = new int[vetor.length];
		
		for (int i = ini; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		
		int esq = ini;
		int dir = meio+1;
		
		for (int cont = ini; cont <= fim; cont++) {
			if (esq > meio) {
				vetor[cont] = novoVetor[dir];
				dir++;
			} else if (dir > fim) {
				vetor[cont] = novoVetor[esq];
				esq++;
			} else if (novoVetor [esq] < novoVetor[dir]) {
				vetor[cont] = novoVetor[esq];
				esq++;
			} else {
				vetor[cont] = novoVetor[dir];
				dir++;
			}
		}
		for (int a : novoVetor) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
