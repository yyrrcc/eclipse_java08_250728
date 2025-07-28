package exception.ex;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int b = scanner.nextInt();
		int result;
		try {
			result = a / b;
			System.out.println("두 수로 나눈 값은 " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}
}
