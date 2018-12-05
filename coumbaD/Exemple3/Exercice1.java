import java.io.InputStream;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		int a = 30 , b= 30;
		
		if (a<b) {
		System.out.println ( "le plus petit est = " +a ); 
		}	
		
		else if (b<a) { 
		
		System.out.println ( "le plus petit est = " +b ); 
		} 
		
		else {
			System.out.println("Les deux résultats sont égaux");
		}
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println ( "Entrez valeur 2 = ");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner (System.in);
		System.out.println ( "Entrez valeur 1 = ");
		int b = sc1.nextInt();

		
		
		if (a<b) {
			System.out.println ( "le plus petit est = " +a );
		}
		else if (b<a) { 
			
			System.out.println ( "le plus petit est = " +b ); 
			}
		else {
			System.out.println ( "A égale B" );
		}
	}

}
