package ch01.copy;

public class OutterMain {
	public static void main(String[] args) {
		//Ŭ����.static�ɹ��� ����
		A.C c = new A.C();
		//C�� �ν��Ͻ� �ɹ�
		c.field1=3;
		//C�� static �ɹ�
		c.field2=3;
		
		//C�� static �ɹ�
		//�ٱ�Ŭ����.����Ŭ����.�ɹ�
		A.C.field2=3;
		A.C.method2();

	}

}
