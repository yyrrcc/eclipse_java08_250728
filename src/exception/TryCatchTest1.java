package exception;

public class TryCatchTest1 {
	public static void main(String[] args) {
		int num = 0;
		try {
			int result = 100 / num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다. num값을 다시 확인하세요.");
		}

		System.out.println("next");

	}

}
