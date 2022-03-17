package ch01;

public class MultiCatchEx {
	public static void main(String[] args) {
		String[] arr = {"hello", "hi", "bye"};
		//발생하는 예외객체 별로 catch절 추가
		try {
			int a = Integer.parseInt("십"); //숫자형 오류
			System.out.println(arr[3]); //인덱스 오류
		} catch (NumberFormatException e) {
			System.out.println("숫자형 예외");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		
	}

}
}