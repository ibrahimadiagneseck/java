package exercice2;

import java.util.Scanner;

public class Vitesse {
	
	private int distance;
	private int temps;
	
	public Vitesse(int distance, int temps) {
		this.distance = distance;
		this.temps = temps;
	}
	
	public double metreParSeconde() {
		return (double) this.distance /  this.temps;
	}
	
	public double kilometreParHeure() {
		return this.metreParSeconde() * 3.6;
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		if(distance >= 0) {
			this.distance = distance;
		}
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		if(distance >= 0) {
			this.temps = temps;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tapez MPS : (mètre par seconde) ou KPH : (kilomètre par heure)");
		String choix;
		do {
			choix = sc.next();
			if(!choix.equals("KPH") && !choix.equals("MPS")) {
				System.out.println("Tapez MPS : (mètre par seconde) ou KPH : (kilomètre par heure)");
			}
		} while(!choix.equals("KPH") && !choix.equals("MPS"));
		
		System.out.println("Velliez saisir la distance (en mètre)");
		int distance = sc.nextInt();
		
		System.out.println("Velliez saisir le temps en (seconde)");
		int temps = sc.nextInt();

		Vitesse vitesse = new Vitesse(distance, temps);
		
		switch(choix) {
			case "MPS": {
				System.out.println("Vitesse = "+vitesse.metreParSeconde()+" m/s");
				break;
			}
			case "KPH":	{
				double calcul = vitesse.kilometreParHeure();
				System.out.println("Vitesse = "+calcul+" km/h");
				break;
			}
			// default:
			// 	System.out.println("Erreur !!");
		}
		
		sc.close();
	}

}
