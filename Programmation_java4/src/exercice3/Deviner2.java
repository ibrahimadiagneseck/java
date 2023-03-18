package exercice3;

import java.util.Scanner;

//import java.util.Random;

public class Deviner2 {
	
	public static int genererNombre(int minimun, int maximum) {
		
		int nombreAleatoire;
		
		// Random rand = new Random(); 
		// return minimun + rand.nextInt(maximum - minimun);
		
		nombreAleatoire = minimun + (int)(Math.random() * ((maximum - minimun) + 1));
		return nombreAleatoire;
	}
	

	public static void main(String[] args) {
		
		Scanner scanne = new Scanner(System.in);
		
		int inf = 1, sup = 100;
		int nombreAleatoire;
		String choix;
		
		System.out.println("Choisissez votre nombre entre 1 et 100, je vais essayer de le deviner");
		System.out.println("Tapez : OUI || PLUS || MOINS");
		
		
		do {
			
			nombreAleatoire = Deviner2.genererNombre(inf, sup);
			System.out.print("Est-ce "+nombreAleatoire+" ? ");
			choix = scanne.next();
			
			if(choix.equalsIgnoreCase("PLUS")) {
				nombreAleatoire++;
				inf = nombreAleatoire;
			} else if(choix.equalsIgnoreCase("MOINS")) {
				nombreAleatoire--;
				sup = nombreAleatoire;
			}

		} while(!choix.equalsIgnoreCase("OUI"));
		
		System.out.println(nombreAleatoire+" etait le nombre à deviner, bye!");
		scanne.close();
	}

}
