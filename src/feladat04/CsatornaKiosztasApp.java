package feladat04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsatornaKiosztasApp {

	public static void main(String[] args) throws IOException {
		
		FajlKezeles fajlObj = new FajlKezeles();
		List<Csatorna> csatornak = fajlObj.fajlBeolvas("kiosztas.csv", ",");
		
		List<Csatorna> csatornak2= new ArrayList<>();
		
		for (int i = 0; i < csatornak.size(); i++) {
			if(csatornak.get(i).getAlapitasEve()>2010) {
				System.out.println(csatornak.get(i).toString());
				
				csatornak2.add(csatornak.get(i));
			}
			
		}
		
		fajlObj.fajlKiiras("csatorna2010utan.csv", ",",csatornak2);
				

		System.out.println(csatornak2.size()+" darab csatorna felet meg a feltételnek");
		
	}

}
