
public class Igracka {
	private String naziv;
	private String tip;
	private double cijena;
	private long gProizvodnje = 2014;
	private int dOgranicenje;
	private int kolicina = 0;

	public Igracka() {
		this.naziv = "Nepoznat";
		this.tip = "Nepoznat";
		this.cijena = 0;
		this.kolicina = 0;

	}

	public Igracka(String naziv, String tip, double cijena, int kolicina) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.kolicina = kolicina;

	}

	public Igracka(String naziv, String tip, double cijena, long gProizvodnje, int kolicina) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.gProizvodnje = gProizvodnje;
		this.kolicina = kolicina;
	}

	public Igracka(String naziv, String tip, double cijena, int dOgranicenje, int kolicina) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.dOgranicenje = dOgranicenje;
		this.kolicina = kolicina;
	}

	public Igracka(String naziv, String tip, double cijena, long gProizvodnje,
			int dOgranicenje, int kolicina) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.dOgranicenje = dOgranicenje;
		this.gProizvodnje = gProizvodnje;
		this.kolicina = kolicina;
	}

	public Igracka(Igracka other) {
		this.naziv = other.naziv;
		this.tip = other.tip;
		this.cijena = other.cijena;
		this.dOgranicenje = other.dOgranicenje;
		this.gProizvodnje = other.gProizvodnje;
		this.kolicina = other.kolicina;

	}

	public boolean equals(Igracka other) {
		if (this.naziv == other.naziv && this.tip == other.tip
				&& this.cijena == other.cijena
				&& this.dOgranicenje == other.dOgranicenje
				&& this.gProizvodnje == other.gProizvodnje
				&& this.kolicina == other.kolicina) {
			return true;
		} else {
			return false;
		}
	}

	// GETERI
	public String getNaziv() {
		return naziv;
	}// Kraj getNaziv

	public String getTip() {
		return tip;
	}// Kraj getTip

	public double getCijena() {
		return cijena;
	}// Kraj getCijena

	public long getgProizvodnje() {
		return gProizvodnje;
	}// Kraj getgProizvodnje

	public int getdOgranicenje() {
		return dOgranicenje;
	}// Kraj getdOgranicenje
	public int getKolicina(){
		return kolicina;
	}

	// SETERI
	public void setNaziv(String naziv) {
		this.naziv = naziv;

	}// Kraj setNaziv

	public void setTip(String tip) {
		this.tip = tip;
	}// Kraj setTip

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}// Kraj setCijena

	public void setgProizvodnje(long gProizvodnje) {
		this.gProizvodnje = gProizvodnje;
	}// Kraj setgProizvodnje

	public void setdOgranicenja(int dOgranicenja) {
		this.dOgranicenje = dOgranicenja;
	}// Kraj setdOgranicenja
	public void setKolicina(int kolicina){
		this.kolicina = kolicina;
	}

	/**
	 * Funkcija pravi string (toString) i ona služi za ispis klase Prima kao
	 * parametre naziv, tip, cijenu, dobnoOgranicenje i godinuProizvodnje A
	 * vraća ih ispisane u zasebnim redovima
	 */
	public String toString() {
		String str = " ";
		System.out.println("Naziv: " + naziv);
		System.out.println("Tip: " + tip);
		System.out.println("Cijena: " + cijena + " KM");
		System.out.println("Dobno ogranicenje: " + dOgranicenje);
		System.out.println("Godina proizvodnje : " + gProizvodnje);
		System.out.println("Kolicina: " + kolicina);
		return str;

	}// Kraj toString
}
