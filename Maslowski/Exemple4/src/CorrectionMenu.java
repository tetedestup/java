import java.util.Scanner;
public class CorrectionMenu {
	
	public void displaySelectedMenu(int nbMenu) {
}

	public static void main(String[] args) {
		
		
		System.out.println("Choix du menu :");
		System.out.println("1 - Poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Végétarien");
		System.out.println("Que souhaitez vous comme menu ?");
		
		Scanner scan = new Scanner(System.in);
		int nbMenu
		= scan.nextInt();
		
		if (nbMenu == 1) {
			System.out.println("Vous avez choisi le Poulet.");
		}
		
		else if (nbMenu == 2) {
			System.out.println("Vous avez choisi le Boeuf.");
		}

		else if (nbMenu == 3) {
			System.out.println("Vous avez choisi le Végétarien.");
		}

		else {
			System.out.println("Vous n'avez choisi aucun des menus proposés.");
		}
		
		
		}

	
	
}
