import java.util.Scanner;

public class Exemple4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quelle est votre note ?");
		
		int input1 = scan.nextInt();
		
		
		switch (input1) {
		
		case 0:
			System.out.println("C'est innadimissible !!!!");
		
		case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println("Il faut travailler d'avantage !");
		break;
		
		case (10 | 11):
			System.out.println("C'est passable.");
		break;
		
		case (12 | 13):
			System.out.println("Assez Bien.");
		break;
		
		case (14 | 15):
			System.out.println("Bien.");
		break;
		
		case (16 | 17 | 18 | 19):
			System.out.println("C'est très bien !");
		break;
		
		case (20):
			System.out.println("Fantastique, vous avez obtenu la note maximale !");
		break;
		
		default:
			System.out.println("Espèce de tricheur, ce n'est pas possible !");
			break;}
			
		}

}


