package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
 		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		//Prend un object de la classe "Requête" et retourne la phrase "requête analysée"
		//Analyser la requête
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Compare les données et retourne la phrase "Cluster trouvé"
		// Comparaison des données
		return "Cluster trouvé";
	}

}
