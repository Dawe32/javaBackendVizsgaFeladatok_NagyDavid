package feladat02;

public class Merkozes implements IMerkozes {
	
	private String hazai;
	private String vendeg;
	private int idotartam;
	private int hazaiGolszam;
	private int vendegGolszam;
	
	public Merkozes(String hazai, String vendeg) {

		this.hazai = hazai;
		this.vendeg = vendeg;
		idotartam=90;
		hazaiGolszam=0;
		vendegGolszam=0;
				
		
	}

	public int getIdotartam() {
		return idotartam;
	}

	

	@Override
	public void gooool(String melyikCsapatSzerezte) {
		
		if (melyikCsapatSzerezte.equals(hazai)) {
			hazaiGolszam++;
		} else if (melyikCsapatSzerezte.equals(vendeg))  {
			vendegGolszam++;
		} else {
			System.out.println("Hibás adat");
		}
			;
		
	}
	
	
	public int getHazaiGolszam() {
		return hazaiGolszam;
	}

	public int getVendegGolszam() {
		return vendegGolszam;
	}

	@Override
	public String toString() {
		return "A meccs végeredménye:"+ hazai +" - "+vendeg+" "+ hazaiGolszam +":" + vendegGolszam;
	}
	
}
