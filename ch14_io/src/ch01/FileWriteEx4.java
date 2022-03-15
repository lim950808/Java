package ch01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx4 {
public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	//���ڴ���(2byte)�� ���� �����ϴ� ��Ʈ�� ��ü ����
	final String fileName = "c:\\temp\\ex1.txt";
	FileWriter fout = new FileWriter(fileName);
	FileReader fin = new FileReader(fileName);
	int c;
	try {
		System.out.println("�޼����� �Է��ϼ���>");
		while(true) {
			String line = scanner.nextLine(); //�� �� ������ �Է¹ޱ�
			if(line.length()==0) break; //�����Է� ���� EnterŰ ġ�� ����������
			fout.write(line,0,line.length()); //write(���ڿ�,����index,���ڿ� ����);
			fout.write("\r\n",0,2); //����ڿ� ĳ���� �����߰�, write(���ڿ�, ����index, ���ڿ�����);
		}
		//�ڿ�����
		fout.close();
		while((c=fin.read()) !=-1) { //read()�Լ� ���ھ� �о intŸ������ ���ϸ޼ҵ�, ������ -1�� ����
				System.out.print((char)c); //���ڷ� ����ȯ �� ���
		}
			//�ڿ�����
		fin.close();
		}catch (IOException e) {
		e.printStackTrace();
	}
	//�ڿ�����
	scanner.close();
	
}
}
