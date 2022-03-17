package ch01_thread;

import java.awt.Toolkit;

//1.Runnable �������̽��� Ŭ���� ����
//Thread Ŭ������ �ƴϰ�
//run()�޼ҵ带 ���� �� �� �ִ� ����� ���� Ŭ����
public class BeepTask implements Runnable {
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
