package ch02;

public class A {
	 void method() {
	        try {
	            System.out.println("A의 메소드");
	            //예외 객체 강제 생성하여 던지문 실행문
	            throw new Exception();
	        } catch (Exception e) {
	            System.out.println("A의 예외발생");
	        }

	    }
	}
