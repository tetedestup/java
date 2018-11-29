import java.util.Scanner;

public class compareNp {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Taper un nombre entier"+"\n");
		 
		 int nombre = sc.nextInt();
		 
		 if(nombre > 0) {
			 System.out.println("Le nombre "+ nombre +" est positif");
		 }else {
			 System.out.println("Le nombre "+ nombre +" est nigatif");

		 }

	}

}
