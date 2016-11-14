public class TestPaar {

	public static void main(String[] args) {
		String e="a";
		String z="b";
		Integer a=new Integer(1);
		Integer b=new Integer(1);
		Paar<String, String> p= new Paar<String, String> (e, z);
		System.out.println(p.toString());
		
		Paar<Integer, Integer> p0= new Paar<Integer, Integer> (a, b);
		System.out.println(p0.toString());

	}

}
