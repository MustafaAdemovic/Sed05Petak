
public class TemperaturaTest {

	public static void main(String[] args) {
		Temperatura temperatura = new Temperatura();
		System.out.println("Unesite teperaturu: ");
		double temp = TextIO.getlnDouble();
		temperatura.setVrijednost(temp);
		System.out.println("Unesite kako zelite da ju ispise F, K ili C");
		char B = TextIO.getChar();
		temperatura.setTipe(B);
		
		
		
	
		
		System.out.println(temperatura);
	
		

		
		

	}

}
