package exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

	public static void main(String[] args) {
		// 1. NullPointerException : 값이 비어있을 때
		String data = null;
		// System.out.println(data.length());
		// System.out.println(data.toString());

		// 2. NumberFormatException : 숫자로 바꿀 수 없는 문자열을 숫자로 바꾸려고 할 때 발생
		String price = "1000원";
		// int priceInt = Integer.parseInt(price);

		// 3. ArrayIndexOutOfBoundsException : 배열의 크기를 벗어났을 때
		int[] arr = { 10, 20, 30 };
		// System.out.println(arr[3]);

		// 4. IndexOutOfBoundsException : 존재하지 않는 인덱스의 값을 가져올 때
		List<String> list = new ArrayList<String>();
		list.add("Korea");
		list.add("Canada");
		// System.out.println(list.get(2));

		// 5. ClassCastException : 잘못된 형변환 (다운 캐스팅할 때 주로 발생)
		Object object = new String("Hello");
		Integer integer = (Integer) object;

		// EtcException
		// 6. ArithmeticException : 모든 수는 0으로 나눌 수 없다
		// int a = 1 / 0;

		// EtcException
		// 7. FileNotFoundException : 외부 파일을 불러오는데 존재하지 않을 경우, 반드시 예외처리 구문으로만 구현 가능
		// FileReader reader = new FileReader("abc.txt");

	}

}
