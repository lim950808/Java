package ch01.copy;

public class OutterMain {
	public static void main(String[] args) {
		//클래스.static맴버로 접근
		A.C c = new A.C();
		//C의 인스턴스 맴버
		c.field1=3;
		//C의 static 맴버
		c.field2=3;
		
		//C의 static 맴버
		//바깥클래스.안쪽클래스.맴버
		A.C.field2=3;
		A.C.method2();

	}

}
