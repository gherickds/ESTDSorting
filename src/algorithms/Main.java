package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public  class Main<T extends Comparable<T>> {

	public static void main(String[] args) {

		ArrayList<Float> r = new ArrayList<>();
		ArrayList<String> rString = new ArrayList<>();
		
		System.out.println("---------------------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		//adicionar um caminho onde os arquivos a serem lidos estejam armazenados.
		String Path = "C:/Users/Erick/Desktop/files/";

		
		System.out.println("Escolha o arquivo que deseja processar:\n"
				+ "1 - Arquivo de texto com 100.000 números \n"
				+ "2 - Arquivo de texto com 100.000 palavras \n"
				+ "3 - Arquivo de texto com 1.000.000 de números \n"
				+ "4 - Arquivo de texto com 1.000.000 de palavras");
		String name = input.nextLine();
		String file = "";
		if (name.equals("1")) {
			file = "numeros_100000";
		}else
			if(name.equals("3")){
				file = "numeros_1000000";
		}
		if (name.equals("2")) {
			file = "palavras_100000";
		}else
			if(name.equals("4")){
				file = "palavras_1000000";
			}
		try {
			try (FileReader arch = new FileReader(Path + file + ".txt")) {
				BufferedReader readarch = new BufferedReader(arch);

				String row;
				while ((row = readarch.readLine()) != null) {
					if ((row != null) && (name.equals("1") || (name.equals("3")))) {
						r.add(Float.parseFloat(row));
					} else if ((row != null) && (name.equals("2") || name.equals("4"))) {
						rString.add(row);
					}
				}
			}
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		SelectionSort<Float> SSort = new SelectionSort<Float>();
		SelectionSort<String> SSortString = new SelectionSort<String>();
		
		BubbleSort<Float> BSort = new BubbleSort<Float>();
		BubbleSort<String> BSortString = new BubbleSort<String>();
		
		InsertionSort<Float> ISort = new InsertionSort<Float>();
		InsertionSort<String> ISortString = new InsertionSort<String>();

		/*QuickSort<Float> QSort = new QuickSort<Float>();
		QuickSort<String> QSortString = new QuickSort<String>();
		*/

		System.out.println("Escolha o algoritmo que deseja utilizar para execução. \n"
				+ "1 - Bubble Sort \n"
				+ "2 - Selection Sort \n"
				+ "3 - Insertion Sort \n"
				+ "4 - Quick Sort (indisponível) \n"
				+ "5 - Merge Sort (indisponível)\n");
		int option2 = input.nextInt();

		switch (option2){

			case 1:
				if (name.equals("1") || name.equals("3")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(BSort.bubbleSort(r));
				}
				if (name.equals("2") || name.equals("4")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(BSortString.bubbleSort(rString));
				}
				break;
			case 2:
				if (name.equals("1") || name.equals("3")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(SSort.selectionSort(r));
				}
				if (name.equals("2") || name.equals("4")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(SSortString.selectionSort(rString));
				}
				break;
			case 3:
				if (name.equals("1") || name.equals("3")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(ISort.insertionSort(r));
				}
				if (name.equals("2") || name.equals("4")) {
					System.out.println("------------------------Executando, aguarde.-------------------------");
					System.out.println(ISortString.insertionSort(rString));
				}

				break;
			/*case 4:
				System.out.println(BSort.bubbleSort(r));
				break;
			case 5:
				System.out.println(BSort.bubbleSort(r));
				break;*/
				
			default:
				System.out.println("Número inserido inválido ou opção indisponível.");
			break;
		}
	}
}