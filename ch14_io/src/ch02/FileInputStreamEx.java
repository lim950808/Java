package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
public static void main(String[] args) {
	byte[] b = new byte[6];
	
	try {
		//byte���� �Է� ���
		FileInputStream fin = new FileInputStream("c:\\temp\\test.out");
		int n=0,c;
		while((c=fin.read())!=-1) { //byte�� �о int c�� ����, ���̸� -1 ����
			b[n] = (byte)c; //int -> byte�� ����
			n++;
		}
		System.out.println("c:\\temp\\test.out���� ���� �迭���� ���");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
		System.out.println();
		fin.close();
	} catch (Exception e) {
		System.out.println("���Ȯ�� ���");
		e.printStackTrace();
	}
}
}
