package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요:");
		//스캐너타입 변수 선언 및 객체 생성 
		//println() => print and new Line
		//print() => 현재 줄에서 계속 이어서 출력
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 "+name+", "); //String next()
		
		String city = scanner.next();
		System.out.print("도시는 "+city+", "); //String next()
		
		int age = scanner.nextInt();
		System.out.print("나이는 "+age+"살, "); //int nextInt()
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 "+weight+"kg, "); //double nextDouble()
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 "+(single?"싱글":"유부")+"입니다."); //boolean nextBoolean()
		
		//자원해제
		scanner.close();
		

	}

}
