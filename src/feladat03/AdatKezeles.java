package feladat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AdatKezeles {

	private static int sorszam = 0;

	public Map<String, Vizsgazo> adatBekeres() throws IOException{
		
		Map<String, Vizsgazo> vizsgazok = new HashMap<String, Vizsgazo>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 4; i++) {
		
		System.out.println("Adja meg a vizsgázó nevét:");
		String vizsgazoNeve=br.readLine();
		
		System.out.println("Adja meg a vizsgázó email címét:");
		String vizsgaziEmail=br.readLine();
		
		System.out.println("Adja meg a képző intézményt:");
		String kepzoIntezmeny=br.readLine();
		
		vizsgazok.put(azonositoGeneralas(), new Vizsgazo(vizsgazoNeve, vizsgaziEmail, kepzoIntezmeny));
		
		
		}
		// TODO adatbekérés megvalósítása, adatszerkezet feltöltése
		
		return vizsgazok;
		
	}

	public String azonositoGeneralas() {

		sorszam++;
		return "Vizsgazo" + sorszam;

	}

}
