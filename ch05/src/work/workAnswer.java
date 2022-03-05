package work;

import java.util.Scanner;

/*과제 제출기한 10/4(월) 23:59 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 */

public class workAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
//		final double ST1 = 1.10, ST2 = 1.07;
//		final int ST3 = 128, ST4 = 100;
		
		while(run) {
			System.out.println("당신의 체지방량을 계산합니다.");
			System.out.print("성별을 입력하세요(남자/여자): ");
			String gender = scanner.next();
			System.out.print("나이를 입력하세요(10~39세): ");
			int age = scanner.nextInt();
			System.out.print("키를 입력하세요(cm): ");
			double height = scanner.nextDouble();
			System.out.print("몸무게를 입력하세요(kg) ");
			double weight = scanner.nextDouble();
			
//			//제지방량
//			double leanBodyMass = 0.0;
//			switch (gender) {
//			case "남자":
//				leanBodyMass = (ST1 * weight) - (ST3 * ((weight * weight) / (double) (height * height)));
//				break;
//			case "여자":
//				leanBodyMass = (ST2 * weight) - (ST3 * ((weight * weight) / (double) (height * height)));
//				break;
//				
//			//체지방량(=체중-제지방량)
//			double bodyFatMass = 0.0;
//			bodyFatMass = weight - leanBodyMass;
//			
//			//체지방률(=체지방량*100/체중)
//			double bodyFatRatio = (bodyFatMass * 100) / (double) weight;
//			}
//			System.out.printf("제지방량:%.2f\n", leanBodyMass);
			
			if(gender.equals("남자")) {
				double bmiMan = (weight - (1.10 * weight - 128 * ((weight * weight) / (double)(height * height)))) * 100 / weight; //남자 bmi
				if(bmiMan < 12) {
					System.out.println("야윈 몸");
				}else if(bmiMan >= 12 || bmiMan <= 17) {
					System.out.println("표준");
				}else if(bmiMan >= 18 || bmiMan <= 22) {
					System.out.println("과체중");
				}else if(bmiMan >= 23 || bmiMan <= 27) {
					System.out.println("비만");
				}else if(bmiMan >= 28) {
					System.out.println("고도비만");
				}
				System.out.println("당신의 체지방률: "+ bmiMan);
			}else if(gender.equals("여자")) {
				double bmiWoman = (weight - (1.07 * weight - 128 * ((weight * weight) / (double)(height * height)))) * 100 / weight; //여자 bmi
				if(bmiWoman < 22) {
					System.out.println("야윈 몸");
				}else if(bmiWoman >= 22 || bmiWoman <= 27) {
					System.out.println("표준");
				}else if(bmiWoman >= 28 || bmiWoman <= 35) {
					System.out.println("과체중");
				}else if(bmiWoman >= 36 || bmiWoman <= 40) {
					System.out.println("비만");
				}else if(bmiWoman >= 41) {
					System.out.println("고도비만");
				}
				System.out.println("당신의 체지방률: " + bmiWoman);
			
			}
			
			System.out.println("계속할까요?(yes/no)");
			String yesNo = scanner.next();
			if (yesNo.equals("no"))
				run = !run;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
