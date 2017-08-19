package cw3;

import java.util.Scanner;


public class Main {
//zad1
	/*
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		String s = scan.next();
		double c = 0;
		if(s.equals("+")){
			c = a + b;
		}
		if(s.equals("-")){
			c= a - b;
		}
		if(s.equals("*")){
			c=a*b;
		}
		if(s.equals("/")){
			c=a/b;
		}
				
		
		System.out.println(c);

	}
	*/
//zad2
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int max = a;
		int min = b;
		
		if(max<b){
			max=b;
		}
		if(max<c){
			max=c;
		}
		if(max<d){
			max=d;
		}
		
		
		if(min>a){
			if(a<c&&a<d){
				min = a;
			}
			
		}
		if(min>c){
			if(c<a&&c<d){
				min=c;
			}
			
		}
		if(min>d){
			if(d<a&&d<c){
				min=d;
			}
		}
		
		System.out.println(max-min);
	}
	
	 
	///////zad4
	/*
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println();
			
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
		}
	}
	 */
	
	//////zad3
	
	/*
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int liczba = scan.nextInt();
		int reszta = 0;
		String ciag = "";
		
		while(true){
			reszta=liczba%2;
			if(reszta==1){
				liczba--;
			}
			liczba = liczba/2;
			ciag += reszta + ",";
			
			if(liczba==0){
				break;
			}
		}
		System.out.println(ciag);
		
		*/
		
	}
