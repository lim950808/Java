package ch04_Array2;

import java.util.Scanner;

public class ArrExam01_Answer {

	public static void main(String[] args) {
		//����ǥ ���α׷�
		//��ĳ�ʷ� ���� �Է¹ޱ� int[] score = {76,45,34,89,100,50,90,92}; 
		//int[] scores=new int[];
		//�Է��� ������ �հ�, ���, ������ ����ϱ�
		//for���� ���� for������ ����ϱ�
		//1.�����Է� | 2.���(��/���) ��� | 3.������ ����ϱ� | 4.����
		//ch04 - 7�� ����.
		
		//Ű����κ��� ������ �Է¹ޱ� ���� scanner��ü ����
		Scanner scanner = new Scanner(System.in);
		//�迭����
		int [] scores = new int[8];
		//�ݺ����� ���������� ���� ����
		boolean run = true;
		//�հ躯��
		int sum = 0;
		while(run) {
			System.out.println("----------");
			System.out.println("1.�����Է� | 2.���(��/���)��� | 3.������ ����ϱ� | 4. ����");
			System.out.println("----------");
			
		int menu = scanner.nextInt();
		switch(menu) {
		case 1:
			System.out.println("�����Է�>");
			for(int i=0;i<scores.length;i++) {
				scores[i]=scanner.nextInt();
			}
			break;
		case 2:
			System.out.println("������>");
			for(int i=0;i<scores.length;i++) {
				sum+=scores[i];
			}
			System.out.println("�����հ�:"+sum);
			System.out.println("�������:"+(sum/(double)scores.length));
			break;
		case 3:
			System.out.println("������ ���>");
			int temp = 0; //���� �ٲٱ�� �ӽ� ���庯��
			for(int i=0;i<scores.length;i++) {
				for(int j=i+1;j<scores.length;j++) {
					if(scores[i] > scores[j]) {//���������� ū ���� �ڷ� �����ϴµ� ū ���� �տ� ������ �ڷ� �̵���Ŵ.
						temp = scores[i]; //�ӽ�����
						scores[i]=scores[j]; //���� ���� ������ �̵�
						scores[j]=temp; //���� ���� �ڷ� �̵�.
					}
				}//���� for��
			}//�ٱ��� for��
			//���̰� 8�� �迭�� index�� ��� 0,1,2,3,4,5,6,7 <- 7=8-1 <- scores.length-1
			//for(int i=0;i<score.length;i++{ }
			for(int i=(scores.length-1);i>=0;i--) {
				System.out.print(scores[i]+" ");
			}
			System.out.println();
			break;
		case 4: run = !run;
		}
		}//�ݺ���
		System.out.println("����");

	}

}
