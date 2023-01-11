package exercice1;

public class Rectangle {

	private int largeur, longueur;

	public Rectangle()	{
		this.largeur = 1;
		this.longueur = 1;
	}

	public Rectangle(int longueur, int largeur)	{
		this.setLargeur(largeur);
		this.setLongueur(longueur);
	}

	public int perimetre()	{
		return (this.longueur + this.largeur) * 2;
	}

	public int surface() {
		return this.longueur * this.largeur;
	}

	public static int perimetre(int longueur, int largeur)	{
		return (longueur + largeur) * 2;
	}

	public static int surface(int longueur, int largeur)	{
		return longueur * largeur;
	}

	public int getLongueur() {
		return this.longueur;
	}

	public int getLargeur()	{
		return this.largeur;
	}

	public void setLongueur(int longueur) {
		if (longueur >= 0) 
		{
			this.longueur = longueur;
		}
		else
		{
			System.out.println("Erreur : la longueur " + longueur + " est incorrecte");
		}
	}

	public void setLargeur(int largeur)	{
		if (largeur >= 0) 
		{
			this.largeur = largeur;
		}
		else
		{
			System.out.println("Erreur : la largeur " + largeur + " est incorrecte");
		}
	}

	public String toString() {
		return "Rectangle["+longueur+ "*" +largeur+"]";
	}
}
