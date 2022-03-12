package ch02_System_Class;

import java.util.Scanner;

public class ReflectExample2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행할 객체를 입력하세요>");
		String className = "ch02_System_Class."+scanner.next();
		//클래스 정보 로딩
		Class clazz = Class.forName(className);
		System.out.println(clazz.getName());
		//리플렉션
		Action action = (Action)clazz.newInstance();
		action.execute();
		}

	}


