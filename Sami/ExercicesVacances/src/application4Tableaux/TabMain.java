package application4Tableaux;

public class TabMain {

	public static void main(String[] args) {
		
		int tab[]= {3,8,7,6,12,13,14,15,56,66,};
		System.out.println("TABLEAU 1\n");
		tableaux(tab);
		System.out.println();
		
	    int tab1[]=remplir1(5);
	    System.out.println("TABLEAU 2\n");
	    tableaux(tab1);
	    System.out.println();
	    
	    int tab2[]=remplir2(10);
	    System.out.println("TABLEAU 3\n");
	    tableaux(tab2);
	    System.out.println();
	    
	    int tab3[]=remplir3(5);
	    System.out.println("TABLEAU 4\n");
	    tableaux(tab3);
	
	}	
	
	
	static void tableaux(int tab[]) {
		
		afficher(tab);
		System.out.println();
		System.out.println();
		System.out.println();
		
		operation1(tab);
		

		operation2(tab);
		
		operation3(tab);
		
		operation4(tab);
	
	    operation5(tab);
		
	}
	
	
	
	static void afficher(int tab[]) {
		
		
	/*for(int i = 0;i<tab.length;i++) {
		
		System.out.print(tab[i]+" ");
		}*/
		
		
		for (int i:tab) {System.out.print(i+" ");}
	};
		
	
	static int[] remplir1(int nb) {
			
			int tab[]=new int[nb];
			//tab[0]=0;
			
			for(int i = 0;i<tab.length;i++) {tab[i]=i;};
			
			return tab ;};
			
	
	static int []remplir2(int nb){
		
		int tab[]=new int[nb];
	
		
		for(int i = 0;i<tab.length;i++) {tab[i]=i+5;};
		
		
		return tab;}
	
	
	static int []remplir3(int nb){
		
		int tab[]=new int[nb];
		//int nb1=tab.length;
		//nb1=nb;
		
		for(int i=0;i<tab.length;i++) {tab[i]=nb--;};
		
		
		return tab;}
		
		
	static void operation1(int[]tab) {
		
		int elements=0;
		
		for(int i=0;i<tab.length;i++) {
			
			if(tab[i]==9) {elements++;};
			
			}
		
		System.out.println("Elements de valeur 9: "+elements);
	}
	
	
	static void operation2(int tab[]) {
		
		int elements =0;
		
		for(int i=0;i<tab.length;i++) {
			
			if(tab[i]>4||tab[i]<2) {elements++;}
		}
		
		System.out.println(elements+" elements sont plus grands que 4 ou plus petits que 2");
	}
		
		
		
	static void operation3(int tab[]) {
		
		
		int somme=0;
		
		for (int i=0;i<tab.length;i++) {somme+=tab[i];}
		
		
	System.out.println("La somme des elements du tableau est de: "+somme);
		
	}	
	
	
	static void operation4(int tab[]) {
		
		double moyenne=0;
	    double somme=0;
		
		for (int i=0;i<tab.length;i++) {somme+=tab[i];};
		
		
		
		for (int i=0;i<tab.length;i++) {moyenne=somme/tab.length;}
		
		System.out.println("La moyenne des elements est de: "+moyenne);
	}
	
	
	static void operation5(int tab[]) {
		
		int plusgrand=0;
		
		for (int i=0;i<tab.length;i++) {
			
		 if(plusgrand<tab[i]) plusgrand=tab[i];}
		
		
		System.out.println("Le plus grand element du tableau est: "+plusgrand);  

  }
}
