package exception.ex;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 문자열을 입력하세요: ");
		String a;
		try {
			a = scanner.nextLine();
			System.out.println("문자열의 길이는 " + a.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("문자열이 없습니다.");
		}

	}

}
