package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AusleihTest {
	Ausleihe a;

	@Before
	public void setUp() {
		Person p = new Person("Hans", "Müller");
		Kram k = new Kram("TV", 300);
		a = new Ausleihe(p, k);
	}

	@Test
	public void testIstAusgeliehen() {
		assertTrue(a.istAusgeliehen());
	}

	@Test
	public void testBeendenAusleihe() {
		a.beendenAusleihe();
		assertFalse(a.istAusgeliehen());
	}
}
