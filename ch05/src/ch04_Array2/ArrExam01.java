package ch04_Array2;

import java.util.Scanner;

public class ArrExam01 {
	public static void main(String[] args) {
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92}; 
		//int[] scores=new int[];
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		//1.성적입력 | 2.통계(합/평균) 출력 | 3.성적순 출력하기 | 4.종료
		//ch04 - 7번 참조.
		
		//int[] scores = {76,45,34,89,100,50,90,92};
		Scanner scanner = new Scanner(System.in);
		int [] scores = new int[8];
		boolean run = true;
		int sum = 0;
		double avg = 0;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.성적입력 | 2.통계(합/평균)출력 | 3.성적순 출력하기 | 4. 종료");
			System.out.println("----------");
			
			int menu = scanner.nextInt();
			
			if (menu == 1) {
	            for (int i = 0; i < scores.length; i++) {
	               System.out.print("성적입력[" + i + "]");
	               scores[i] = scanner.nextInt();
	               }
				}else if (menu == 2) {
					for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					}
					System.out.print("합계:"+sum+"\t");
					System.out.println("평균:"+sum / (double)scores.length);
				}else if (menu == 3) {
					int temp = 0;
					for (int i = 0; i < scores.length; i++) {
						for (int j = i + 1; j < scores.length; j++) {
							if (scores[i] < scores[j]) {
								temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							}
						}
					}
					System.out.println("성적순:");
					for (int i : scores) {
						System.out.print(i + " ");
					}
					System.out.println();
				}else if(menu == 4) {
					run = false;
				}
		}
		System.out.println("종료");
	}

}
