package exception;

public class TryCatchTest4 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;

			int[] arr = { 10, 20, 30 };
			System.out.println(arr[4]);

		} catch (Exception e) {
			System.out.println("여러 오류를 잡기 위해서는 Exception을 사용한다.");
			e.printStackTrace();

		}

		System.out.println("Next");

	}

}
