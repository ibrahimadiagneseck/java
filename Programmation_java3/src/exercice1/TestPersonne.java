package exercice1;

public class TestPersonne {
	
	public static void main(String[] args) {
		
		
		Personne personne1 = new Personne("Diagne", "Ibrahima", 24, Sexe.Masculin);
		
		System.out.println(personne1);
		
		Personne personne2 = new Personne(personne1);
		
		System.out.println(personne2);
		
		
		
	}

}
