package exercice3;

public class Complexe {
	
	private float partieReelle;
	private float partieImaginaire;
	
	
	public Complexe() {}
	
	public Complexe(float partieReelle, float partieImaginaire) {
		this.partieReelle = partieReelle;
		this.partieImaginaire = partieImaginaire;
	}
	
	public Complexe(Complexe complexe) {
		this.partieReelle = complexe.partieReelle;
		this.partieImaginaire = complexe.partieImaginaire;
	}

	public float getPartieReelle() {
		return partieReelle;
	}

	public void setPartieReelle(float partieReelle) {
		this.partieReelle = partieReelle;
	}

	public float getPartieImaginaire() {
		return partieImaginaire;
	}

	public void setPartieImaginaire(float partieImaginaire) {
		this.partieImaginaire = partieImaginaire;
	}
	
	public void ajouter(Complexe complexe) {
		this.partieReelle = this.partieReelle + complexe.partieReelle;
		this.partieImaginaire = this.partieImaginaire + complexe.partieImaginaire;
	}
	
	public void soustraire(Complexe complexe) {
		this.partieReelle = this.partieReelle - complexe.partieReelle;
		this.partieImaginaire = this.partieImaginaire - complexe.partieImaginaire;
	}


	
	
	public String toString()
	{
		// return this.partieReelle + " + " + this.partieImaginaire + "i";

		if (this.partieReelle == 0 && this.partieImaginaire == 0) 
		{
			return "0";
		}
		else
		{
			String chaine = "";
			
			if (this.partieReelle != 0) 
			{
				chaine += this.partieReelle;

				if (this.partieImaginaire > 0) 
				{
					chaine += " + " + this.partieImaginaire + "i";
				}
				else if (this.partieImaginaire < 0) 
				{
					chaine += " - " + (-this.partieImaginaire) + "i";
				}
			}
			else
			{
				chaine = this.partieImaginaire + "i";
			}

			return chaine.replace(".0i", "i").replace(".0 ", " ").replace(".0", "");

		}
	}
	
	

}
