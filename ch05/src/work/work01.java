package work;

import java.util.Scanner;

/*���� ������� 10/4(��) 23:59 ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ�
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 */
public class work01 {
	public static void main(String[] args) {
//		string gender;
//		int age;
//		double height, weight;
		
//		final double ST1 = 1.10;
//		final double ST2 = 1.07;
//		final double ST3 = 128;
		
		
//		//�����淮(����ǥ��) = (1.10*ü��)-(128*(ü������/Ű����));
//		double result1 = ST1 * weight - ST3 * ((weight * weight) / (double)(height * height));
//		//�����淮(����ǥ��) = (1.07*ü��)-(128*(ü������/Ű����));
//		double result2 = ST2 * weight - ST3 * ((weight * weight) / (double)(height * height));
//		
//		//ü���淮(����ǥ��) = ü��-�����淮;
//		double result3 = weight - result1;
//		//ü���淮(����ǥ��) = ü��-�����淮;
//		double result4 = weight - result2;
//		
//		final double ST4 = 100;
//		//ü�����(����ǥ��) = ü���淮*100/ü��;
//		double result5 = result3 * ST4 / weight;
//		//ü�����(����ǥ��) = ü���淮*100/ü��;
//		double result6 = result4 * ST4 / weight;
		
//		String gender = null;
//		int age;
//		double height, weight;
		
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("����� BMI�� ����մϴ�.");
			System.out.println("������ �Է��ϼ���: ");
				String gender = scanner.nextLine();
			System.out.println("���̸� �Է��ϼ���(10~39��): ");
				int age = scanner.nextInt();
			System.out.println("Ű�� �Է��ϼ���: ");
				double height = scanner.nextDouble();
			System.out.println("ü���� �Է��ϼ���: ");
				double weight = scanner.nextDouble();
			
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
		}catch(Exception e) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}

	}
}

			

//		
//		
//		
//		
//	}
//
//}
