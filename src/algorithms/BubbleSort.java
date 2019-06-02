package algorithms;

import java.util.ArrayList;

public final class BubbleSort<T extends Comparable<T>>{
	public String bubbleSort(ArrayList<T> list){
        double start = System.currentTimeMillis();
        for (int i = list.size(); i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if ((list.get(j - 1)).compareTo(list.get((j))) > 0) {
                    T aux = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, aux);
                }
            }
        }
        double millis = System.currentTimeMillis() - start;
		double end = System.currentTimeMillis();
		double totaltime = (end - start)/1000;
        double totaltimemin = (end - start) /(1000*60);
		return "Array Ordenado " + list + "\n" + "Tempo de execução em Segundos: " + totaltime + "\n" + "Tempo de execução em Milisegundos: " + millis+"\n"+
                "Tempo de execução em Minutos: "+totaltimemin;
	}

}
