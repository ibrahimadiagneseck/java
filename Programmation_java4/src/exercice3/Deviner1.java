package exercice3;

import java.util.Random;
import java.util.Scanner;

public class Deviner1 {

	public static void main(String[] args) {

		Scanner scanne = new Scanner(System.in);

		int inf = 1, sup = 100;
		int centre;
		String choix;

		System.out.println("Choisissez votre nombre entre 1 et 100, je vais essayer de le deviner");
		System.out.println("Tapez : OUI || PLUS || MOINS");


		do {

			centre = (sup + inf) / 2;
			
			System.out.print("Est-ce "+centre+" ? ");
			choix = scanne.next();

			if(choix.equalsIgnoreCase("PLUS")) {
				centre++;
				inf = centre;
			} else if(choix.equalsIgnoreCase("MOINS")) {
				centre--;
				sup = centre;
			}

		} while(!choix.equalsIgnoreCase("OUI"));

		System.out.println(centre+" etait le nombre à deviner, bye!");
		scanne.close();

	}

}
