package exception;

public class MyClassTest {

	public static void main(String[] args) {

		try {
			MyClass myClass = new MyClass();
			myClass.dangerMethod();
		} catch (MyException e) {

			e.printStackTrace();
		}
	}
}
