package cw12;

public class Zad2 {

	public static void main(String[] args) {
		char [] tab = {'A','l','a','m','a','k','o','t','a'};
		int licznik = 0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]=='a'){
				licznik++;
			}
			if(tab[i]=='A'){
				licznik++;
			}
		}
System.out.println("Litera 'A' wystapila " + licznik + " razy");
	}

}
