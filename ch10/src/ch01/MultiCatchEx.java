package ch01;

public class MultiCatchEx {
	public static void main(String[] args) {
		String[] arr = {"hello", "hi", "bye"};
		//�߻��ϴ� ���ܰ�ü ���� catch�� �߰�
		try {
			int a = Integer.parseInt("��"); //������ ����
			System.out.println(arr[3]); //�ε��� ����
		} catch (NumberFormatException e) {
			System.out.println("������ ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ����");
		
	}

}
}