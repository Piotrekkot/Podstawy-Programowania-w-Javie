package cw13;

public class zad2 {

	public static void main(String[] args) {
		double tab1[] = new double[3];
		double tab2[] = new double[3];

		
		for(int i=0;i<tab1.length;i++){
			tab1[i]=Math.random()*5.0;
			System.out.println(tab1[i]);
		}
		
		System.out.println("------------------------");
		
		for(int i=0;i<tab1.length;i++){
			tab2[i]=Math.random()*5.0;
			System.out.println(tab2[i]);
		}
		
		System.out.println("------------------------");
		
		double tab3[] = new double[3];
		
		tab3[0]= tab1[0] + tab2[2];
		tab3[1]= tab1[1] + tab2[1];
		tab3[2]= tab1[2] + tab2[0];
		
		for(int i=0;i<tab3.length;i++){
			System.out.println(tab3[i]);
		}
	}

}
