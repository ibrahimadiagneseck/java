package exercice3;

import java.util.Scanner;


public class Dessin {

	public static void rectanglePlein(int longueur, int largeur) {

		for(int i = 0; i < largeur; i++) {
			for(int j = 0; j < longueur; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void rectangleCreux(int longueur, int largeur) {

		for(int i = 0; i < longueur; i++) {
			System.out.print('*');
		}
		System.out.print('\n');
		for(int i = 0; i < largeur-2; i++) {
			for(int j = 0; j < longueur; j++) {
				if(j == 0 || j == longueur-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for(int i = 0; i < longueur; i++) {
			System.out.print('*');
		}
	}

	public static void rectangleCreux1(int longueur, int largeur)
	{
		for (int i = 0; i < longueur; i++)
		{
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < largeur - 2; i++)
		{
			for (int j = 0; j < longueur; j++)
			{
				if (j == 0 || j == longueur - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < longueur; i++)
		{
			System.out.print("*");
		}
	}

	public static void rectangleCreux2(int longueur, int largeur)
	{
		for (int i = 0; i < largeur; i++)
		{
			if (i == 0 || i == largeur - 1)
			{
				for (int j = 0; j < longueur; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for (int j = 0; j < longueur; j++)
				{
					if (j == 0 || j == longueur - 1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void triangleIsocele(int nombreLignes) {

		int nombreEspace = nombreLignes - 1;
		int nombreEtoile = 1;

		for (int i = 0; i < nombreLignes; i++) {

			for (int j = 0; j < nombreEspace; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < nombreEtoile; j++) {
				System.out.print("*");
			}

			System.out.println();

			nombreEspace--;
			nombreEtoile += 2;
		}
	}

	public static void triangleIsocele1(int nombreLignes)
	{
		for (int i = 0, nombreEtoile = 1, nombreEspace = nombreLignes - 1; i < nombreLignes; i++, nombreEspace--, nombreEtoile += 2)
		{
			for (int j = 0; j < nombreEspace; j++)
			{
				System.out.print(" ");
			}

			for (int j = 0; j < nombreEtoile; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void  triangleIsocele2(int nombreLignes) {

		int nombreEspacesLignes = nombreLignes - 1;
		int nbrEtoileLigne =  1;

		for(int ligne = 1; ligne <= nombreLignes; ligne++) {

			for(int nbrEspace = nombreEspacesLignes; nbrEspace >= 1; nbrEspace--) {
				System.out.print(' ');
			}

			nombreEspacesLignes--;

			for(int nbrEtoile = 1 ; nbrEtoile <= nbrEtoileLigne; nbrEtoile++) {
				System.out.print('*');
			}

			nbrEtoileLigne += 2;

			System.out.print('\n');

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int longueur, largeur, nombreLignes;

		System.out.println("Tapez 1 : pour dessiner un rectangle plein");
		System.out.println("Tapez 2 : pour dessiner un rectangle creux");
		System.out.println("Tapez 3 : pour dessiner un triangle isocèle");

		int choix;

		do {
			choix = sc.nextInt();
			if(choix != 1 && choix != 2 && choix != 3) {
				System.out.println("Tapez 1, 2 ou 3 !");
			}

		} while(choix != 1 && choix != 2 && choix != 3);

		switch(choix) {
		case 1: case 2: {
			System.out.println("Veillez saisir la longueur du rectangle");
			longueur = sc.nextInt();
			System.out.println("Veillez saisir la largeur du rectangle");
			largeur = sc.nextInt();
			if(choix == 1) {
				Dessin.rectanglePlein(longueur, largeur);
			} else {
				Dessin.rectangleCreux(longueur, largeur);
			}



			break;
		}
		// case 2:	{
		// 	System.out.println("Veillez saisir la longueur du rectangle creux");
		// 	longueur = sc.nextInt();
		// 	System.out.println("Veillez saisir la largeur du rectangle creux");
		// 	largeur = sc.nextInt();

		// 	Dessin.rectangleCreux(longueur, largeur);

		// 	break;
		// }
		case 3:	{
			System.out.println("Veillez saisir la hauteur du triangle isocèle");
			nombreLignes = sc.nextInt();

			Dessin.triangleIsocele2(nombreLignes);

			break;
		}
		// default:
		// 	System.out.println("Erreur !!");
		// }

		

		}
		
		sc.close();


	}
}