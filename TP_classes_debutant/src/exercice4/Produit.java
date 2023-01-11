package exercice4;

public class Produit {
	
	private String nom;
	private float prixUnitaire;
	int quantite;
	
	public Produit() {}
	
	public Produit(String nom, float prixUnitaire, int quantite) {
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	public float getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
