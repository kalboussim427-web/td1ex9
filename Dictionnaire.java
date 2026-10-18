package motdict;

public class Dictionnaire {
	private String Nom;
	private Mot_dict[] Dict;
	private int nb_mots;
	
	public Dictionnaire(String Nom, int tailleMax) {
		this.Nom=Nom;
		this.Dict= new Mot_dict[tailleMax];
		this.nb_mots=0;
	}
	public int getNb_mots() {
		return nb_mots;
	}
	public String getNom() {
		return Nom;
	}
	public void trier() {
		for (int i = 0 ; i<nb_mots-1 ;i++) {
			for(int j=0 ; j<nb_mots-1-i ; i++) {
				if(Dict[j].getMot().compareTo(Dict[j+1].getMot()) >0){
					Mot_dict temp=Dict[j];
					Dict[j] = Dict[j+1];
					Dict[j+1]=temp;
					
				}
			}
		}
		}
	public void Ajouter_Mot(Mot_dict m) {
		if (nb_mots < Dict.length) {
			int i = nb_mots - 1;
			while (i >= 0 && Dict[i].getMot().compareTo(m.getMot()) > 0) {
				Dict[i+1]=Dict[i];
				i--;
			}
			Dict[i+1]=m;
			nb_mots++;
		}
	}
	public void Supprimer_Mot(Mot_dict m) {
		int index = -1;
		for(int i = 0 ; i< nb_mots; i++) {
			if(Dict[i].getMot().equals(m.getMot())) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(int i = index; i< nb_mots -1 ; i++) {
				Dict[i]= Dict[i+1];
			}
		Dict[nb_mots - 1]= null;
		nb_mots--;
		}		
	}
	public String Recherche_dicho(String motCherche) {
		int debut = 0;
		int fin = nb_mots -1 ;
		
		while(debut <=fin) {
			int millieu = (debut + fin ) /2 ;
			int comp=Dict[millieu].getMot().compareTo(motCherche);
			
			if (comp == 0) {
				return Dict[millieu].getDefinition();}
				else if(comp <0) {
					debut = millieu + 1 ;
				}
				else {
					fin = millieu -1;
				}
			}
		return "Mot non trouve";
		}
	public void Lister_dictionnaire() {
		for(int i =0 ; i<nb_mots; i++) {
			System.out.println(Dict[i]);
		}
	}
	public int Nombre_synonyme (Mot_dict m) {
		int count =0;
		for(int i = 0; i< nb_mots ; i++) {
			if(!Dict[i].getMot().equals(m.getMot()) && Dict[i].synonyme(m.getDefinition())) {
				count++;
			}
		}
		return count;
		}
	}


