package cw23;

public class Magazyn {
	int size = 0;

	//Kontener[] stos = new Kontener[5];

	/*public void przyjmijKontener(Kontener kontener) {

		for (int i = 0; i < 5; i++) {
			if (stos[i] == null) {
				stos[i] = kontener;
				System.out.println("Przyjmuje kontener");
				return;
			}
			System.out.println("Brak miejsca na nowy kontener");
		}
	}

	public Kontener wydajKontener() {

		for (int i = 4; i >= 0; i--) {
			if (stos[i] != null) {
				Kontener tmp = stos[i];
				stos[i] = null;
				return tmp;
			}
		}
		System.out.print("Wydano kontener");
		return null;
	}*/
	
	public void przyjmijKontener(Kontener kont) throws MagazynPelnyException{
        try{
			if(size>=6){
                throw new MagazynPelnyException();
            }
            else{
                przyjmijKontener(kont);
                size++;
            }
        } catch (MagazynPelnyException a){
            System.out.println(a);
        }
    }


public void wydajKontener(Kontener kont) throws MagazynPustyException{
    try{
		if(size==0){
            throw new MagazynPustyException();
        }
        }catch (MagazynPustyException a){
        System.out.println(a);
    }
}
}
