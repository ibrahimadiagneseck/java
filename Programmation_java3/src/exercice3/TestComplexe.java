package exercice3;

public class TestComplexe {

	public static void main(String[] args) {
		
		
		Complexe complexe1 = new Complexe();
		complexe1.setPartieImaginaire(-5);
		complexe1.setPartieReelle(2);
		
		System.out.println(complexe1);
		
		complexe1.ajouter(complexe1);
		System.out.println(complexe1);
		
		complexe1.soustraire(complexe1);
		System.out.println(complexe1);

	}

}
