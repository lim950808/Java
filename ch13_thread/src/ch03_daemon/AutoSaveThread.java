package ch03_daemon;

//�Ϲݽ�����
public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); //1�� ���
			} catch (Exception e) {
				break;
			}
			save(); //1�� �������� �ڷ�����
		}
	}

}
