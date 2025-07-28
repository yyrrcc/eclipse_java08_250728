package nestedClass;

public class ClassA {

	public ClassA() {
		System.out.println("A 생성자");
	}

	// 중첩 클래스 - 인스턴스 내부 클래스
	public class ClassB {
		int classB;

		public ClassB() {
			System.out.println("B 생성자");
		}

		public void methodB() {
			System.out.println("ClassB 클래스의 MethodB 입니다.");
		}

	}

	// 중첩 클래스 - 정적 중첩 클래스
	public static class ClassC {
		int classC;
		static int classCstatic;

		public ClassC() {
			System.out.println("C 생성자");
		}

		public void methodC() {
		}

		public static void methodCstatic() {
		}

	}

	// 중첩 클래스 - 로컬 클래스
	public void methodLocal() {
		class ClassD {

			public ClassD() {
				System.out.println("D 객체가 생성됨");
			}

			int intD;

			void methodD1() {

			}
		}
		ClassD classD = new ClassD();
		classD.intD = 80;
		classD.methodD1();

	}
}
