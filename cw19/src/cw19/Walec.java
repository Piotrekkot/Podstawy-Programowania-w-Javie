package cw19;

public class Walec {
double promien, wysokosc;
	
	public Walec(double promien, double wysokosc)
	{
		this.promien = promien;
		this.wysokosc = wysokosc;
		
	}
	
	public void show()
	{
		double polew = Math.pow(promien, 2)*Math.PI;
		System.out.println(" Pole powierzchni podstawy walca = " + polew);
		System.out.println(" Objetosc walca = " + polew*wysokosc);
	}
}
