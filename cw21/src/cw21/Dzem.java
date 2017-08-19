package cw21;

public class Dzem {
	private String smak;
	private double waga;

	Dzem(String smak, double waga) {
		this.smak = smak;
		this.waga = waga;
	}

	Dzem(String smak) {
		this(smak, 100.0);
	}

	Dzem(double waga) {
		this("No Name", waga);

	}

	public String toString() {
		return smak + "," + waga;
	}

}
