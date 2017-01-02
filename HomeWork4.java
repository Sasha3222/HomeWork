package homeWork;

public class HomeWork4 {
	
	public static void main(String[] args) {
		
		HomeWork4 h = new HomeWork4();
		h.evenNumbermassiv();
		h.oddIndexMassiv();
	}
	
	private int[] myMassiv() {
		int []massive = new int[]{1, 3, 4 ,5, 2, 12, 33, 123, 18, 7, 13};
		return massive;
	}
	
	private void evenNumbermassiv() {
		int []massive = myMassiv();
		System.out.print("\tEven number massiv: ");
			for (int i = 0; i < massive.length; i++) {
				if (massive[i] % 2 == 0)
					System.out.print(massive[i] + " ");
			}
		System.out.println();
	}
	private void oddIndexMassiv() {
		int []massive = myMassiv();
		System.out.print("\tOdd index massiv: ");
			for (int i = 0; i < massive.length; i++) {
				if (i % 2 != 0)
					System.out.print(massive[i] + " ");
			}
		System.out.println();
	}
	

}
