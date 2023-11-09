
public class Vairuotojas {

	String vardas;
	String automobilis;
	String valstNr;
	int rida;
	
	public Vairuotojas(String vardas, String automobilis, String valstnr, int rida) {
		this.vardas = vardas;
		this.automobilis = automobilis;
		this.valstNr = valstnr;
		this.rida = rida;
	}
	
	public String getName() {
		return vardas;
	}

	public String getAutomobilis() {
		return automobilis;
	}

	public void setAutomobilis(String automobilis) {
		this.automobilis = automobilis;
	}

	public String getValstNr() {
		return valstNr;
	}

	public void setValstNr(String valstNr) {
		this.valstNr = valstNr;
	}

	public int getRida() {
		return rida;
	}

	public void setRida(int rida) {
		this.rida = rida;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %d", vardas, automobilis, valstNr, rida);
	}
	
}
