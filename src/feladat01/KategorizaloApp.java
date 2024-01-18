package feladat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KategorizaloApp {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int termekAlapAr;
		int kategoriaKod;
		String kategoria;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Adja meg a termék alap árát:");
		termekAlapAr = Integer.parseInt(br.readLine());

		System.out.println("Adja meg a termék kategóriáját:");
		kategoriaKod = Integer.parseInt(br.readLine());

		kategoria = kategorizal(kategoriaKod);

		double szamitottAlapar = alapraSzamitas(termekAlapAr, kategoriaKod);

		System.out.println("A kategorai kód:" + kategoria);
		System.out.println("A termék alapára:"+termekAlapAr);
		System.out.printf("aktuális ár: %.2f", szamitottAlapar);

	}

	public static double alapraSzamitas(int termekAlapAr, int kategoriaKod) {

		double szorzo=0;
		switch (kategoriaKod) {
		
		case 1:
			 szorzo=1;
			break;
		case 2:
			szorzo=0.9;
			break;
		case 3:
			szorzo=0.8;
			break;

		}

		return termekAlapAr * szorzo;
	}

	public static String kategorizal(int kod) {

		String szoveg = null;
		switch (kod) {

		case 1:
			szoveg = "I. osztályú termék";
			break;
		case 2:
			szoveg = "II. osztályú termék";
			break;
		case 3:
			szoveg = "III. osztályú termék";
			break;

		}

		return szoveg;
	}

}
