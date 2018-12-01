import java.util.Scanner;

public class compare {
	


	 
	
	
	

	public static void main(String[] args) {
		
		while(true) {
			
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Taper  nombre 1 entier"+"\n");
		 int nombre1 = sc.nextInt();
		  
		  System.out.println("Taper  nombre 2 entier"+"\n");
			int nombre2 = sc.nextInt();
			
		
		if(nombre1 > nombre2) {
			System.out.println("Le nombre "+nombre2+" est plus petit");
		} else if(nombre1 < nombre2){
			System.out.println("Le nombre "+nombre1+" est plus petit");			
			
		} else {
			System.out.println("Le nombre "+nombre1+"est egual le nombre "+ nombre2);
		}
		
		

		System.out.println("vous voulez continuer? oui=o ou non=n ");
		 Scanner scn = new Scanner(System.in);
		// char reponse = scn.next().charAt(0);
		 String reponse = scn.next();

		 if(reponse.contains("o")) {
			continue;
			
		 }else {
			 System.out.println("Fin de la programme");
			break;
		 }
	
		
		}
		
		
	}

}
