import java.util.Scanner;

public class verifierNombre {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Taper un nombre entier"+"\n");
		 int nombre = sc.nextInt();
		 
		 if((nombre > 50)&& (nombre < 100)) {
			 System.out.println("Le nombre "+ nombre +" est dans l'intervalle");
		 }else {
			 System.out.println("Le nombre "+ nombre +" n'est pas dans l'intervalle");

		 }
		
	}

}
