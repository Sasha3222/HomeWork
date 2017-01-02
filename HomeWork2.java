package homeWork;

public class HomeWork2 {
	
	public static void main(String[] args) {
	multiplication(5, 5);
	}
	
	public static void multiplication(int a, int b) {
		
		int counter = 0;
		int variable = 0;
		int tmp = 0;
		// Число b во 2 степени
		
			
		while ( counter < b) {
				variable+=b;
				counter++;
			}
			tmp = variable;
			counter = 0;
			variable = 0;
		//Число b в 3 степени
			while ( counter < b) {
				variable+=tmp;
				counter++;
			}
			tmp = variable;
			counter = 0;
			variable = 0;
		// Увеличение числа b в a-раза
			while ( counter < a) {
				variable+=tmp;
				counter++;
			}
			System.out.println("Умножение числа " + a + " на число " + b + " в 3 степени будет: " + variable);
		
	}

			
}
		

	



