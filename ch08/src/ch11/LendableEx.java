package ch11;

public class LendableEx {
	public static void main(String[] args) {
		//도서객체 생성
		SeparateVolume sv = new SeparateVolume("1111","대지","펄벅");
		SeparateVolume sv2 = new SeparateVolume("2222","쉬운 JSP","홍길동");
		
		//대여
		printState(sv);
		sv.checkOut("수지", "2021/03/25");
		printState(sv);
		//반납
		sv.checkIn();
		
		printState(sv2);
		sv.checkOut("꺽정", "2021/08/15");
		printState(sv2);
		sv.checkIn();
		

	}
	
	static void printState(SeparateVolume sv) {
		if(sv.state == sv.BORROWED) {
			System.out.println("=== 대출 중인 책 ===");
			System.out.println("대출자: "+sv.name);
			System.out.println("대출일: "+sv.date);
		}else {
			System.out.println("=== 대출 가능 책 ===");
		}
	}

}
