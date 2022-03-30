package model;

import java.util.Date;

/**
 * @author Paddy
 *
 */

/**
 * erstellt die  Klasse Kram
 * 
 */
public class Kram {
	private String name;
	private Date kaufdatum;
	private double preis;

	/**
	 * erstellen Methode Kram 
	 * @param name
	 * @param preis
	 */
	public Kram(String name, double preis) {
		this.name = name;
		this.preis = preis;
		this.kaufdatum = new Date();
	}

	/**
	 * Gibt den Namen zur�ck
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt das Kaufdatum zur�ck
	 * @return
	 */
	public Date getKaufdatum() {
		return kaufdatum;
	}
	
	/**
	 * Gibt den Preis zur�ck
	 * @return
	 */
	public double getPreis() {
		return preis;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name + " " + preis;
	}
}
