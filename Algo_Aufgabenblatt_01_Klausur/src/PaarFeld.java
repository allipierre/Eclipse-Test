public class PaarFeld<E, Z> implements Feld<Paar<E, Z>> {
	Feld<E> e;
	Feld<Z> z;

	public PaarFeld(Feld<E> e, Feld<Z> z) {
		this.e = e;
		this.z = z;

	}

	public int size() {
		return this.e.size() < this.z.size() ? this.e.size() : this.z.size();
	}

	public Paar<E, Z> get(int i) {
		return new Paar<E, Z>(e.get(i), z.get(i));
	}

	public Paar<E, Z> set(int i, Paar<E, Z> e) {
		return new Paar<E, Z>(this.e.set(i, e.erstes()), this.z.set(i, e.zweites()));
	}

}
