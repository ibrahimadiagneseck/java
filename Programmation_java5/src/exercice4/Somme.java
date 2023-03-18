package exercice4;

public class Somme {

	public static void main(String[] args) {

		if (args.length == 2) {
			
			int nombre1 = 0, nombre2 = 0;

			try {
				nombre1 = Integer.parseInt(args[0]);
				nombre2 = Integer.parseInt(args[1]);
				
			} catch (NumberFormatException nfe) {
				System.exit(1);
			}
			
			System.out.println(nombre1+" + "+nombre2+" = "+(nombre1 + nombre2));

		} else {
			System.exit(1);
		}

	}
}
