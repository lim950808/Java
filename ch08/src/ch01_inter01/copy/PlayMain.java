package ch01_inter01.copy;

public class PlayMain {
	//�ʵ�
	//����ϴ� ��ü�� ���� ���ٽ� - ������
	//����ϴ� ��ü�� ����Ǿ ���� ��Ĵ�� ���
	RemoteControl rc = new Audio();
	
	public static void main(String[] args) {
		PlayMain p = new PlayMain();
		//����ϴ� ��ü ���濡 ���� �ҽ��ڵ� ����
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
		
	

	}

}
