package exception;

public class ThrowTest {

	public static void main(String[] args) {
		int age = -1;
		if (age < 0) {
			// throw: 메서드 내에서 예외를 발생시키는 데 사용
			throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
		}

		System.out.println("----");

	}

}
