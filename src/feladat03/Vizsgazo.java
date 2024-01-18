package feladat03;

public class Vizsgazo {
	
	// TODO Vizsgázók tárolása

	private String vizsgazoNeve;
	private String email;
	private String kepzoIntezmeny;
	
	
	
	public Vizsgazo(String vizsgazoNeve, String email, String kepzoIntezmeny) {
		this.vizsgazoNeve = vizsgazoNeve;
		this.email = email;
		this.kepzoIntezmeny = kepzoIntezmeny;
	}



	@Override
	public String toString() {
		return "Vizsgazó neve: " + vizsgazoNeve + " email: " + email + " képző intézmény: " + kepzoIntezmeny;
	}



	public String getKepzoIntezmeny() {
		return kepzoIntezmeny;
	}
	
	
	
	
	
}
