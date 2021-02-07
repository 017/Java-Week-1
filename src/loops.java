
public class loops extends App {
	
	static boolean isEven(int number) {
		if (number %2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static void EvenLoop() {
		int index = 0;
		while (index <= 100) {
			if (index %2 == 0) {
				System.out.println(index);
			}
			index++;
		}
	}
	
	static boolean is3rdNumber(int number) {
		if (number %3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static void everyThird() {
		int index = 100;
		while (index >= 0) {
			if (index %3 == 0) {
				System.out.println(index);
			}
			index--;
		}
	}
	
	static void everyOther() {
		for (int i = 1; i <= 100; i++) {
			if (i %2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	static void HelloBuilder() {
		boolean hello;
		boolean world;
		for (int i = 0; i <= 100; i++) {
			hello = false;
			world = false;
			if (i %3 == 0) {
				hello = true;
			}
			if (i %5 == 0) {
				world = true;
			}
			if (hello == true && world == true) {
				System.out.println("HelloWorld");
			} else if (world == true) {
				System.out.println("World");
			} else if (hello == true) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		EvenLoop();
		everyThird();
		everyOther();
		HelloBuilder();

	}

}
