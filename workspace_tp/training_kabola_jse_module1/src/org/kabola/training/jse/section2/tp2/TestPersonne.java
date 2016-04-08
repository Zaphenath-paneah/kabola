package org.kabola.training.jse.section2.tp2;

/**
 * Cette classe permet de tester le fonctionnement de la classe Personne
 * @author migration11
 *
 */
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne=new Personne();
		
		personne.setNom("KABOLA");
		personne.setPrenom("Version 1");
		personne.setAdresse("32 rue kingoma");
		personne.setMail("tresor@gmail.com");
		
		
		personne.setDateNaissance("2000/04/07");
		
		personne.boire("Jus, bierre, champagne, whisky");
		personne.communiquer();
		personne.manger();
		personne.penser("A l'avenir, à la puissance, à la reussite");

	}

}
