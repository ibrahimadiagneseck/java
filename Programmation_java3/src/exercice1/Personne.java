package exercice1;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	private Sexe sexe = Sexe.Masculin;
	
	public Personne() {}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
	}

	public Personne(String nom, String prenom, int age, Sexe sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
		this.sexe = sexe;
	}

	public Personne(Personne personne) {
		this.nom = personne.nom;
		this.prenom = personne.prenom;
		this.setAge(personne.age);
		this.sexe = personne.sexe;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 130 ) {
			this.age = 0;
		} else {
			this.age = age;	
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public String toString() {
		return "Personne : [nom = " + this.nom + ", prenom = " + this.prenom + ", this.age = " + age + ", sexe = " + this.sexe + "]";
	}
	
}
