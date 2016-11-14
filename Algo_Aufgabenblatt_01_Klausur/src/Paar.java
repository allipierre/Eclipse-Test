public class Paar<E, Z> {
	E e;
	Z z;

	public Paar(E e, Z z) {
		this.e = e;
		this.z = z;

	}

	public E erstes() {
		return this.e;
	}

	public Z zweites() {
		return this.z;
	}

	public String toString() {
		System.out.println("aa");
		return "("+this.erstes() + "," + this.zweites()+")";
		
	}

}
