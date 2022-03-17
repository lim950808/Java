package ch03_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapEx04 {
public static void main(String[] args) {
	//1."홍길동", 2."일지매", 3."임꺽정", 2."이순신"
	//value을 저장하는 Map을 만들고, 저장 후
	//저장된 객체의 갯수 확인
	//Map에서 3번 key에 해당하는 객체를 출력
	
	//Map<Integer,String> members = new HashMap<>();
	Map<Integer,String> members = new Hashtable<>();
	members.put(new Integer(1),"홍길동");
	members.put(2,"일지매"); //기본타입 int -> Integer로 AutoBoxing
	members.put(3,"임꺽정"); //기본타입 int -> Integer로 AutoBoxing
	members.put(2,"이순신"); //기본타입 int -> Integer로 AutoBoxing
	
	//저장된 객체의 갯수 확인
	System.out.println(members.size()); //autoBoxing
	//Map에서 3번 key에 해당하는 객체를 출력
	System.out.println(members.get(3));
	//Map에서 2번 key에 해당하는 객체를 출력
	System.out.println(members.get(2)); //이순신 출력 -> key가 중복될 경우 마지막에 오는 것을 출력
}
}
