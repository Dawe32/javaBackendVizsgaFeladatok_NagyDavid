package feladat04;

public class Csatorna {
	
	private String megnevezes;
	private String kategoria;
	private String nyelv;
	private int csatornahely;
	private int alapitasEve;
	
	public Csatorna(String megnevezes, String kategoria, String nyelv, int csatornahely, int alapitasEve) {
		this.megnevezes = megnevezes;
		this.kategoria = kategoria;
		this.nyelv = nyelv;
		this.csatornahely = csatornahely;
		this.alapitasEve = alapitasEve;
	}

	public int getAlapitasEve() {
		return alapitasEve;
	}

	@Override
	public String toString() {
		return "Csatorna [megnevezes=" + megnevezes + ", kategoria=" + kategoria + ", nyelv=" + nyelv
				+ ", csatornahely=" + csatornahely + ", alapitasEve=" + alapitasEve + "]";
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public String getKategoria() {
		return kategoria;
	}

	public String getNyelv() {
		return nyelv;
	}

	public int getCsatornahely() {
		return csatornahely;
	}
	
	
	
	
	
	

}
