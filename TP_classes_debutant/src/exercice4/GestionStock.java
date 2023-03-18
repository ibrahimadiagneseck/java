package exercice4;

import java.util.Scanner;

public class GestionStock {

	private Produit[] listeProduits;
	private int nombreProduits;

	public GestionStock(int maxStock) {
		this.listeProduits = new Produit[maxStock];
	}

	public void ajouterProduit(Produit p) {

		if(this.nombreProduits < this.listeProduits.length) {

			for (int i = 0; i < this.listeProduits.length; i++) {

				if (this.listeProduits[i] == null) {
					this.listeProduits[i] = p;
					this.nombreProduits++;
					break;
				}
			}

		}
	}

	public void supprimerProduit(Produit p) {

		for (int i = 0; i < this.listeProduits.length; i++) {

			if (p.equals(this.listeProduits[i])) {
				this.listeProduits[i] = null;
				this.nombreProduits--;
				break;
			}
		}
	}

	public void listerProduit() {

		if (this.nombreProduits == 0) {
			System.out.println("La liste de produits est vide");
		} else {

			Produit produitTempon = null;

			for (int i = 0; i < this.listeProduits.length - 1; i++) {

				for (int j = i + 1; j < this.listeProduits.length; j++) {

					if (this.listeProduits[i].getPrixUnitaire() > this.listeProduits[j].getPrixUnitaire()) {
						produitTempon = this.listeProduits[i];
						this.listeProduits[i] = listeProduits[j];
						this.listeProduits[j] = produitTempon;
					}
				}
			}

			System.out.println("La liste de produits :"); 
			System.out.println("----------------------------");

			for (int i = 0; i < this.listeProduits.length; i++) {

				if (this.listeProduits[i] != null) {
					System.out.println("Produit N°" + (i + 1));
					System.out.println("Nom      : "+this.listeProduits[i].getNom());
					System.out.println("Prix     : "+this.listeProduits[i].getPrixUnitaire());
					System.out.println("Quantité : "+this.listeProduits[i].getQuantite());
					System.out.println("----------------------------");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez renseigner le nombre de produits"); 
		int nombreProduits = sc.nextInt();

		GestionStock stock = new GestionStock(nombreProduits);

		for (int i = 0; i < nombreProduits; i++) {

			Produit produit = new Produit();

			System.out.println("Veuillez saisir le produit N°" + (i + 1));
			System.out.println("Veuillez saisir le nom:"); 
			produit.setNom(sc.next());
			System.out.println("Veuillez saisir le prix:"); 
			produit.setPrixUnitaire(sc.nextFloat());
			System.out.println("Veuillez saisir la quantité:"); 
			produit.setQuantite(sc.nextInt());

			stock.ajouterProduit(produit); 
		}


		stock.listerProduit(); 

		sc.close();
	}

}
