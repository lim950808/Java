package ch03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//���ú� �µ��� �����ϰ� ���ø� �ش��ϴ� �µ� ���
public class MapEx02 {
public static void main(String[] args) {
	Map<String,Double> cities = new HashMap<>();
	cities.put("����", 32.5); //
	cities.put("����¡", 35.8);
	cities.put("ȫ��", 39.5);
	cities.put("����", 38.7); //����key�� ���� �����ϸ� ���� �������� value�� ����
							//"����" 32.5 -> "����" 38.7�� ����
	
	//key�鸸 ����
	Set<String> keyset = cities.keySet();
	//�ݺ��ڸ� �̿��Ͽ� ��ü key�� �ϳ��� ������
	Iterator<String> itor = keyset.iterator();
	while(itor.hasNext()) {
		String key = itor.next(); //key �Ѱ� ��������
		double cc = cities.get(key); //key�� �� ��������
		System.out.println(key+"������ �µ��� "+cc);
	}
	
	//������ �µ��� ����ϼ���.
	double c = cities.get("����");
	System.out.println("������ �µ���:"+c);
	//ȫ���� �µ�
	c = cities.get("ȫ��");
	System.out.println("ȫ���� �µ���:"+c);
}
}
