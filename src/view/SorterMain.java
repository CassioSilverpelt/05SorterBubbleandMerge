package view;

import controller.SorterControllers;

public class SorterMain {
	public static void main (String[] args) {
		SorterControllers sortCon = new SorterControllers();
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		sortCon.bubbleSort(vetor);
		System.out.println();
		sortCon.mergeSort(vetor, 0, vetor.length-1);
		for (int a : vetor) {
			System.out.print(a + " ");
		}
	}
}
