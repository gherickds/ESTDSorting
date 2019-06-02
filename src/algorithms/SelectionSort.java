package algorithms;

import java.util.ArrayList;

public final class SelectionSort<T extends Comparable<T>> {
	public String selectionSort(ArrayList<T> list) {
        double start = System.currentTimeMillis();
		int i, j;
		T temp;

		for (i = 0; i < list.size() - 1; i++) {
			for (j = i; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		double millis = System.currentTimeMillis() - start;
		double end = System.currentTimeMillis();
		double totaltime = (end - start)/1000;
		double totaltimemin = (end - start) /(1000*60);
		return "Array Ordenado " + list + "\n" + "Tempo de execução em Segundos:  " + totaltime + "\n" + "Tempo de execução em Milisegundos:  " + millis+"\n"+
				"Tempo de execução em Minutos:"+totaltimemin;
	}
}