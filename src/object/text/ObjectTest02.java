package object.text;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// ==
		System.out.println(p1==p2);
		System.out.println(p2==p3);

		System.out.println("----------");
		
		// equals
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		System.out.println("----------");

		// String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " : " + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2) );
		
		System.out.println("----------");

		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : " + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + " : " + System.identityHashCode(s4) );
		
	}

}






