package exception.ex;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 문자열을 입력하세요: ");
		String a = scanner.nextLine();

		if (a.length() == 0) {
			throw new IllegalArgumentException("문자열이 없습니다.");
		} else {
			System.out.println("문자열의 길이는 " + a.length());
		}
		scanner.close();
	}
}

// scanner로 입력 받을 때는 빈 문자열을 잡아내지 못한다. 따라서 예외가 발생하지 않음.