package cw21;

public class Wyraz {
	String wyraz;
	Wyraz next;

	public Wyraz(String wyraz) {
		this.wyraz = wyraz;
	}

	public void setNastepnyWyraz(Wyraz next) {
		this.next = next;
	}

	public String toString() {
		return wyraz;
	}

	public void show() {
		boolean hasNext = (next == null ? false : true);
		System.out.print(this + (hasNext ? " -> " : " "));
		if (hasNext==true){
			next.show();
		}
	}

}
