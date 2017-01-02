package homeWork;

import java.util.Scanner;

public class HomeWork3 {

	
	public static void main(String[] args) {
		
		HomeWork3 h = new HomeWork3();
		int []massive = h.getMassive();
		h.myMassive(massive);
		h.maxValue(massive);
		h.minValue(massive);
		h.averageValue(massive);
		h.productValue(massive);
		h.sumValue(massive);
		h.differenceValue(massive);
	}
	
	public int getChoice() {
	Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			return scanner.nextInt();
		} else {
			System.out.println("Not Int!\nTry again!");
		}	return getChoice();
	}
	//Задаем длину массива и переменные в нем
	private int[] getMassive(int ...massive) {
		System.out.println("\tEnter length massive: ");
		int size = getChoice();
		System.out.println("\tMy massive enter: ");
		massive = new int[size];
		for (int i = 0; i < size; i++) {
			massive[i] = getChoice();
		}

		return massive;
	}
	//Вывод массива
	private void myMassive(int ...massive) {
		System.out.print("\tMy massive: ");
		for (int i = 0; i < massive.length; i++) {
			System.out.print(massive[i] + " ");
		}
		System.out.println();
	}
	//Вывод максивального значения массива, перемещаем максимальное значение в конец массива
	private void maxValue(int ...massive) {
		System.out.print("\tMax value: ");
		for (int i = 0; i < massive.length-1; i++) {
			
			if (massive[i] > massive[i+1]) {
				int tmp = massive[i];
				massive[i] = massive[i+1];
				massive[i+1] = tmp;
			}

		}	System.out.print(massive[massive.length-1] + "\n");
	}
	//Вывод минимального значения массива, перемещаем минимальное значение в начало массива
	private void minValue(int ...massive) {
		System.out.print("\tMin value: ");
		for (int i = massive.length-1; i > 0; i--) {
			
			if (massive[i-1] > massive[i]) {
				int tmp = massive[i-1];
				massive[i-1] = massive[i];
				massive[i] = tmp;
			}

		}	System.out.print(massive[0] + "\n");
	}
	//Вывод среднего значения массива
	private void averageValue(int ...massive) {
		System.out.print("\tAverage value: ");
		int tmp = 0;
		for (int i = 0; i < massive.length; i++) {
			tmp+=massive[i];
		

		}	System.out.print((double)tmp/massive.length + "\n");
	}
	//Перемножение массива
	private void productValue(int ...massive) {
		System.out.print("\tProduct value: ");
		int tmp = 1;
		for (int i = 0; i < massive.length; i++) {
			tmp*=massive[i];
		

		}	System.out.print(tmp + "\n");
	}
	//Сумма значений массива
	private void sumValue(int ...massive) {
		System.out.print("\tSum value: ");
		int tmp = 0;
		for (int i = 0; i < massive.length; i++) {
			tmp+=massive[i];
		

		}	System.out.print(tmp + "\n");
	}
	//Разность значений массива
	private void differenceValue(int ...massive) {
		System.out.print("\tDifference value: ");
		int tmp = 0;
		for (int i = 0; i < massive.length; i++) {
			tmp-=massive[i];
		

		}	System.out.print(tmp + "\n");
	}

}
