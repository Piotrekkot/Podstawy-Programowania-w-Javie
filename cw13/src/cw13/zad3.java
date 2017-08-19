package cw13;

public class zad3 {

	public static void main(String[] args) {
		char tab[] = {'j' , 'a' , 'v' , 'a'};
		
		for(int i=0;i<tab.length;i++){
			System.out.print(tab[i]);
		}
		
		System.out.println();
		
		
		for(int i=0;i<tab.length;i++){
			tab[i]=(char) (tab[i] +  i) ;
			System.out.print(tab[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<tab.length;i++){
			tab[i]=(char) (tab[i] - i) ;
			System.out.print(tab[i]);
		}
		
		

	}

}
