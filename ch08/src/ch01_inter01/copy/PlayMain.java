package ch01_inter01.copy;

public class PlayMain {
	//필드
	//사용하는 객체에 직접 접근시 - 종속적
	//사용하는 객체가 변경되어도 기존 방식대로 사용
	RemoteControl rc = new Audio();
	
	public static void main(String[] args) {
		PlayMain p = new PlayMain();
		//사용하는 객체 변경에 따라 소스코드 변경
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
		
	

	}

}
