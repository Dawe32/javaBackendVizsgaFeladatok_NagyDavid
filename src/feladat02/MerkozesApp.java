package feladat02;

import java.util.Random;

public class MerkozesApp {

	public static Random r=new Random();
	public static void main(String[] args) {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		
		for (int i = 0; i < meccs.getIdotartam(); i++) {
			int veletlenszam=r.nextInt(1,26);
			if (veletlenszam==10) {
				meccs.gooool("BajnokCsapat");
				System.out.println("Góól! szerezte a BajnokCsapat a "+i+". percben");
				
			} else if(veletlenszam==20){
				meccs.gooool("LegjobbCsapat");
				System.out.println("Góól! szerezte a LegjobbCsapat a "+i+". percben");
			}
			
			
		}
		
		System.out.println(meccs.toString());

	}

}
