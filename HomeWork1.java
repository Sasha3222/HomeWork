package homeWork;

public class HomeWork1 {
	
	public static void main(String[] args) {
		
		final int constant1 = 22;
		final int constant2 = 15;
		binarySystem(constant1);
		binarySystem(constant2);
		int and = constant1 & constant2;
		System.out.println("Используем побитовый оператор &(AND)\nдля чисел " + constant1 + " и "
		+ constant2 + ", итого будет число " + and);
		binarySystem(and);
		int or = constant1 | constant2;
		System.out.println("Используем побитовый оператор |(OR)\nдля чисел " + constant1 + " и "
		+ constant2 + ", итого будет число " + or);
		binarySystem(or);
		int or1 = constant1 ^ constant2;
		System.out.println("Используем побитовый оператор ^(ORискл)\nдля чисел " + constant1 + " и "
		+ constant2 + ", итого будет число " + or1);
		binarySystem(or1);
	}
	
	private static void binarySystem(int a) {
		System.out.print("Переводим число " + a + " в двоичную систему:   ");
			int lengthBinary = 0;
			int tmp;
		//Вычисляем длину бинарного числа	
		tmp = a;
		while( a != 0) { 
			a/=2;
			lengthBinary++;
		}
		a = tmp;
		//Увеличиваем длину до 10 для красоты
		if (lengthBinary < 10) {
			lengthBinary = 10;
		}
		//Забиваем число в массив
		int massiv[] = new int[lengthBinary];
			for (int i = 0; i < lengthBinary; i++) {
				tmp = a;
				massiv[i] = a%2;
				a = tmp;
				a/=2;
			}
		//Переворачиваем массив
		for (int i = 0; i < massiv.length/2; i++) {
			tmp = massiv[i];
			massiv[i] = massiv[massiv.length-i-1];
			massiv[massiv.length-i-1] = tmp;
		}
		//Выводим массив
		for (int i = 0; i < massiv.length; i++) {
			System.out.print(massiv[i]);
		}
		System.out.println();
	}
	
	
	

}
