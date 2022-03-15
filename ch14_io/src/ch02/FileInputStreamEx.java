package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
public static void main(String[] args) {
	byte[] b = new byte[6];
	
	try {
		//byte단위 입력 통로
		FileInputStream fin = new FileInputStream("c:\\temp\\test.out");
		int n=0,c;
		while((c=fin.read())!=-1) { //byte씩 읽어서 int c에 저장, 끝이면 -1 리턴
			b[n] = (byte)c; //int -> byte로 저장
			n++;
		}
		System.out.println("c:\\temp\\test.out에서 읽은 배열내용 출력");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
		System.out.println();
		fin.close();
	} catch (Exception e) {
		System.out.println("경로확인 요망");
		e.printStackTrace();
	}
}
}
