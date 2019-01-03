package application3Palindromes;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer mot : ");

		// String mot=sc.nextLine();

		affichertout(sc.nextLine());

	}

	static void affichertout(String mot) {

		afficherinverse(mot);
//		if (verifierpalindrome(mot)) {
//			System.out.println(mot + " est un palindrome");
//		} else {
//			System.out.println(mot + " n'est pas un palindrome");
//		}

	}

//	public static boolean verifierpalindrome(String mot) {
//		for (int i = 0; i < mot.length() / 2 + 1; ++i) {
//			if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
//				return false;
//			}
//		}
//		return true;

		
//			String inverse;
//			for (int i = mot.length() - 1; i >= 0 ; --i) {
//				inverse += String.valueOf(mot.charAt(i));
//			}
//			if (mot.equals(inverse)) {
//				System.out.println(mot + " est un palindrome");
//			}
//	}

//		for(int i=0;i<mot.length();i++) {
//			 
//			for(int j= (mot.length()-1);j>=0;j--) {  
//				
//				String inverse =String.valueOf(mot.charAt(j));
//				String mot1= String.valueOf(mot.charAt(i));
//				
//			
//				
//			if (inverse==mot1) {System.out.println(mot+" est un palindrome");}
//			
//			else {System.out.println(mot+" n'est pas un palindrome");}
//			}

//		}

//  };

	public static String afficherinverse(String mot) {

		String inverse = new StringBuilder(mot).reverse().toString();

		System.out.print("L'inverse de " + mot + " est: " + inverse);
		System.out.println();
		
		if(mot.equals(inverse))System.out.println(mot+" est un palindrome");
		else {System.out.println(mot+" n'est pas un palindrome");}
		return inverse;

//		for (int j = mot.length() - 1; j >= 0; j--) {
//
//			System.out.print(mot.charAt(j));
//		}
//		System.out.println();
//		System.out.println();
//		

		// System.out.println(inverse);

		/*
		 * char inverse=mot.charAt(j); System.out.println("L'inverse de " +mot+
		 * " est: "+inverse);}
		 * 
		 * 
		 * 
		 * 
		 * for (int i=0;i<mot.length();i++) {System.out.print(mot.charAt(i));} return
		 * mot;
		 */
	}

}
