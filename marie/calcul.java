package exple3;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int a = 6, b = 3;

if(a<b) {
	System.out.println("resultat = " + a);
}
else if(a>b) {
	System.out.println("resultat = " + b);

}	
else {

	System.out.println("resultat a et b sont égales");
}


int c = 6;

if(c<0) {
	System.out.println("resultat = negatif");
}
else if(c>0) {
	System.out.println("resultat = positif");

}	
else {

	System.out.println("resultat = nul");
}

System.out.println("Entrée un nombre");
Scanner sc = new Scanner(System.in);
int e = sc.nextInt();

if(e>=50 && e<=100) {
	System.out.println("resultat e est dans l'intervalle [50,100]");

}	
else {

	System.out.println("resultat e n'est pas dans l'intervalle [50,100]");
}

	}

}
