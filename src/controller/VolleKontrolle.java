
package controller;

import java.util.ArrayList;

import model.Ausleihe;
import model.Kram;
import model.Person;

/**
 * @author Patrick
 *
 */

/**
 * Klasse VolleKontrolle
 *
 */
public class VolleKontrolle {

	private ArrayList<Person> freunde;
	private ArrayList<Kram> krimskrams;
	private ArrayList<Ausleihe> ausleihen;

	/**
	 * erstellt eine Instanz der Klasse VolleKontrolle
	 */
	public VolleKontrolle() {
		this.freunde = new ArrayList<Person>();
		this.ausleihen = new ArrayList<Ausleihe>();
		this.krimskrams = new ArrayList<Kram>();
	}

	public void setupBeispielDaten() {
		// TODO: Aufgabe 2.6
		Person p1 = new Person("Sonja", "Meier");
		freunde.add(p1);
		Person p2 = new Person("Kevin", "Tobler");
		freunde.add(p2);
		Kram k1 =new Kram ("Teller",20);
		krimskrams.add(k1);
		Kram k2 = new Kram ("Becher",0.10);
		krimskrams.add(k2);
		ausleihen.add(new Ausleihe(p1,k1));
		ausleihen.add(new Ausleihe(p2,k2));
	}

	public void printFreunde() {
		// TODO: Aufgabe 2.7: für jeden Kollegen Namen ausgeben
		System.out.print(freunde);
	}

	public void printKram() {
		// TODO: Aufgabe 2.7: für jeden Kram Namen und Preis ausgeben
		System.out.print(krimskrams);
	}

	public void printOffeneAusleihen() {
		System.out.print(ausleihen);
	}

}
