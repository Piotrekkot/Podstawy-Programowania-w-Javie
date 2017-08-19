package cw11;

public class Zad3 {

	public static void main(String[] args) {
		boolean wynik = isDiagonal(new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } });
		System.out.print(wynik);

	}

	public static boolean isDiagonal(int[][] tab) {
		boolean wynik = true;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {

				if (i != j) {

					if (tab[i][j] != 0) {
						wynik = false;
					}
				}
			}
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i].length != tab.length) {
					wynik = false;
				}
			}
		}

		return wynik;

	}
}
