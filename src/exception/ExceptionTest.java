package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			System.out.println("Somde Codes..");
			
			int k = 10000000 / a;
			System.out.println("More Codes......");
			System.out.println("More Codes......");
		} catch (ArithmeticException e) {
			// 1. 로그 남기기 
			System.out.println("error : " + e);
			
			// 2. 사과
			System.out.println("죄송합니다..");
			
			// 3. 정상 종료
			return;
			
			// 4. 1~3이 안되면
			// e.printStackTrace();
		} finally {
			System.out.println("자원정리");
		}
	}

}
