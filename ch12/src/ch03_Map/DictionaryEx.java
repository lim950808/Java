package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//"apple" - "사과", "pear" - "배", "peach" - "복숭아",
	//"puppy" - "강아지", "cow" - "소", "zebra" - "얼룩말", "chicken" - "닭"
	//map에 저장 후
	//scanner로 영문을 입력받아서 해당하는 한글을 출력
	//map에 key가 없으면 다시 입력하도록
	//끝낼때는 "end"가 입력되면 종료;
	
	Map<String,String> dictionary = new HashMap<>();
	dictionary.put("apple", "사과");
	dictionary.put("pear", "배");
	dictionary.put("peach", "복숭아");
	dictionary.put("puppy", "강아지");
	dictionary.put("cow", "소");
	dictionary.put("zebra", "얼룩말");
	dictionary.put("chicken", "닭");
	
	while(true) {
		//조회할 단어
		System.out.println("조회할 영단어를 입력하세요>");
		String key = scanner.next();
		if(!key.equals("end")) {
			if(dictionary.containsKey(key)) {
				System.out.println(dictionary.get(key));
			}else {
				System.out.println("해당하는 단어가 없습니다.");
			}
		}else
			break;
	}
	System.out.println("종료");
	
	
}
}
