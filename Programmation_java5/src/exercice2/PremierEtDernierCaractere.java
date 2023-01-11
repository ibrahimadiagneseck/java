package exercice2;

import java.util.Scanner;

public class PremierEtDernierCaractere {

	public static void main(String[] args) {

		Scanner scanne = new Scanner(System.in);

		System.out.println("Veuillez saisir une chaine");
		String chaine = scanne.next();

		System.out.print(chaine.charAt(0)+" "+chaine.charAt(chaine.length()-1));
		

		scanne.close();
	}

}
