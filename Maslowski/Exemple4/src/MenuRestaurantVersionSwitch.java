import java.util.Scanner;

public class MenuRestaurantVersionSwitch {

	public static void main(String[] args) {
		System.out.println("Choix du menu :");
		System.out.println("1 - Poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Végétarien");
		System.out.println("Que souhaitez vous comme menu ?");
		
		Scanner sc = new Scanner(System.in);
		
		int nbMenu = sc.nextInt();
		
		switch (nbMenu) {
		case 1:
			System.out.println("Vous venez de choisir le menu Poulet.");
		case 2:
			System.out.println("Vous venez de choisir le menu Boeuf.");
		case 3:
			System.out.println("Vous venez de choisir le menu Végétarien.");
		default:
			System.out.println("Vous n'avez choisi aucun des menus disponibles");
		}

	}

}
