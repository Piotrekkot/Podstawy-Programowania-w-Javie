package cw12;

public class Zad4 {

	public static void main(String[] args) {
		int tab1[] = new int[(int)(Math.random()*10)];
		int tab2[] = new int[(int)(Math.random()*10)];
		int tab3[] = new int[(int)(Math.random()*10)];
		
		for(int i=0;i<tab1.length;i++){
			tab1[i]=(int)(Math.random()*10);
		}
		
		for(int i=0;i<tab1.length;i++){
			tab2[i]=(int)(Math.random()*10);
		}
		
		for(int i=0;i<tab1.length;i++){
			tab3[i]=(int)(Math.random()*10);
		}
		
		int[][] tab = {tab1, tab2, tab3};
		
		for(int i=0;i<tab.length;i++){
			for(int j = 0;j<tab[i].length;j++){
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}

	}

}
