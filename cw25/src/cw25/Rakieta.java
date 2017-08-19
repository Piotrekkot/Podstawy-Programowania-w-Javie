package cw25;


public class Rakieta {

	double predkosc;
	double OdlegloscOdZiemi;

	Rakieta(double predkosc, double OdlegloscOdZiemi) {
		this.OdlegloscOdZiemi = OdlegloscOdZiemi;
		this.predkosc = predkosc;
	}

	public boolean czyWyladuje() throws RakietaException{
		try{
		if (OdlegloscOdZiemi < 2 && predkosc > 20) {
			throw new RakietaException();
		}
		}catch(RakietaException a){
			System.out.println(a);
		}
		return false;
		
		
		
	}

}
