package teszt03;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import feladat03.AdatKezeles;
import feladat03.Vizsgazo;
import feladat03.VizsgaztatoApp;

@TestMethodOrder(OrderAnnotation.class)


class AdatKezelesTeszt {

	

	@Test
	@Order(1)
	void azonositoGeneralasTeszt() {

		AdatKezeles adatObj = new AdatKezeles();

		String elvartEredmeny = "Vizsgazo1";

		assertEquals(elvartEredmeny, adatObj.azonositoGeneralas());

	}

	@Test
	void ProfiSuliTeszt() throws IOException {

		AdatKezeles adatObj = new AdatKezeles();

		Map<String, Vizsgazo> vizsgazok = adatObj.adatBekeres();
		String IntezmenyNeve="ProfiSuli";

		assertTrue(VizsgaztatoApp.profiSuli(vizsgazok, IntezmenyNeve));

	}

}
