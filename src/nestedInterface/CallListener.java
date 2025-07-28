package nestedInterface;

// 중첩 인터페이스
public class CallListener implements Button.OnClickListner {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
