package cw19;

public class Wyraz {
	String a;
	int b;

	public Wyraz(){
		a = "";
		b = 0;
	}
	public Wyraz dodajZnak(char znak){
		
		a += znak;
		b++;
		return this;
	}
	public String toString()
	{
		return a;
	}
	public int length(){
		
		return b;
	}

}
