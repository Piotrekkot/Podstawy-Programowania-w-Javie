package cw9;

public class Zad5 {
	public static void main(String[] args){ 
	int n = 8;
		for(int i=n; i>=0; i--){
			for(int k=0; k<n-i; k++){
				System.out.print(" ");
				}
			
			for(int p=0; p<=i; p++){
				System.out.print(" "+"*");
			}		
			System.out.println();
		}	
		for(int i=1; i<n+1; i++){
			for(int k=0; k<n-i; k++){	
				System.out.print(" ");	
				}
			for(int p=0; p<=i; p++){
				System.out.print(" "+"*");
			}
			System.out.println();	
			}
	}

}
