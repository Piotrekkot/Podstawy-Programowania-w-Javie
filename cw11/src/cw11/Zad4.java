package cw11;

public class Zad4 {

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		int a = 0;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int) (Math.random() * 10);
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
		
		boolean CzyNax = false;
		for (int i = 0; i < tab.length; i++) {
		a=tab[i][i];
		for(int j = 0;j < tab[i].length)
		
				
		
			
		}
		boolean CzyNay = false;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 4; j >= 0; j--) {
					if(tab[i]==tab[j]){
						CzyNay = true;
					}
				
			}
		}
		System.out.println("przekatna x : " + CzyNax);
		System.out.println("przekatna y : " + CzyNay);
		
	}

}
