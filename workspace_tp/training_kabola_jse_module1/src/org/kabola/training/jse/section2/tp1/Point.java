package org.kabola.training.jse.section2.tp1;

/**
 * Cette classe permet de manipuler les points dans un plan
 * @author migration11
 *
 */
public class Point {

	/*
	 * Définition des attributs
	 */

	/**
	 * Abscisse d'un point
	 */
	private int abs;

	/**
	 * Ordonnée d'un point
	 */
	private int ord;


	/**
	 * Constructeur sans parametre
	 */
	public Point() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructeur avec parametre
	 * @param abs
	 * @param ord
	 */
	public Point(int abs, int ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}

	/*
	 * Définition des méthodes
	 */

	/**
	 * Permet d'initialiser les coordonnées d'un point
	 * @param abs
	 * @param ord
	 */
	public void initialiser(int abs, int ord) {
		this.abs = abs;
		this.ord = ord;
	}

	/**
	 * Permet de déplacer un point
	 */
	public void déplacer(int abs, int ord) {

		this.abs+=abs;
		this.ord+=ord;

	}

	/**
	 * Permet d'afficher la position d'un point
	 */
	public void afficher() {

		System.out.println("Je suis un point de coordonnées ( "+ abs+","+ord+" )");
	}



	/*
	 * Définition des ascenceurs
	 */

	public int getAbs() {
		return abs;
	}


	public void setAbs(int abs) {
		this.abs = abs;
	}


	public int getOrd() {
		return ord;
	}


	public void setOrd(int ord) {
		this.ord = ord;
	}




}
