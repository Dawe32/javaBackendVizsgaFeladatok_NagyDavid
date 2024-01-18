package feladat04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FajlKezeles {
	
	
	public List<Csatorna> fajlBeolvas(String fajlnev, String elvalaszto) throws IOException {
		
		List<Csatorna> csatornak = new ArrayList<Csatorna>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8")); 
		
		while (br.ready()) {
			
			String [] csvSor=br.readLine().split(elvalaszto);
			csatornak.add(new Csatorna(csvSor[0], csvSor[1], csvSor[2], Integer.parseInt(csvSor[3]), Integer.parseInt(csvSor[4])));
			
		}
		
		// TODO fájlból olvasás; példányosítás; listában tárolás
		
		
		return csatornak;
		
	}

	public void fajlKiiras(String fajlnev, String elvalaszto, List<Csatorna> csatornak2) throws IOException {
		
		FileWriter fw=new FileWriter(fajlnev,Charset.forName("UTF-8")); 
		
		for (int i = 0; i < csatornak2.size(); i++) {
			fw.write(csatornak2.get(i).getMegnevezes()+elvalaszto+
					csatornak2.get(i).getKategoria()+elvalaszto+
					csatornak2.get(i).getNyelv()+elvalaszto+
					csatornak2.get(i).getCsatornahely()+elvalaszto+
					csatornak2.get(i).getAlapitasEve()+"\n"
					);
	
			
			
		}
		
		
		fw.close();
				
		
	}
	
	

	
	

}
