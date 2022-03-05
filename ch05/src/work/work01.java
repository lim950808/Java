package work;

import java.util.Scanner;

/*과제 제출기한 10/4(월) 23:59 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 */
public class work01 {
	public static void main(String[] args) {
//		string gender;
//		int age;
//		double height, weight;
		
//		final double ST1 = 1.10;
//		final double ST2 = 1.07;
//		final double ST3 = 128;
		
		
//		//제지방량(남성표준) = (1.10*체중)-(128*(체중제곱/키제곱));
//		double result1 = ST1 * weight - ST3 * ((weight * weight) / (double)(height * height));
//		//제지방량(여성표준) = (1.07*체중)-(128*(체중제곱/키제곱));
//		double result2 = ST2 * weight - ST3 * ((weight * weight) / (double)(height * height));
//		
//		//체지방량(남성표준) = 체중-제지방량;
//		double result3 = weight - result1;
//		//체지방량(여성표준) = 체중-제지방량;
//		double result4 = weight - result2;
//		
//		final double ST4 = 100;
//		//체지방률(남성표준) = 체지방량*100/체중;
//		double result5 = result3 * ST4 / weight;
//		//체지방률(여성표준) = 체지방량*100/체중;
//		double result6 = result4 * ST4 / weight;
		
//		String gender = null;
//		int age;
//		double height, weight;
		
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("당신의 BMI를 계산합니다.");
			System.out.println("성별을 입력하세요: ");
				String gender = scanner.nextLine();
			System.out.println("나이를 입력하세요(10~39세): ");
				int age = scanner.nextInt();
			System.out.println("키를 입력하세요: ");
				double height = scanner.nextDouble();
			System.out.println("체중을 입력하세요: ");
				double weight = scanner.nextDouble();
			
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
		}catch(Exception e) {
			System.out.println("다시 입력하세요.");
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
