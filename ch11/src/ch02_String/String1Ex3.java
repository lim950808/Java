package ch02_String;

public class String1Ex3 {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷��� �ڹ� ���α׷���";
		//���ڿ� �� old���� - new�������� ����
		String subject2 = subject.replace("�ڹ�","java"); //"java ���α׷��� java ���α׷���"
		System.out.println(subject2);
		
		//��ҹ���
		String org = "Java Programing";
		String lower = org.toLowerCase();
		String upper = org.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		
		//�ǹ̾��� ���� �ڸ���
		String tel1 = " 02"; //�տ� 1�ڸ� ����
		String tel2 = "123 "; //�ڿ� 1�ڸ� ����
		String tel3 = " 1234 "; //�յڷ� 1�ڸ��� ����
		System.out.println(tel3.length());
		
		//trim()
		String tel = tel1.trim()+"-"+tel2.trim()+"-"+tel3.trim();
		System.out.println(tel);
		
		//���ڿ� ��ȯ
		String str1 = String.valueOf(10);
		System.out.println(str1);
		String str2 = String.valueOf(10.1);
		System.out.println(str2);
		
	}

}
