package exercice3;

import java.util.Scanner;

public class Voyelles {

	public static void main(String[] args) {

		Scanner scanne = new Scanner(System.in);

		int nombre;
		String voyelles = "aeiouy";
		int[] tableau = new int[voyelles.length()]; 

		System.out.print("Donnez un mot : ");
		String mot = scanne.next();
		mot = mot.toLowerCase();

		System.out.println("Il comporte");
		for(int j = 0; j < voyelles.length(); j++) {

			nombre = 0;
			
			for(int k = 0; k < mot.length(); k++) {

				if(voyelles.charAt(j) == mot.charAt(k)) {
					nombre++;
				}
				
				tableau[j] = nombre;
			}
		}

		for(int j = 0; j < voyelles.length(); j++) {
			System.out.println(tableau[j]+" fois la lettre "+voyelles.charAt(j));
		}
		scanne.close();
	}

}
