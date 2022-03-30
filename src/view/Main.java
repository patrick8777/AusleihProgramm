package view;

import controller.*;

/**
 *
 * @author Patrick
 *
 */

/**
 * erstellt ausfühungs Klasse Main
 *
 */
public class Main {

	/**
	 * Erstellt die Instanz main der Klasse
	 * @param args
	 */
	public static void main(String[] args) {

		VolleKontrolle controller = new VolleKontrolle();
		controller.setupBeispielDaten();
		controller.printFreunde();
		controller.printKram();
	}
	
		// TODO Aufgabe 2.8 Java DOCs

}
