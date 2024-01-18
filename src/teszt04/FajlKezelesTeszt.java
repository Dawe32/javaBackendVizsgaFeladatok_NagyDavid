package teszt04;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import feladat04.FajlKezeles;

class FajlKezelesTeszt {

	@Test
	void fajlBeolvasTeszt() throws IOException {
		
		FajlKezeles fajlObj = new FajlKezeles();
		
		assertTrue(fajlObj.fajlBeolvas("kiosztas.csv",",").size()>0);
	}
	
	@Test
	void fajlTeszt() throws IOException {
		
		FajlKezeles fajlObj = new FajlKezeles();
		
		assertThrows(IOException.class,()->fajlObj.fajlBeolvas("Teszt.csv",","));
	}
	
	

}
