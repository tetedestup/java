package application5Matrice;

import java.util.Scanner;

public class MatriceTableau {
	
	
	static void afficherOriginale(int tab[][]) {
		
		System.out.println("La matrice originale est: \n");
		
		for(int i=0;i<tab.length;i++) {
			
			for(int j=0;j<tab.length;j++) {
		
		
		System.out.print("["+tab [i][j]+"]");}
			System.out.println();
			
			
	}
		}
	
	
	static void afficherNouvelle(int tab[][]) {
		
		System.out.println("La nouvelle matrice est: \n");
		
       
		for(int i=0;i<tab.length;i++) {
			
			for(int j=0;j<tab.length;j++) {
			
				System.out.print("["+tab[j][i]+"]");}
			System.out.println();
		
		}
	}
	
	
	                                                        
	

	public static void main(String[] args) {
		
	    
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez la taille de la matrice:");
		
		int taille=sc.nextInt();
		
		int matrice[][] = new int[taille][taille];
		
		System.out.println("Entrez un nombre entier pour la rangée 0 et la colonne 0: ");
		
		matrice[0][0]=sc.nextInt();
		
		System.out.println("Entrez un nombre entier pour la rangée 0 et la colonne 1: ");
		matrice[0][1]=sc.nextInt();
		
		System.out.println("Entrez un nombre entier pour la rangée 1 et la colonne 0: ");
		matrice[1][0]=sc.nextInt();
		
		System.out.println("Entrez un nombre entier pour la rangée 1 et la colonne 1: ");
		matrice[1][1]=sc.nextInt();
		
		afficherOriginale(matrice);
		
	    afficherNouvelle(matrice);
		
		
	
	}

}
