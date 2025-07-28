package nestedInterface;

public class BtnMain {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setListner(new CallListener());
		btn.touch();
	}

}
