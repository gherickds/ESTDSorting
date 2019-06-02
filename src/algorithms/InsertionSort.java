package algorithms;

import java.util.ArrayList;

public final class InsertionSort<T extends Comparable<T>>{
    public String insertionSort(ArrayList<T> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            T atual = list.get(i);
            int j = i - 1;
            while ((j >= 0) && (list.get(j)).compareTo(atual) >= 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, atual);
        }
        double millis = System.currentTimeMillis() - start;
        double end = System.currentTimeMillis();
        double totaltime = (end - start)/1000;
        double totaltimemin = (end - start) /(1000*60);
        return "Array Ordenado " + list + "\n" + "Tempo de execução em Segundos: " + totaltime + "\n" + "Tempo de execução em Milisegundos:  " + millis+"\n"+
                "Tempo de execução em Minutos: "+totaltimemin;
    }
}