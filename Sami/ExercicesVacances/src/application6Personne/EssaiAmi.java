package application6Personne;

public class EssaiAmi {

	public static void main(String[] args) {

		Personne personneseule = new Personne("Sam");
		Personne ami1 = new Personne("Tim");
		Personne ami2 = new Personne("Tom");

		ami1.setAmi(ami2);
		ami2.setAmi(ami1);

		System.out.println(personneseule);
		System.out.println();
		System.out.println(ami1);
		System.out.println();
		System.out.println(ami2);

	}

}
