package exercice5;

import java.util.Scanner;

public class CaesarCode {

	public static String crypter(String message, int cle) {

		// String alphabet = "abcdefghijklmnopqrstuvwxyz"; // a = 97 et z = 122

		message = message.toLowerCase();

		StringBuilder sb = new StringBuilder();
		int nombre;
		char caractere;

		for (int i = 0; i < message.length(); i++) {
			nombre = (int) message.charAt(i);
			nombre += cle;
			if (nombre > 122) {
				nombre = 97 + (nombre - 122) - 1;
			}
			caractere = (char) nombre;
			sb.append(caractere);
		}

		return sb.toString();
	}

	public static String decrypter(String message, int cle) {

		message = message.toLowerCase();

		StringBuilder sb = new StringBuilder();
		int nombre;
		char caractere;

		for (int i = 0; i < message.length(); i++) {
			nombre = (int) message.charAt(i);
			nombre -= cle;
			if (nombre < 97) {
				nombre = 122 - (97 - nombre) + 1;
			}
			caractere = (char) nombre;
			sb.append(caractere);
		}

		return sb.toString();
	}

	public static void argument(String[] args) {

		int taille = args.length;

		switch(taille) {
			case 0: {
				System.out.println("java CaesarCode –c messageACrypter [ –k clé ]");
				System.out.println("java CaesarCode –d messageADecrypter [ –k clé ]");
				System.exit(1);
			}
			case 1:	{
				if(args[0] == "h" || args[0] == "help") {
					System.out.println("java CaesarCode –c messageACrypter [ –k clé ]");
					System.out.println("java CaesarCode –d messageADecrypter [ –k clé ]");
					System.exit(1);
				} else {
					System.exit(1);
				}
			}
			case 2:	{
				String mot = args[1];
				
				if(args[0] == "-c") {
					String motChiffrer = CaesarCode.crypter(mot, 13);
					System.out.println("Le mot chiffrer est : " + motChiffrer);
					System.exit(1);
				} else if(args[0] == "-d") {
					String motDeChiffrer = CaesarCode.decrypter(mot, 13);
					System.out.println("Le mot chiffrer est : " + motDeChiffrer);
					System.exit(1);
				} else {
					System.exit(1);
				}
			}
			case 4:	{
				if(args[0] == "-c" || args[0] == "--help") {
					System.out.println("java CaesarCode –c messageACrypter [ –k clé ]");
					System.out.println("java CaesarCode –d messageADecrypter [ –k clé ]");
					System.exit(1);
				} else {
					System.exit(1);
				}
			}
			default: {
				System.out.println("java CaesarCode –c messageACrypter [ –k clé ]");
				System.out.println("java CaesarCode –d messageADecrypter [ –k clé ]");
				System.exit(1);
			}
		}
	}

	public static void main(String[] args) {

		// java CaesarCode –c messageACrypter –k clé pour crypter un message avec la clé spécifiée
		// L’option « -k » devra être optionnelle et prendra la valeur « 13 ».
		// java CaesarCode, java CaesarCode -h ou encore java CaesarCode --help devront fournir en sortie l’aide du programme
		// java CaesarCode –d messageADecrypter –k clé pour décrypter un message avec la clé spécifiée

		CaesarCode.argument(args);
	}

}
