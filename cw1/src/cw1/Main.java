package cw1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		scan.close();
		
		if(a>b){
			int z=a;
			a=b;
			b=z;
		}
		if(b>c){
			int z = c;
			c=b;
			b=z;
		}
		if(a>b){
			int z = b;
			b=a;
			b=z;
			
			
		}
		
		System.out.println(a + " " + b + " " + c);
		
		
	}

}
