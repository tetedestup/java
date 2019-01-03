
package application2SegmentDeDroite;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Abscisse {

	static int debut = 0;
	static int fin = 0;
	static int longueur = 0;

	public static void main(String[] args) {

		testSegment();

	}

	public static void testSegment() {

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Entrez un premier point d'abscisse: ");

			int a = sc.nextInt();

			System.out.println("Entrez un second point d'abscisse: ");

			int b = sc.nextInt();

			if (b < a) {
				debut = b;
				fin = a;
			}
			if (a < b) {
				debut = a;
				fin = b;
			}
			longueur = fin - debut;

			// tab[0]=debut;
			// for(int i=0;i<tab.length;i++) {}

			if (debut == fin)
				System.out.println("Les deux points sont identiques, veuillez réessayer ");
			System.out.println();

		} while (debut == fin);

//while(trycatch=false);

		System.out.println("Entrez le point à verifier: ");

		int point = sc.nextInt();

		System.out.println("longueur du segment [" + debut + ";" + fin + "] : " + longueur);
		System.out.println();

		if (point < debut || point > fin)
			System.out.println(point + " n'appartient pas au segment [" + debut + ";" + fin + "]");

		else {
			System.out.println(point + " appartient au segment [" + debut + ";" + fin + "]");
		}

	}

}
