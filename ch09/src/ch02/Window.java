package ch02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnclickListener listener = new Button.OnclickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnListener(listener);
		//button2.setOnListener(listener);
	}

}
