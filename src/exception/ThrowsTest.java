package exception;

public class ThrowsTest {
	// throws: 메서드 선언부에서 사용되며, 해당 메서드가 처리하지 않은 예외를 호출자에게 전달함을 나타냄
	// throws Exception : 메서드를 호출하는 쪽에서 예외처리를 하라고 강제하는 구문
	public void zeroDivide() throws Exception {
		System.out.println(10 / 0);

	}
}
