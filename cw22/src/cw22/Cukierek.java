package cw22;

public class Cukierek {
	
	String smak;
	double waga;
	
	
	Cukierek(String smak, double waga){
		this.smak=smak;
		this.waga=waga;
	}
	
	public String toString(){
		return smak + " " + waga;
	}

}
