package cw10;

public class Zad1 {

	public static void main(String[] args) {
		int[] tab = new int[10];
		
		for(int i=0;i<10;i++){
			tab[i]=(int)(Math.random()*2);
			System.out.println(tab[i]);
		}
		int a = 0,b = 0;
		for(int i=0;i<10;i++){
			if(tab[i]==0){
				a++;
			}
			if(tab[i]==1){
				b++;
			}
			
		}
		System.out.println("wylosowalem" + " " + a + " " + "liczb 0" + " " + "i" + " " + b + " " + "liczb 1" );

		
		int[] losowa = new int[1+(int)(Math.random()*10)];
		
		System.out.println(losowa.length);
		
		System.out.println("--------------------------------");
		double[] dtab = new double[10];
		
		for(int i = 0 ; i < dtab.length; i++){
			dtab[i]=Math.random()*20;
			System.out.println(dtab[i]);
			
		}
		
		
	
			
		}
	}


