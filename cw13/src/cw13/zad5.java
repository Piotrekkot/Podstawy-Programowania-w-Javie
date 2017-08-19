package cw13;

import java.util.Arrays;

public class zad5 {
	
	public static void main(String[] args){
		int tab[] = new int[(int) (Math.random()*10)];
		
		for(int i=0;i<tab.length;i++){
			tab[i]=(int)(Math.random()*10);
			System.out.println(tab[i]);
		}
		
		Arrays.sort(tab);
		
		System.out.println("=========================");
		
		
		int tab1[] = new int[tab.length*2];
		for(int i=0;i<tab.length;i++){
			tab1[i]= tab[i];
			System.out.println(tab1[i]);
		}
		int maleje = tab.length-1;
		int malej[] = new int[tab.length];
		for(int i=0;i<tab.length;i++){
			malej[i] = tab[maleje];
			maleje--;
			if(maleje==0){
				break;
			}
		}
		
		for(int i=tab.length;i<tab1.length;i++){
			tab1[i]=malej[i];
		}
		
		
	}

}
