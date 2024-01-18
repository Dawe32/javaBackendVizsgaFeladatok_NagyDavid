package teszt01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat01.KategorizaloApp;

class KategorizaloAppTeszt {

	@Test
	void kategorizalTeszt() {
		
		int kod = 2;
		String elvartSzoveg = "II. osztályú termék";
		
		assertEquals(elvartSzoveg, KategorizaloApp.kategorizal(kod));
		
	}
	
	@Test
	void alaparSzamitasTeszt() {
		
		int termekAlapAr = 1500;
		int kategoriaKod = 2;
		double elvatErtek=1350.00;
		
		assertEquals(elvatErtek, KategorizaloApp.alapraSzamitas(termekAlapAr, kategoriaKod),0.01);
		
	}

}
