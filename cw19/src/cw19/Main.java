package cw19;

public class Main {

	public static void main(String[] args) {
		B.staticShowThis();

		B a = new B();
		a.nstaticShowThis();
		
		
		System.out.println();
		
	kwadrat kw = new kwadrat(2);
	kw.show();
	
	System.out.println();
	
	Walec waleckw = kw.przygotujWalec();
	waleckw.show();
	
	System.out.println();
	
	Walec W = new Walec(2,4);
	W.show();
	
	System.out.println();
	
	Wyraz nowy = new Wyraz();
	
	nowy.dodajZnak('p').dodajZnak('p').dodajZnak('j');
	nowy.dodajZnak('!');
	nowy.dodajZnak('!');
	System.out.println("Nowy : " + nowy + " posiada " + nowy.length() + " znaki.");
	System.out.println(nowy.toString());
	
	

	}

}
