package cw27;

import java.io.*;

public class Zad3{
	
	public static void main(String[] args){ 
	String[] tab1 = new String[50];
	String[] tab2 = new String[116];
	try {
	     StreamTokenizer st = new StreamTokenizer(new FileReader("C:/Users/s13830/Desktop/Fabryka.java"));
	     int wartosc;
	     int i = 0;
	     while( (wartosc = st.nextToken()) != StreamTokenizer.TT_EOF){
	            if(wartosc == StreamTokenizer.TT_WORD){  
	            	
	            	tab2[i] = st.sval;
	            	i++;}
	            	
	            
	         }
	      } catch (IOException e) {
	            System.out.println(e);
	      }
	
	try {
	     StreamTokenizer st = new StreamTokenizer(new FileReader("C:/Users/s13830/Desktop/javakey.txt"));
	     int wartosc;
	     int i = 0;
	     while( (wartosc = st.nextToken()) != StreamTokenizer.TT_EOF){
	            if(wartosc == StreamTokenizer.TT_WORD){  
	            
	            tab1[i] = st.sval;
            	i++;}
            	
	              else if(wartosc == StreamTokenizer.TT_NUMBER)  
	                    System.out.println(st.nval + " ");
	         }
	      } catch (IOException e) {
	            System.out.println(e);
	      }
	int licznik2 = 0;
	for(int i = 0; i < tab1.length; i++){
		int licznik = 0;
		
		for (int j = 0; j< tab2.length; j++){
			if(tab1[i].equals(tab2[j]))
				licznik++;
				
			}
			licznik2 += licznik;
		System.out.println(tab1[i] + " wystapilo " + licznik + " razy");
		}
	System.out.println("slowa kluczowe wystapily " + licznik2 + " razy");
	
	
	try{
		FileInputStream fis = new FileInputStream("C:/Users/s13830/Desktop/Fabryka.java");
		int c;
		int l = 0;
		
		while((c=fis.read()) != -1){
			if ((char)(c)=='(')
				l ++;
			if ((char)(c)==')')
				l --;
			if (l < 0){
				System.out.println("blad");
				break;}
		}
		if (l!=0){
			System.out.println("blad");}
			else
			System.out.println("brak bledu");
		fis.close();
	}
	catch (IOException e){
		System.out.println(e);
	}	
	
	
	
	}
	
	
}