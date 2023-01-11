package exercice1;

import java.util.Scanner;

public class Fonction {
	
	// Cette fonction permet de remplir les éléments d’un tableau t
	public static void saisir(int[] t) {
		
		Scanner scanne = new Scanner(System.in);
		
		for(int i = 0; i < t.length; i++) {
			System.out.print("Velliez saisir l'élément ["+(i+1)+"] du tableau : ");
			t[i] = scanne.nextInt();
			System.out.println();
		}
		scanne.close();
	}
	
	// Cette fonction renvoie la sommer les éléments du tableau t
	public static int somme(int[] t) {
		
		int somme = 0;
		
		for(int i = 0; i < t.length; i++) {
			somme += t[i];
		}
		return somme;
	}
	
	//  Cette fonction renvoie le maximum des éléments du tableau t
	public static int maximum(int[] t) {
		
		int maximum = t[0];
		
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] > maximum) {
				maximum = t[i];
			}
		}
		return maximum;
	}
	
	// Cette fonction renvoie la différence entre le maximum et le minimum des éléments du tableau t
	public static int delta(int[] t) {
		
		int maximum = t[0];
		int minimum = t[0];
		
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] > maximum) {
				maximum = t[i];
			} else if(t[i] < minimum) {
				minimum = t[i];
			}
		}
		return (maximum-minimum);
	}
	
	// Cette fonction fait le tri des éléments du tableau t
	public static void bubble(int[] t) {
		
		int tempon;
		
		for(int i = 0; i < (t.length - 1); i++) {
			
			for(int j = (i + 1); j < t.length; j++) {
				if(t[i] > t[j]) {
					tempon = t[i];
					t[i] = t[j];
					t[j] = tempon;
				}
			}
		}
	}
	
	// Cette fonction renvoie vrai si les deux tableaux contiennent exactement les mêmes éléments aux mêmes indices
	public static boolean egalite(int[] t1, int[] t2) {
		
		boolean contient = true;
		
		if(t1.length != t2.length) {
			return false;
		}
		
		for(int i = 0; i < t1.length; i++) {
			if(t1[i] != t2[i]) {
				contient = false;
				break;
			}
		}
		return contient;
	}
	
	// Cette fonction renvoie vrai si les deux tableaux contiennent les mêmes éléments
	// les deux tableaux ne sont pas forcément de même taille
	public static boolean equivalence(int[] t1, int[] t2) {
		
		boolean contient = true;
		
		int taille = (t1.length < t2.length)? t1.length : t2.length;
		
		for(int i = 0; i < taille; i++) {
			if(t1[i] != t2[i]) {
				contient = false;
				break;
			}
		}
		return contient;
	}
	
	
	
	// Cette fonction affiche les éléments du tableau t
	public static void affiche(int[] t) {
		
		System.out.print("Tableau : ");
		
		for(int i = 0; i < t.length; i++) {

			System.out.print(t[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
			
		int[] tableau = new int[3];
		Fonction.saisir(tableau);
		
		int somme = Fonction.somme(tableau);
		System.out.println("La somme du tableau est : "+somme);
		
		int maximum = Fonction.maximum(tableau);
		System.out.println("Le maximum du tableau est : "+maximum);
		
		int difference = Fonction.delta(tableau);
		System.out.println("La difference entre le maximum et le minimum du tableau est : "+difference);
		
		Fonction.affiche(tableau);
		Fonction.bubble(tableau);
		Fonction.affiche(tableau);
		
		int[] tableau1 = {12, 23, 7};
		int[] tableau2 = {12, 23, 3};
		boolean egalite = Fonction.egalite(tableau1, tableau2);
		
		if(egalite)
			System.out.println("Les deux tableaux contiennent exactement les mêmes éléments aux mêmes indices");
		else
			System.out.println("Les deux tableaux ne contiennent pas exactement les mêmes éléments aux mêmes indices");
		
		int[] tableau3 = {12, 23, 7};
		int[] tableau4 = {12, 23, 7, 22};
		boolean equivalence = Fonction.equivalence(tableau3, tableau4);
		
		if(equivalence)
			System.out.println("Les deux tableaux sont equivalents");
		else
			System.out.println("Les deux tableaux ne sont pas equivalents");
		
	}

}
