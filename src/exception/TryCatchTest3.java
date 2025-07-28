package exception;

public class TryCatchTest3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("arr[3]은 없는 인덱스 입니다");
		} finally {
			System.out.println("에러의 유무에 상관없이 무조건 실행");
		}

		System.out.println("try-catch-finally 구문");
	}

}
