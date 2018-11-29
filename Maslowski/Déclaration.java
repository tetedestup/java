import java.util.Scanner;

public class Déclaration {

	public static void main(String[] args) {
		/*//Première façon pour String//
		String phrase;
		phrase = "Premier exemple";
		
		//Deuxième façon//
		String str = new String();
		str = "Le second exemple";
		
		//Troisème façon//
		String string = "Le troisième";
		
		//Quatrième façon//
		String chaine = new String("Et le dernier.");
		
		System.out.println(phrase + " " + str + " " + string + chaine);
		
		//---------------- Exemple calcul -------------------//
		
		double nbre1 = 10, nbre2 = 3;
		
		int resultat = (int)(nbre1 / nbre2);
		
		System.out.println("Le résultat est = " + resultat);
		
		
		double nbre1 = 10, nbre2 = 3;
		
		System.out.println("Le résultat est = " + (int)(nbre1/nbre2));
		
		// ----------- Autre exemple de calcul-----------//
		
		int a = 10, b = 3;
		double c = 10, d = 3;
		
		int iresultat = a / b;
		int imod = a % b;
		
		double dresultat = c / d;
		double dmod = c % d;
		
		System.out.println("iresultat = " + iresultat + " et " + "imod = "+ imod);
		System.out.println("dresultat = " + dresultat + " et "+ "dmod = " + dmod);
		
		
		
		//----------- Exemple de condition ----------//
		
		int a = 5, b = 3;
		
		if (b < a) {
			System.out.println("le chiffre est " + b);
		}
		
		else {
			System.out.println("B n'est pas plus petit que A");
		}
		
		
		
		//---------- Autre exemple de conditions -----------//
		
		
		int a = -5;
		
		if (a < 0) {
			System.out.println("A est négatif");
		}
		
		else if (a == 0) {
			System.out.println("A est égale à 0");
		}
		
		else {
			System.out.println("A est positif");
		}
		
		
		
		
		//------ chiffre compris entre x et y ------//
		
		
		int a = 55;
		
		if (a >= 50 && a <= 100) {
			System.out.println("a est compris entre 50 et 100");
		
		}
		
		else {
			System.out.println("a n'est pas compris entre 50 et 100");
		}
		
		*/
		
		
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Entrez un premier numéro svp.");
		int input1 = scan1.nextInt();
		System.out.println("Entrez un second numéro svp.");
		int input2 = scan2.nextInt();
		System.out.println("Vous avez entrez les numéros " + input1 + " et " + input2);
		
		if (input1 > input2) {
			System.out.println(input1 + " est plus grand que " + input2);
		}
		
		else if (input1 < input2) {
			System.out.println(input1 + " est plus petit que " + input2);
		}
		
		else {
			System.out.println(input1 + " est égale à " + input2);
		}
		
		
		
		
		
		
		
		
		
		}

	}
