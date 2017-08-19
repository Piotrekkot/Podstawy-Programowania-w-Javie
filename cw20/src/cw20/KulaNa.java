package cw20;

public class KulaNa {

	double r;
	
	
	public KulaNa(kwadrat k){
		r=((k.bok)*Math.sqrt(3))/2;
	}
	
	public KulaNa(Walec w){
		r=Math.sqrt(Math.pow(w.wysokosc, 2)+(Math.pow(w.promien, 2)*2)/2);
		
	}

}
