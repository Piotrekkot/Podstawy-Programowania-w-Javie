package cw19;

public class kwadrat {

	double bok;
	double pole;
	double objetosc;

	public kwadrat(int bok) {
		this.bok = bok;
		this.pole = bok*bok;
		this.objetosc =bok*bok*bok;
	}

	public void show() {
		System.out.println("pole kwadratu " + this.pole);
		System.out.println("objetosc szescianu " + this.objetosc);
	}

	public Walec przygotujWalec() {
		return new Walec(bok / 2, bok);
	}
}
