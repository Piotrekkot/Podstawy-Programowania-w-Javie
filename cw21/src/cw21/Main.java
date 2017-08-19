package cw21;

public class Main {
	public static void main(String[] args) {
		Dzem tru = new Dzem("truskawkowy", 200);
		Dzem mal = new Dzem("malinowy");
		Dzem jag = new Dzem(300.0);

		System.out.println(tru.toString());
		System.out.println(mal.toString());
		System.out.println(jag.toString());

		///////////////////////////////////
		Sloik truskawkowy = new Sloik();
		System.out.println(truskawkowy.CzyOtwarty());
		truskawkowy.napelnij(tru);
		truskawkowy.otworz();
		truskawkowy.oproznij();
		truskawkowy.napelnij(tru);

		System.out.println(truskawkowy.CzyOtwarty());

		////////////////////////////////////////////
		String[] wyraz = { "Ala ", "ma", "kota", "a", "kot", "ma", "Ale" };
		WyrazLista lis = new WyrazLista();
		for (int i = 0; i < wyraz.length; i++) {
			lis.dodajWyraz(new Wyraz(wyraz[i]));
		}
		lis.show();
	}

}
