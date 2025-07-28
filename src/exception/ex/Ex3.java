package exception.ex;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int a;
		try {
			a = scanner.nextInt();
			if (a % 2 == 0) {
				System.out.println("짝수!");
			} else {
				System.out.println("홀수!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("정수가 아닙니다!");
		}

	}

}
