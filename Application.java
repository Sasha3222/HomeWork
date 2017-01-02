package homeWork;

public class Application {

	public static void main(String[] args) {
		Application theApp = new Application();
		theApp.runTheApp();

	} 
	void runTheApp() {
		
		Animal cow = new Cow();
		Animal cat = new Cat();
		Animal dog = new Dog();
		String animals[] = new String[]{"cow", "cat", "dog"};
		animals[0] = cow.getInfo();
		animals[1] = cat.getInfo();
		animals[2] = dog.getInfo();
		for (int i= 0; i < animals.length; i++) {
			System.out.println(String.valueOf(animals[i]));
		}

	} 
}
