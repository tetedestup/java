import java.util.Scanner;
public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		int a = 15;
		if (a<0) {
		System.out.println ("le nombre est négatif");
		}
		else if (a>0) {
		System.out.println ("le nombre est positif");
		}
		else {
			System.out.println ("le résultat est nul"); 
		}
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println ( "Entrez valeur 1 = ");
		int a = sc.nextInt();
		
		if (a<0) {
			System.out.println ("le nombre est négatif");
			}
			else if (a>0) {
			System.out.println ("le nombre est positif");
			}
			else {
				System.out.println ("le résultat est nul"); 
			}
			
	}

}

