package ch04_Array2;

public class ArrayCopyExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
		//System.arrayCopy();
		//arraycopy(소스,소스의시작index,타겟,타겟의시작index,복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		System.out.println("\n--------------------");
		//java.lang.ArrayIndexOutOfBoundsException: 소스의 갯수가 2개인데 타겟배열의 인덱스번호를 초과시 오류발생
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");
		
		System.out.println();
		int srcPos = 1;
		int num = oldStrArray.length - srcPos; //3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0;i<newStrArray.length;i++)
			System.out.print(newStrArray[i]+" ");

	}

}
