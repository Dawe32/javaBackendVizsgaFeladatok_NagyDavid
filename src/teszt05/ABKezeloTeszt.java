package teszt05;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import feladat05.ABKezelo;

class ABKezeloTeszt {

	@Test
	void vasutLekerdezoTeszt() throws SQLException {
		
		String connectionURL = "jdbc:mysql://localhost:3306/vasutvonalak?autoReconnect=true&useSSL=false";
		ABKezelo dbMotor = new ABKezelo(connectionURL,"root","Ruander2000");
		
		dbMotor.csatlakozas();
		assertTrue(dbMotor.vasutLekerdezo().size()>0);
		dbMotor.bontas();
		
	}
	

}
