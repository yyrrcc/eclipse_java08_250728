package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest2 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// 에러의 내용을 알려주는 코드 (관례)
			e.printStackTrace();
		}

		System.out.println("next");

	}

}
