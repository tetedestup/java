package application7Tableaux2;

import java.util.ArrayList;

public class Application7Tableaux {

	public static void main(String[] args) {

		int tab[] = { 3, -8, 14, 4 };
		int tab2[] = remplirnouveau(tab, tab.length + 1);

		afficher(tab);
		afficher(tab2);

	}

	static void afficher(int[] tab) {

		int somme = 0;
		int indiceMax = tab.length - 1;

		System.out.print("Tableau initial: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "_");
		}

		System.out.println();
		System.out.println();
		System.out.println("Longueur du tableau : " + tab.length);

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}

		System.out.println("Somme des elements: " + somme);
		System.out.println("Indice max: " + indiceMax);

	}

	static int[] remplirnouveau(int tab[], int nb) {

		int tab2[] = new int[tab.length + 1];

		// tab2[tab2.length] = tab1[tab1.length + 1];

		//tab2 = tab;

		for (int i = 0; i < tab.length; i++) {

			tab2[i] = tab[i];
}

		tab2[tab2.length - 1] = 20;
		return tab2;

	}
}
