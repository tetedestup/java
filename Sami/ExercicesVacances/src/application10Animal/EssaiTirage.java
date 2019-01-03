package application10Animal;

import java.util.Random;

public class EssaiTirage {
	
	
//	static java.util.Random alea = new java.util.Random();
//	static Animal tirage()
//	{
//	return (Math.abs(alea.nextInt()) % 2 == 0 ? new Oiseau() : new Chat());
//	}
//	public static void main(String[] arg)
//	{
//	tirage().devine();
//	}
	
	static Random rand=new Random();
	

	public static void main(String[] args) {
		
		Animal oiseau=new Oiseau();
		Animal chat=new Chat();
		
		
		
		if (tirage().equals("oiseau")) {System.out.print("Cui Cui ");oiseau.devine();}
		
		else {System.out.print("Miaou ");chat.devine();}
		}
 
   static String tirage() {
	   
	   String tab[]=new String[2];
   
	   tab[0]="oiseau";
	   tab[1]="chat";
 
	   return tab[rand.nextInt(tab.length)];}

}
