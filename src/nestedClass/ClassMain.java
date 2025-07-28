package nestedClass;

public class ClassMain {
	public static void main(String[] args) {
		// 기본 classA 인스턴스 생성
		ClassA classA = new ClassA();

		// 중첩 클래스로 들어가 있는 ClassB의 객체를 만들 때는 classA 인스턴스가 존재 해야한다.
		ClassA.ClassB classB = classA.new ClassB();
		classB.classB = 10;
		classB.methodB();

		// 정적 중첩 클래스
		ClassA.ClassC classC = new ClassA.ClassC();
		classC.classC = 20;
		classC.methodC();
		ClassA.ClassC.classCstatic = 30;
		ClassA.ClassC.methodCstatic();

		classA.methodLocal();
	}

}
