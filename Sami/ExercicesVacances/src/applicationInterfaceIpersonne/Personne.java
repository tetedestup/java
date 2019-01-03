package applicationInterfaceIpersonne;

import java.util.Date;

public class Personne  extends Profil implements Ipersonne{
	
	static int id;
	String nom;
	String prenom;
	Date ddn;
	double salaire;
	
	
	public Personne(int libelle,String nom,String prenom,Date ddn,double salaire) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.ddn=ddn;
		this.salaire=salaire;
		
		this.libelle=libelle;
		
	}
	
	public void affiche() {
		
		 if (this.libelle==01) {

System.out.println("Je suis le directeur "+nom+" "+prenom+" né le "+ddn+", mon salaire est de : "+calculersalaire());
		 }
		 if(this.libelle==02) {
System.out.println("Je suis l'employé "+nom+" "+prenom+" né le "+ddn+", mon salaire est de : "+calculersalaire());			 
	}}
	
	
	public double calculersalaire() {
		
		if(libelle==01)salaire=salaire*1.2;
		if (libelle==02)salaire=salaire*1.1;
		
		
			return salaire;}

}
