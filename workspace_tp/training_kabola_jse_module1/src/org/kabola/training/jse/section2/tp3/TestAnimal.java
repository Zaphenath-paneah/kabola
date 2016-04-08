package org.kabola.training.jse.section2.tp3;

/**
 * Cette classe permet de tester le fonctionnement de la classe Animal
 * @author migration11
 *
 */
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal=new Animal();
		animal.setCouleur("Marron");
		animal.setPoids(32);
		
		animal.boire();
		animal.crier();
		animal.deplacement();
		animal.manger();
		
		
	}

}
