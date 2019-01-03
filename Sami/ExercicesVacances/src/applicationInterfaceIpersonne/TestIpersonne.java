package applicationInterfaceIpersonne;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestIpersonne {

	public static void main(String[] args) {

		Personne MJ = new Personne(01, "Martin", "Jacques", new Date("06/12/1985"), 2000);

		MJ.affiche();

		Personne JP = new Personne(02, "Jean", "Paul", new Date(), 1000);

		JP.affiche();
	}

}
