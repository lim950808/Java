package work;

import java.util.Scanner;

/*���� ������� 10/4(��) 23:59 ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ�
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 */

public class workAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
//		final double ST1 = 1.10, ST2 = 1.07;
//		final int ST3 = 128, ST4 = 100;
		
		while(run) {
			System.out.println("����� ü���淮�� ����մϴ�.");
			System.out.print("������ �Է��ϼ���(����/����): ");
			String gender = scanner.next();
			System.out.print("���̸� �Է��ϼ���(10~39��): ");
			int age = scanner.nextInt();
			System.out.print("Ű�� �Է��ϼ���(cm): ");
			double height = scanner.nextDouble();
			System.out.print("�����Ը� �Է��ϼ���(kg) ");
			double weight = scanner.nextDouble();
			
//			//�����淮
//			double leanBodyMass = 0.0;
//			switch (gender) {
//			case "����":
//				leanBodyMass = (ST1 * weight) - (ST3 * ((weight * weight) / (double) (height * height)));
//				break;
//			case "����":
//				leanBodyMass = (ST2 * weight) - (ST3 * ((weight * weight) / (double) (height * height)));
//				break;
//				
//			//ü���淮(=ü��-�����淮)
//			double bodyFatMass = 0.0;
//			bodyFatMass = weight - leanBodyMass;
//			
//			//ü�����(=ü���淮*100/ü��)
//			double bodyFatRatio = (bodyFatMass * 100) / (double) weight;
//			}
//			System.out.printf("�����淮:%.2f\n", leanBodyMass);
			
			if(gender.equals("����")) {
				double bmiMan = (weight - (1.10 * weight - 128 * ((weight * weight) / (double)(height * height)))) * 100 / weight; //���� bmi
				if(bmiMan < 12) {
					System.out.println("���� ��");
				}else if(bmiMan >= 12 || bmiMan <= 17) {
					System.out.println("ǥ��");
				}else if(bmiMan >= 18 || bmiMan <= 22) {
					System.out.println("��ü��");
				}else if(bmiMan >= 23 || bmiMan <= 27) {
					System.out.println("��");
				}else if(bmiMan >= 28) {
					System.out.println("����");
				}
				System.out.println("����� ü�����: "+ bmiMan);
			}else if(gender.equals("����")) {
				double bmiWoman = (weight - (1.07 * weight - 128 * ((weight * weight) / (double)(height * height)))) * 100 / weight; //���� bmi
				if(bmiWoman < 22) {
					System.out.println("���� ��");
				}else if(bmiWoman >= 22 || bmiWoman <= 27) {
					System.out.println("ǥ��");
				}else if(bmiWoman >= 28 || bmiWoman <= 35) {
					System.out.println("��ü��");
				}else if(bmiWoman >= 36 || bmiWoman <= 40) {
					System.out.println("��");
				}else if(bmiWoman >= 41) {
					System.out.println("����");
				}
				System.out.println("����� ü�����: " + bmiWoman);
			
			}
			
			System.out.println("����ұ��?(yes/no)");
			String yesNo = scanner.next();
			if (yesNo.equals("no"))
				run = !run;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
