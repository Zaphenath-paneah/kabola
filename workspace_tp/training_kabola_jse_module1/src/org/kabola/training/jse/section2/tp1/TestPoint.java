package org.kabola.training.jse.section2.tp1;

/**
 * Cette classe permet de tester le fonctionnement de la classe Point
 * @author migration11
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1=new Point(4,5);
		Point point2=new Point();
		
		System.out.println("Premier point");
		point1.afficher();
		point1.déplacer(2,0);
		point1.afficher();
		
		System.out.println("Deuxieme point");
		point1.initialiser(0, 3);
		point2.afficher();
		point2.déplacer(2,0);
		point2.afficher();
	}

}
