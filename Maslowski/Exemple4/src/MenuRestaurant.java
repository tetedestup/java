import java.util.Scanner;

public class MenuRestaurant {

	public static void main(String[] args) {
		
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("Bonjour, bienvenue à Simplon Burger !");
		System.out.println("Aujourd'hui vous pouvez personnaliser votre burger en choisissant la base, au choix :");
		System.out.println("Au Poulet, au Boeuf ou Végétarienne.");
		
		String choixBase;
		System.out.println("Je vous laisse écrire ce que vous voulez.");
		Scanner input1 = new Scanner(System.in);
		choixBase = input1.nextLine();
		
		if (choixBase) {
			String string = "Poulet";
			System.out.println("Vous avez choisi le Poulet, nous lançons votre commande. :)");
		}
		
		else if (choixBase) {
			String string = "Boeuf";
			System.out.println("Vous avez choisi le Boeuf, nous lançons votre commande. :)");
		}
		
		else if (choixBase) {
			String string ="Végétarien";
			System.out.println("Vous avez choisi le végétarien, nous lançons votre commande. :)");
		}
		*/
		
		
		
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
				System.out.println("Le Poulet 9 999.99€ ( que nous déconseillons aux policiers");
				System.out.println("Le Boeuf 9 999.99€ ( que nous déconseillons à Franck )");
				System.out.println("Le végétarien 9 999.99€ ( que nous déconseillons aux paraplégiques )");
				System.out.println("Que désirez vous ?");
				
				String str = scan1.nextLine();
				String menu1 = "Le Poulet";
				String menu2 = "Le Boeuf";
				String menu3 = "Le végétarien";
				
				if (str.equals(menu1)) {
					System.out.println("J'espère que vous vous régalerez avec ce poulet braisé au cocktail molotov !" );
				}
				else if (str.equals(menu2)) {
					System.out.println("J'espère que vous vous régalerez avec ce Boeuf de Kobe Bryant !" );
				}
				else if (str.equals(menu3)) {
					System.out.println("J'espère que vous vous régalerez avec cette salade jamaïquaine !" );
				}
				else {
					System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
				}
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


