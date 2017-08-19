package cw23;

public class Kontener {

	public Cukierek ladunek;
	public double masaLadunku;
	public int dniPrzydatnosci;

	public Kontener(double maxladunek, int przydatnosc) {
		this.masaLadunku = maxladunek;
	}

	public void zaladuj( int dniPrzydatnoscix) {

		this.ladunek = Fabryka.make(2);

	}

	public boolean sprawdzPrzydatnosc(Kontener kontener) {
		if (dniPrzydatnosci < 60) {
			return true;
		} else
			return false;
	}
}