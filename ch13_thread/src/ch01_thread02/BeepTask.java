package ch01_thread02;

import java.awt.Toolkit;

//1.ThreadŬ������ ���� ��� �޾�
public class BeepTask extends Thread {
	@Override
	public void run() {
		//beep�� ����� ��ü ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); //0.5�ʰ� ����
			}catch(Exception e) {}
		}
		
	}

}
