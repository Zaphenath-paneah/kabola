package org.kabola.training.jse.section2.tp3;

/**
 * Cette classe permet gerer les animaux
 * @author migration11
 *
 */
public class Animal {

	/*
	 * Définition des attributs
	 */

	private int poids;
	private String couleur;

	/**
	 * Constructeur sans parametre
	 */

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Définition des méthodes
	 */

	private void afficherNom(){
		System.out.println(this);
	}

	/**
	 * Permet de dire ce que l'on boire
	 */
	public void boire() {

		afficherNom();
		System.out.println("je bois de l'eau.");
	}

	/**
	 * Permet de dire ce que l'on  mange
	 */
	public void manger() {

		afficherNom();
		System.out.println("je broute de l'herbe.");
	}


	/**
	 * Permet de dire comment l'on se déplace
	 */
	public void deplacement() {

		afficherNom();
		System.out.println("je me déplace avec mes pates.");
	}

	/**
	 * 
	 */
	public void crier() {

		afficherNom();
		System.out.println("je ris avec mon bec");
	}



	/*
	 * Définition des ascenseurs 
	 */
	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	/**
	 * Redefinition de la méthode toString
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+getCouleur()+" "+getPoids()+"\n";
	}


}
