package ch01.copy.copy;

public class OutterMain {
	public static void main(String[] args) {
		//Ŭ����.static�ɹ��� ����
		A.C c = new A.C();
		//C�� �ν��Ͻ� �ɹ�
		c.field1=3;
		//C�� static �ɹ�
		A.C.field2=3;

	}

}
