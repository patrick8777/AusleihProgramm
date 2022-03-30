package model;

import java.util.Date;

/**
 * @author Paddy
 *
 */

/**
 *  erstellt die Klasse Ausleihe
 *
 */
/**
 * @author Paddy
 *
 */
public class Ausleihe {
	private Person person;
	private Kram kram;
	private Date ausleihe;
	private Date rueckgabe;

	/**
	 * Erstellt eine Ausleihe Instanz der Klasse
	 * @param person die ausleiht
	 * @param kram der augeliehen wird
	 */
	public Ausleihe(Person person, Kram kram) {
		this.person = person;
		this.kram = kram;
		this.ausleihe = new Date();
		this.rueckgabe = null;

	}

	/**
	 * Gibt zurück wer ausgeliehen hat
	 * @return
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Gibt zurück was für ein Kram ausgeliehen worden ist
	 * @return
	 */
	public Kram getKram() {
		return kram;
	}

	/**
	 * Gibt das ausleihe Datum zurück
	 * @return
	 */
	public Date getAusleihe() {
		return ausleihe;
	}
	
	/**
	 * Gibt das ausleih Rückgabedatum zurück
	 * @return
	 */
	public Date getRueckgabe() {
		return rueckgabe;
	}

	/**
	 * Boolean wurde es ausgeliehen
	 * @return
	 */
	public boolean istAusgeliehen() {

		return rueckgabe == null;
	}
	
	/**
	 * Beendet die Ausleihe 
	 * Setzt das Rückgabe Datum auf jetzt
	 */
	public void beendenAusleihe() {
		rueckgabe = new Date();
	}
}
