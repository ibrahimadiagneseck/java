package exercice2;

import exercice1.Fonction;

public class Palindrome {
	
	// 1. Écrivez sur papier un algorithme vérifiant si un mot est un palindrome.
	/*
		mot = laval
		lettre(0) = lettre(4)
		lettre(1) = lettre(3)
		lettre(2) = lettre(2)
		
		mot = sassas
		lettre(0) = lettre(5)
		lettre(1) = lettre(4)
		lettre(2) = lettre(3)
		lettre(3) = lettre(2)
		
		longueur(mot) = 5
		palindrome = vrai
		position = longueur(mot)
		pour i = 1 à (longueur(mot)/2)
			si lettre(i) != lettre(position) 
				palindrome = faux
				arreter;
			position = position - 1

	*/
	
	// 2. Écrivez une fonction en Java prenant en argument un tableau d'entier 
	// et renvoyant un booléen indiquant si le tableau est un palindrome.
	public static boolean estPalindrome(int[] tableau) {
		
		boolean palindrome = true;
		int position = tableau.length - 1;
		
		for(int i = 0; i <= (tableau.length/2); i++) {
			
			if(tableau[i] != tableau[position]) {
				palindrome = false;
				break;
			}
			position--;
		}
		return palindrome;
	}
	
	// 3. En utilisant la méthode charAt, écrivez une autre fonction prenant cette fois ci une String 
	// en argument et vérifiant si c'est un palindrome.
	// i<l, le caractère à la position i est égal au caractère à la position l-i-1	(i : 0 à l-1)
	public static boolean estPalindrome(String mot) {
		
		boolean palindrome = true;
		
		for(int i = 0; i < mot.length(); i++) {
			
			if( mot.charAt(i) != mot.charAt(mot.length()-i-1) ) {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}
	
	public static void main(String[] args) {
		
		int[] tableau1 = {7, 4, 2, 1, 2, 4, 7};
		int[] tableau2 = {12, 23, 3, 3, 23, 12};
		int[] tableau3 = {12, 23, 3, 2, 23, 12};
		boolean estPalindrome = Palindrome.estPalindrome(tableau2);
		
		Fonction.affiche(tableau2);
		if(estPalindrome)
			System.out.println("Le tableau est un palindrome");
		else
			System.out.println("Le tableau n'est pas un palindrome");
		
		System.out.println();
		
		String mot1 = "laval";
		String mot2 = "sassas";
		String mot3 = "lassas";
		estPalindrome = Palindrome.estPalindrome(mot1);
		
		if(estPalindrome)
			System.out.println("Le mot "+mot1+" est un palindrome");
		else
			System.out.println("Le mot "+mot1+" n'est pas un palindrome");
		

	}

}
