package object.text;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); // reflection 객체가 어떤 클래스로 생성됐는지
		System.out.println(p.hashCode()); // reference value는 아님! 
		
		System.out.println(p);
//			== System.out.println(p.toString());
	}

}
