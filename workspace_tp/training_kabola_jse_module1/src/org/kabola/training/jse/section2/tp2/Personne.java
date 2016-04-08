package org.kabola.training.jse.section2.tp2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Cette classe permet gerer les personnes
 * @author migration11
 *
 */
public class Personne {

	/*
	 * Définition des attributs
	 */

	private String nom;
	private String prenom;
	private long age;
	private String adresse;
	private String mail;

	/**
	 * Constructeur sans parametre
	 */

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Définition des méthodes
	 */

	/**
	 * Permet de calculer l'age d'une personne
	 */
	private long calculerAge(Calendar calendar) {

		Calendar aujourd8=Calendar.getInstance();
		
		//Conversion de la date encounrs et de la date de naissance en milliseconde
		//ensuite on soustrait ces deux valeurs pour avoir le nombre de jour en milliseoconde
		
		//1 jr =86400s=86400000ms
		//ensuite on fait une conversion du jour en année
						
		return ((aujourd8.getTimeInMillis()-calendar.getTimeInMillis())/86400000)/365;
	}
	
	
	private void afficherNom(){
		System.out.println(this);
	}

	
	/**
	 * Permet de dire ce que l'on aime boire
	 */
	public void boire(String boisson) {

		afficherNom();
		System.out.println("je bois le/la :"+boisson+".");
	}

	/**
	 * Permet de dire ce que l'on aime mangé
	 */
	public void manger() {
		
		afficherNom();
		System.out.println("je mange tout.");
	}

	
	/**
	 * Permet de dire à quoi l'on pense
	 */
	public void penser(String pense) {
		
		afficherNom();
		System.out.println("je pense souvent à :"+pense+".");
	}

	/**
	 * Permet de dire comment l'on communique
	 */
	public void communiquer() {
		
		afficherNom();
		System.out.println("je communiquer par la voie, les yeux et les gestes.");
	}
	
	
	/**
	 * Permet de calculer l'age par rapport à la date de naissance
	 * @param calendar
	 */
	public void setDateNaissance(String dateNaiss) {
		
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
		
		Calendar calendar=Calendar.getInstance();
		try {
			calendar.setTime(DATE_FORMAT.parse(dateNaiss));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.age = calculerAge(calendar);
	}


	/*
	 * Définition des ascenseurs 
	 */


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getAge() {
		return age;
	}	

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	/**
	 * Redefinition de la méthode toString
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+getNom()+" "+getPrenom()+"\n"
				+getAge();
	}



}
