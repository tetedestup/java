import java.util.Scanner;

public class DevineMaLettre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    Scanner sc =  new Scanner(System.in);
		
		char tableau[]= {'a', 'e', 'i', 'o', 'u', 'y'};
		
		
		System.out.println("Rentrez une lettre en miniscule, SVP");
		
		char answer;
	
		
        	 
        	 do {
        		 
        		 
        		 answer= sc.nextLine().charAt(0);
   

        		 for(int i=0; i<tableau.length; i++)
        			 
                 {
        			 
        	 
        			 if(answer==tableau[0])
        			 {
   System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i) +" \n Voulez vous essayer a nouveau ? (y/n)");
        			 break;
        			 }
         		   
         		    
         		    else if(answer==tableau[1])
         		     {
   System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i+1) + " \n Voulez vous essayer a nouveau ? (y/n)");
         		    break;
         		     }
         		    
         		    
         		    else if(answer==tableau[2])	
         		    {
   System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i+2) + "\n Voulez vous essayer a nouveau ? (y/n)");
         		   break;
         		    }
         		    
         		    
         		    else if(answer==tableau[3]) 	
         		    {
   System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i+3) +" \n Voulez vous essayer a nouveau ? (y/n)");
         		   break;
         		    }
         		    
         		    
         		    else if(answer==tableau[4])	
         		    {
    System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i+4) + "\n Voulez vous essayer a nouveau ? (y/n)");
         		   break;
         		    }
         		    
         		    
         		    else if(answer==tableau[5]) 	
        		    {
    System.out.println("La lettre " + answer  +" se trouve bien dans le tableau a l'indice " + (i+5) + "\n Voulez vous essayer a nouveau ? (y/n)");
         		   break;
         		    } 
        			 
        			 
         		    else if(answer=='n') 
         		    {
         		    	System.out.println("Au Revoir :) ");
         		    	break;
         		    }
        			 
        			 
         		    else 
         				{
      System.out.println("La lettre " +  answer + " ne se trouve pas dans le tableau \n Rentrez une lettre en miniscule, SVP" );
         
		               break;
		               }
        			 

        			 }
        		 
        		 
        	 }while(answer!='n');
        	

        	 		
	}

}
