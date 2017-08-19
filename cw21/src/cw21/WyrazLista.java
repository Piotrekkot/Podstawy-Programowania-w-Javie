package cw21;

public class WyrazLista {

	Wyraz first;

	public void dodajWyraz(Wyraz wyraz) {
		if (first == null)
			first = wyraz;
		else {
			Wyraz current = first;
			while (current.next != null)
				current = current.next;
			current.next = wyraz;

		}

	}

	public void show() {
		first.show();
	}

}
