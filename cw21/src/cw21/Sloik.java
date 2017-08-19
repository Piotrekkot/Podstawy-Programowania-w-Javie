package cw21;

public class Sloik {
	boolean stan;
	Dzem dzem;

	void napelnij(Dzem dzem) {

		if (CzyOtwarty() == false || this.dzem == dzem)
			System.out.println("Sloik jest napelniony i zamkniety");
		else if (CzyOtwarty() == true || this.dzem == dzem) {
			zamknij();
			System.out.println("Zamknieto napelniony sloik");
		} else if (CzyOtwarty() == false || this.dzem == null) {
			otworz();
			this.dzem = dzem;
			zamknij();
			System.out.println("Sloik zostal otwarty, napelniony i zamkniety");
		} else {
			this.dzem = dzem;
			zamknij();
			System.out.println("Sloik zostal napelniony i zamkniety");
		}
	}

	void oproznij() {
		this.dzem = null;
	}

	void otworz() {
		stan = true;

	}

	void zamknij() {
		stan = false;
	}

	boolean CzyOtwarty() {
		return stan;
	}
}
