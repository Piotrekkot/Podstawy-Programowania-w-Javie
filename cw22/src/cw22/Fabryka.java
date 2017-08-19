package cw22;



public class Fabryka {
	
	public static Cukierek make(int jaki){
		switch(jaki){
		case 1: Cukierek Jagoda = new Cukierek("Jagoda",4.5);
		return Jagoda;
		case 2: Cukierek Pomarancza = new Cukierek("Pomarancza",5.0);
		return Pomarancza;
		case 3: Cukierek Jablko = new Cukierek("Jablko",5.5);
		return Jablko;
		case 4: Cukierek Arbuz = new Cukierek("Arbuz",3.0);
		return Arbuz;
		}
		return null;
		
		
	}
}
