import java.util.Scanner;

public class compares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*int a = 5, b = 2;
	
	if( a > b ) {
		System.out.println("le" + " " + b);
	}
		
	else {
		System.out.println("n'est pas plus otit que a ");
	}
		*/
		
//	int a = 5;
//	
//	if(a > 5) {
//		System.out.println("a est positif");
//	}
//	else if(a == 5) {
//		System.out.println("a est nul");
//	}
//		
//	else  {
//		System.out.println("a est négatif");
//	}
		
	/*	int a = 55;
		
		if( a >= 50 && a <=100) {
			System.out.println("a il est entre 50 et 100");
		}
		else {
			System.out.println("a il est pas entre 50 et 100");
		}*/
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("entre le premir chifre");
		
		int input1 = scan1.nextInt();
		System.out.println("entre le 2em chifre");
		int input2 = scan2.nextInt();
		System.out.println("vous aves entrez :" + input1 + " et " + input2);
		
		if (input1 > input2) {
			System.out.println(input1 + " est plus grand que " + input2);
			}
		else if (input1 < input2) {
			System.out.println(input1 + " est plus ptit que " + input2);
		}
		else {
			System.out.println("ils sont  egaux " );
		}
		
	}

}
