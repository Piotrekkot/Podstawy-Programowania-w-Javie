package cw12;

public class Zad5 {
	public static void main(String[] args) {
		int tab[][] = new int[8][8];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		int przekatna[] = new int[8];
		int przekatna1[] = new int[8];
		System.out.println("------------------------");
		for (int i = 0; i < tab.length; i++) {
			przekatna[i] = tab[i][i];
			System.out.println(przekatna[i]);
		}
		
		
		
		System.out.println("-------------------");
		int a = 7;
		for (int i = 0; i < tab.length; i++) {
			przekatna1[i] = tab[i][a];
			a--;
			System.out.println(przekatna1[i]);
		}
		
		int liczba=0;
		int licznikpowt = 0;
		
		for(int i=0;i<przekatna.length;i++){
			liczba=przekatna[i];
			for(int j=0;j<przekatna.length;j++){
				if(liczba==przekatna[j]){
					licznikpowt++;
					if(licznikpowt==3){
						System.out.println("sa przynajmniej 3 takie same liczby");
						break;
					}
				}
				if(liczba==przekatna1[j]){
					licznikpowt++;
					if(licznikpowt==3){
						System.out.println("sa przynajmniej 3 takie same liczby");
						break;
					}
				}
				
			}
		}
		
		for(int i=0;i<przekatna.length;i++){
			liczba=przekatna1[i];
			for(int j=0;j<przekatna.length;j++){
				if(liczba==przekatna[j]){
					licznikpowt++;
					if(licznikpowt==3){
						System.out.println("sa przynajmniej 3 takie same liczby");
						break;
				}
				if(liczba==przekatna1[j]){
					licznikpowt++;
					if(licznikpowt==3){
						System.out.println("sa przynajmniej 3 takie same liczby");
						break;
				}
				
			}
		}
		
		

	}
		}
	}
}
