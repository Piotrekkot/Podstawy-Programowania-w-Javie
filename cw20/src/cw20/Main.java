package cw20;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		String a = "Ala ma kota";
		kwadrat k = new kwadrat(5);
		Walec w = new Walec(5,10);
		KulaW kulak = new KulaW(k);
		KulaW kulaw = new KulaW(w);
		System.out.println(kulak.r);
		System.out.println(kulaw.r);
		
		
		System.out.println(a.indexOf('k'));
		System.out.println(a.charAt(3) + " i  " + a.charAt(5));
	

	}

}
