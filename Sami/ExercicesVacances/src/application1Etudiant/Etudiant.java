package application1Etudiant;

public class Etudiant {
	
	String nom;
	
	
 public Etudiant(String pnom) { 
	 this.nom=pnom;
 };
 
 
  public void travailler() {
	  
	   System.out.println(this.nom + " se met au travail !");
  }

  public void seReposer() {
	  
	  System.out.println(this.nom + " se repose.");
  }











}
