package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int max,ponteiro;

		if(leftIndex < rightIndex){
			max = leftIndex;
			ponteiro = leftIndex;
			for (int i = leftIndex; i < rightIndex; i++) {
				if(array[max].compareTo(array[i + 1]) < 0){
					max = i + 1;
				}
			}
			Util.swap(array,max,rightIndex);
			sort(array, leftIndex, rightIndex - 1);
		}
	}
}