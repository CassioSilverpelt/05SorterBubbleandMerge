package view;

import controller.SorterControllers;

public class SorterMain {
	public static void main (String[] args) {
		SorterControllers sortCon = new SorterControllers();
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		sortCon.bubbleSort(vetor3);
		//System.out.println();
		//sortCon.mergeSort(vetor1, 0, vetor1.length-1);
		for (int a : vetor3) {
			System.out.print(a + " ");
		}
	}
}
