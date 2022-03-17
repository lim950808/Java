package ch02_Objects.copy;

import java.util.Objects;

public class EqualsAnsDeepEqualsEx {
	public static void main(String[] args) {
		//int타입을 객체화 한 클래스
		Integer o1 = 1000;
		Integer o2 = 1000;
		//두 객체가 같다.
		System.out.println(Objects.equals(o1,02)); //(a==b) || (a!=null && a.equals(b))
		//두 객체의 필드 내용도 같다.
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
		//두 객체가 같다.
		System.out.println(Objects.equals(arr1, arr2)); //(a==b) || (a!=null && a.equals(b))
		System.out.println(Objects.deepEquals(arr1, arr2));
	}

}
