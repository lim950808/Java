package ch02_Objects.copy;

import java.util.Objects;

public class EqualsAnsDeepEqualsEx {
	public static void main(String[] args) {
		//intŸ���� ��üȭ �� Ŭ����
		Integer o1 = 1000;
		Integer o2 = 1000;
		//�� ��ü�� ����.
		System.out.println(Objects.equals(o1,02)); //(a==b) || (a!=null && a.equals(b))
		//�� ��ü�� �ʵ� ���뵵 ����.
		System.out.println(Objects.deepEquals(o1,02));
		/*if(a==b)
		 * return true;
		 * else if(a==null || b==null)
		 * return false;
		 * else
		 * return Arrays.deepEquals0(a, b);
		 */
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		//�� ��ü�� ����.
		System.out.println(Objects.equals(arr1, arr2)); //(a==b) || (a!=null && a.equals(b))
		System.out.println(Objects.deepEquals(arr1, arr2));
	}

}
