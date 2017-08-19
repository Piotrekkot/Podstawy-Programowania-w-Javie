package cw11;

public class zad1 {

	public static void main(String[] args) {
		int tab[][] = new int[4][5];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int) (Math.random() * 100);
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();

		}
		int min = tab[0][0];
		int a = 0;
		int b = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if(tab[i][j]<min){
					min=tab[i][j];
					a=i;
					b=j;
				}
			}
		}
		System.out.println("------------------------");
		System.out.println(min + " minimalna wartosc");
		System.out.println("jej indeksy to : " + "[" + a + "]" + " " + "[" + b + "]");
		

	}

}
