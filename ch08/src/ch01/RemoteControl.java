package ch01;

//�������̽� ����(����Ÿ��)
//�������̽��� �����ɹ� - ���, �߻�޼ҵ�
public interface RemoteControl {
	//���
	//public static final int MAX_VOLUME = 10;
	//public static final int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10; //����� ����� ���ÿ� �ʱ�ȭ ó��
	public int MIN_VOLUME = 0;
	//�޼ҵ�-�߻�޼ҵ�
	void method(); //�����
	

}
//�������̽��κ��� ��üŬ���� ����
class TVRemoteControl implements RemoteControl{

	@Override
	public void method() {
		System.out.println("��ü Ŭ���� �޼ҵ�");
	}
	
}

class A {
	//����
	public int MAX_VOLUME; //�ڵ����� 0���� �ʱ�ȭ
	//���
	public int MIN_VOLUME = 0;
	//�޼ҵ�-�߻�޼ҵ�
	void method() {MAX_VOLUME = 10;} //�����
	

}