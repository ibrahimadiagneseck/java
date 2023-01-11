package exercice2;

import java.util.Scanner;

public class UnCaractereSurDeux {

	public static void main(String[] args) {
		
		Scanner scanne = new Scanner(System.in);
		
		System.out.println ("Veuillez saisir une chaine");
		String chaine = scanne.next();
		
		for(int i = 0; i < chaine.length(); i+=2) {
			System.out.print(chaine.charAt(i)+" ");
		}
		
		scanne.close();
	}

}
