package multiplication;

public class Multiplication1 {

	public static void main(String[] args) {

		System.out.print("╔");
		for(int i = 0; i <= 97; i++) {
		   System.out.print("═");
	   	}
		System.out.print("╗\n");

		for(int i = 1; i <= 10; i++) {

 			for(int j = 1; j <= 10; j++) {

				System.out.printf("║%2d x %2d ║", j, i, i*j);
			}
			System.out.println();
		}

		System.out.print("╚");
		for(int i = 0; i <= 97; i++) {
		   System.out.print("═");
	   	}
		System.out.println("╝");

	}

}
