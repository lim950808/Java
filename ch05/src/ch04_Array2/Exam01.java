package ch04_Array2;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id="hong", pwd="1234"
		//id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
		//�ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		//5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� �����մϴ�" ��� �� ����
		
		Scanner scanner = new Scanner(System.in);
		
		int cnt = 0; //�ʱ�ȭ
		while(true) {
			String id; //����Ÿ�� ����
			String pwd; //����Ÿ�� ����
			if(cnt==5) {//�⺻����Ÿ Ÿ���� �� ��
				System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.println("���̵�>");
			id=scanner.next(); //StringŸ������ ����
			System.out.println("�н�����>");
			pwd=scanner.next(); //StringŸ������ ����
			
			if("kang".equals(id) && "1234".equals(pwd)) {//������ü�� �񱳿� ��������
				System.out.println("�α��� ����"); 
				break;
			}
			
			//���н�
			System.out.println(++cnt+"ȸ �����Ͽ����ϴ�.");
			
		}
		System.out.println("���α׷� ����");

	}

}
