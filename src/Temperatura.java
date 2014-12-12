
public class Temperatura {

	private char tipe; // Ako je Celzius (C) , Kelvin (K), Farenhajt (F);
	private double vrijednost;

	public Temperatura() {
		this.tipe = 'C';
		
		this.vrijednost = 0;
	}

	public Temperatura(char tipe, double vrijednost) {
		this.tipe = tipe;
		this.vrijednost = vrijednost;

	}

	public Temperatura(Temperatura other) {
		this.tipe = other.tipe;
		this.vrijednost = other.vrijednost;
	}
	public void pretvaranje(Temperatura add){
		if(add.tipe == 'C'){
			this.tipe = 'K';
			this.vrijednost =vrijednost + 273.15;
			this.tipe = 'F';
			this.vrijednost = vrijednost * 1.8 + 32;
		}
		if(add.tipe == 'K'){
			this.tipe = 'C';
			this.vrijednost = vrijednost - 273.15;
			this.tipe = 'F';
			this.vrijednost = vrijednost * 1.8 - 459.67;
		}
		if(add.tipe == 'F'){
			this.tipe ='C';
			this.vrijednost = (vrijednost - 32) / 1.8;
			this.tipe ='K';
			this.vrijednost = (vrijednost - 32) * 5/9 + 273.15;
		}
			
	}
	


	public char getTipe() {
		return tipe;
	}

	public void setTipe(char tipe) {
		this.tipe = tipe;
	}

	public double getVrijednost() {
		return vrijednost;
	}

	public void setVrijednost(double vrijednost) {
		this.vrijednost = vrijednost;
	}

	public String toString() {
		String str = " ";
		str = "Temperatura je: " + vrijednost + " " + tipe;
		return str;
	}
	

}
