package ch01;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		
		try {
			Animal animal = new Cat();
			Cat cat = null;
			//System.out.println(cat.toString());
			Dog dog = (Dog)animal; //���� �߻�
			//���� �߻��� �Ʒ� ��ɹ� ���� ����
			System.out.println("����ȯ ó��");
		} catch (ClassCastException e) {
			System.out.println("����̴� ���� �� �� �����ϴ�.");
		}finally {
			//��ɹ� ����
			System.out.println("���α׷� ����");
		}

	}

}
