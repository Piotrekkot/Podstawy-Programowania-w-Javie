package cw10;

public class zad6 {
	public static void main(String[] args) {
		int tab[] = { 1, 0, 0, 0, 2, 0, 0, 0, 3 };

		for (int i = 0; i < tab.length; i++) {

			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(tab[i] + " ");
		}

		System.out.println();
		System.out.println();

		for (int i = tab.length - 1; i >= 0; i--) {
			System.out.print(tab[i] + " ");
			if (i % 3 == 0) {
				System.out.println();
			}

		}

		for (int i = 0; i < tab.length; i++) {

			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(tab[i] + " ");
		}
	}

}
