package exception;

public class ThrowsMain {

	public static void main(String[] args) throws Exception {
		ThrowsTest throwsSample = new ThrowsTest();

		throwsSample.zeroDivide();

		System.out.println("=====================");

	}

}
