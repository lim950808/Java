package ch03_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapEx04 {
public static void main(String[] args) {
	//1."ȫ�浿", 2."������", 3."�Ӳ���", 2."�̼���"
	//value�� �����ϴ� Map�� �����, ���� ��
	//����� ��ü�� ���� Ȯ��
	//Map���� 3�� key�� �ش��ϴ� ��ü�� ���
	
	//Map<Integer,String> members = new HashMap<>();
	Map<Integer,String> members = new Hashtable<>();
	members.put(new Integer(1),"ȫ�浿");
	members.put(2,"������"); //�⺻Ÿ�� int -> Integer�� AutoBoxing
	members.put(3,"�Ӳ���"); //�⺻Ÿ�� int -> Integer�� AutoBoxing
	members.put(2,"�̼���"); //�⺻Ÿ�� int -> Integer�� AutoBoxing
	
	//����� ��ü�� ���� Ȯ��
	System.out.println(members.size()); //autoBoxing
	//Map���� 3�� key�� �ش��ϴ� ��ü�� ���
	System.out.println(members.get(3));
	//Map���� 2�� key�� �ش��ϴ� ��ü�� ���
	System.out.println(members.get(2)); //�̼��� ��� -> key�� �ߺ��� ��� �������� ���� ���� ���
}
}
