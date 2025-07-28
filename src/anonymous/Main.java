package anonymous;

public class Main {

	public static void operate(Calculator cal) {
		System.out.println("연산결과 :" + cal.add(10, 20));
	}

	public static void main(String[] args) {
		// 인터페이스를 구현한 익명 객체 예제
		// 인터페이스는 인스턴스 생성 불가이지만, 임시로 내부에서 메서드 오버라이딩을 하고 만들 수 있음
		Greeting greeting = new Greeting() {

			@Override
			public void sayHi() {
				System.out.println("Hello!");
			}
		};

		greeting.sayHi();

		System.out.println("-------------------------------");

		// 추상 클래스를 상속한 익명 객체
		// 추상 클래스도 인스턴스 생성 불가이지만, 임시로 내부에서 메서드 오버라이딩을 하고 만들 수 있음
		Animal animal = new Animal() {

			@Override
			void sound() {
				System.out.println("멍멍");
			}

			@Override
			void run() {
				System.out.println("동물이 달립니다.");
			}
		};

		animal.sound();
		animal.run();

		System.out.println("-------------------------------");

		// 메서드의 매개변수로 익명 객체 전달
		// operate 메서드 매개변수가 들어가야 하는데 인터페이스로 생성된 Calculator는 인스턴스 생성 불가, 하지만 임시적으로 ~
		operate(new Calculator() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		});

	}

}
