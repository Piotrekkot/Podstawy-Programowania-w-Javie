package cw13;

public class zad1 {

	public static void main(String[] args) {
		int tab[] = new int[10];
		
		for(int i=0;i<tab.length;i++){
			tab[i]=(int)(Math.random()*2);
			System.out.println(tab[i]);
		}
		int licznik = 0 ;
		for(int i=0;i<tab.length-2;i++){
			if(tab[i]==1&&tab[i+1]==0&&tab[i+2]==1){
				licznik++;
			}
			
		}
		System.out.println("ciag wystapil " + licznik + " razy");

	}

}
