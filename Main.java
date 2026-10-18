package motdict;

public class Main {
	public static void main(String[] args) {
		System.out.println("===Test de la classe Mot_dict ===\n");
		
		Mot_dict m1 = new Mot_dict("Livre", "Ouvrage imprime");
		System.out.println("Mot initial: " + m1.getMot());
		System.out.println("Definition initiale: " + m1.getDefinition());
		System.out.println("\n--------------------------\n");
		
		m1.setMot("Stylo");
		m1.setDefinition("outil pour ecrire");
		
		System.out.println("Nouveau mot: " + m1.getMot());
		System.out.println("Nouveau definition: " + m1.getDefinition());
		System.out.println("\n--------------------------\n");
		
		String text1 = "outil pour ecrire";
		String text2 = "Texte different ";
		
		System.out.println("Test sysnonyme 1 : " + m1.synonyme(text1));
		System.out.println("Test sysnonyme 2 : " + m1.synonyme(text2));
		
		Dictionnaire dict = new Dictionnaire("Larousse",5);
		Mot_dict m2 = new Mot_dict("Arbre" , "Plante ligneuse");
		Mot_dict m3 = new Mot_dict("Stylo" , "Outil pour ecrire");
		Mot_dict m4 = new Mot_dict("Bouquin" , "Ouvrage imprime");
		
		dict.Ajouter_Mot(m1);
		dict.Ajouter_Mot(m2);
		dict.Ajouter_Mot(m4);
		
		System.out.println("\n----contenu du dictionnaire ---");
		dict.Lister_dictionnaire();
		
		System.out.println("\n--- Test Recherche Dichotomique---");
		System.out.println("Recherche 'Arbre' :" + dict.Recherche_dicho("Arbre"));
		System.out.println("Recherche 'Cahier' :" + dict.Recherche_dicho("Cahier"));
		
		System.out.println("\n---Test nombre synonymes---");
		System.out.println("Nombrede de synonymes de 'Stylo' : " + dict.Nombre_synonyme(m3));
		
		System.out.println("\n---suppression du mot arbre---");
		dict.Supprimer_Mot(m2);
		
		System.out.println("\n---centenu apres suppression---");
		dict.Lister_dictionnaire();
		System.out.println("Nombre de mots restants :" + dict.getNb_mots());
		
		
		
				

}
}