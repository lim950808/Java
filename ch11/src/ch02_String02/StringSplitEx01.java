package ch02_String02;

public class StringSplitEx01 {
	public static void main(String[] args) {
		String str = "홍길동&이수홍,박연수,김자바-최명호";
		//Split() 구분자
		String[] names = str.split("&|,|-");
		
		for(String name:names)
			System.out.println(name+" ");

	}

}
