package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���:");
		//��ĳ��Ÿ�� ���� ���� �� ��ü ���� 
		//println() => print and new Line
		//print() => ���� �ٿ��� ��� �̾ ���
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� "+name+", "); //String next()
		
		String city = scanner.next();
		System.out.print("���ô� "+city+", "); //String next()
		
		int age = scanner.nextInt();
		System.out.print("���̴� "+age+"��, "); //int nextInt()
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� "+weight+"kg, "); //double nextDouble()
		
		boolean single = scanner.nextBoolean();
		System.out.println("���ſ��δ� "+(single?"�̱�":"����")+"�Դϴ�."); //boolean nextBoolean()
		
		//�ڿ�����
		scanner.close();
		

	}

}
