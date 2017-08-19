package cw13;

public class zad4 {

	public static void main(String[] args) {
		char[][] tab = { { 'S', 'a', 'm', 's', 'u', 'n', 'g' },
	{ 'N', 'o', 'k', 'i', 'a' }, { 'A', 'p', 'p', 'l', 'e' },
	{ 'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y' },
	{ 'A', 'l', 'c', 'a', 't', 'e', 'l' }, { 'S', 'o', 'n', 'y' },
	{ 'J', 'o', 'l', 'l', 'a' } };

		boolean czyPrawdziwe = CzyZawiera2TakieSameZnaki(tab[0]);
			System.out.println(czyPrawdziwe);
			System.out.println(czyWiekszyNiz255(tab[0]));
			System.out.println(takieSameLitery(tab[0]));
			System.out.println(czyzawierai(tab[0]));
	}

		public static boolean CzyZawiera2TakieSameZnaki(char[] tab) {
			boolean wynik = false;
			for (int i = 0; i < tab.length; i++)
			for (int j = i + 1; j < tab.length; j++) {
			if (tab[i] == tab[j]) {
				wynik = true;
	}
	}
	return wynik;
	}

		public static boolean takieSameLitery(char[] tab) {
			boolean wynik = false;
			for (int i = 0; i < tab.length; i++)
			for (int j = i + 1; j < tab.length; j++) {
			if (Character.toLowerCase(tab[i]) == Character.toLowerCase(tab[j])) {
	wynik = true;
	}
	}
	return wynik;
	}

		public static boolean czyWiekszyNiz255(char[] tab) {
	int suma = 0;
	for (int i = 0; i < tab.length; i++)
	suma += tab[i];
	if (suma <= 255)
	return false;
	else
	return true;
	}
	public static boolean czyzawierai(char[] tab){
	boolean wynik = false;
	for (int i = 0; i < tab.length; i++)
	for (int j = i + 1; j < tab.length; j++) {
	if (tab[i] =='i' && tab[j]=='i') {
	wynik = true;
	}
	}
	return wynik;
	}
	}

	
