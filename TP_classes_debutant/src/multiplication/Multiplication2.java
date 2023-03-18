package multiplication;

public class Multiplication2 {


	public static void afficherLigneSuperieure(int longueur) {
		System.out.print("╔");
		for(int i = 0; i <= longueur; i++) {
		   System.out.print("═");
	   	}
		System.out.println("╗");
	}

	public static void afficherLigneMilieu(int longueur) {
		System.out.print("║");
		System.out.print(" ╠");
		for(int i = 0; i <= longueur; i++) {
			System.out.print("═");
		}
		System.out.println("╣ ║");
	}

	public static void afficherLigneInferieure(int longueur) {
		System.out.print("╚");
		for(int i = 0; i <= longueur; i++) {
		   System.out.print("═");
	   	}
		
		System.out.println("╝");
	}

	public static void multiplication(int a, int b) {
		for(int i = 1; i <= 10; i++) {
            System.out.print("║ ║");
            for(int j = a; j <= b; j++) {
                
                System.out.printf("  %2d x %2d     ", j, i, i*j);
                
            }
            System.out.print("║ ║");
            System.out.println();
		}
	}

    public static void main(String[] args) {

		Multiplication2.afficherLigneSuperieure(59);

		Multiplication2.multiplication(1, 4);
 		
		Multiplication2.afficherLigneMilieu(55);

		Multiplication2.multiplication(5, 8);

		Multiplication2.afficherLigneMilieu(55);

		Multiplication2.multiplication(9, 12);

		Multiplication2.afficherLigneInferieure(59);

	}
}
