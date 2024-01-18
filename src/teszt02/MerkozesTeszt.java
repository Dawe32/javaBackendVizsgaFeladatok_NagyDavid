package teszt02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat02.Merkozes;

class MerkozesTeszt {

	@Test
	void MerkozesTest() {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		assertEquals(90, meccs.getIdotartam());
		
	}
	
	@Test
	void IMerkezesTest() {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		meccs.gooool("BajnokCsapat");
		int elvartErtek=1;
		assertEquals(elvartErtek, meccs.getHazaiGolszam());
		
	}
	
	@Test
	void IMerkezesTestVendeg() {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		meccs.gooool("LegjobbCsapat");
		int elvartErtek=1;
		assertEquals(elvartErtek, meccs.getVendegGolszam());
		
	}
	
}
