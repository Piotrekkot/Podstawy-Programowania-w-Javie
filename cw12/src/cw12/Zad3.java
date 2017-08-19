package cw12;

public class Zad3 {

	public static void main(String[] args) {
		int tab[] = new int[20];

		for (int i = 0; i <= 18; i++) {
			tab[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		
		System.out.println("-------------------------------------");

		for (int i = 18; i >= 10; i--) {
			tab[i + 1] = tab[i];
		}

		tab[10] = -1;

		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}

	}

}
