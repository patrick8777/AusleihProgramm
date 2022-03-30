package model;

/**
 * @author Paddy
 *
 */

/**
 * erstllet Klasse Person
 *
 */
public class Person {
	// TODO: Aufgabe 2.1
	private String vorname;
	private String nachname;

	/**
	 * Erstellt eine Person
	 * @param vname Vorname der Person
	 * @param nname Nachname der Person
	 */
	public Person(String vname, String nname) {
		this.vorname = vname;
		this.nachname = nname;
	}

	/**
	 * Gibt den Vornamen zurück
	 * @return
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * Gibt den Nachnamen zurück
	 * @return
	 */
	public String getNachname() {
		return nachname;

	}
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return vorname + " " + nachname;
	}
}
