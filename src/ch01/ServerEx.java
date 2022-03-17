package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
public static void main(String[] args) {
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Scanner scanner = new Scanner(System.in);
	try {
		//���� ���� ���� 172.30.1.31, 9999
		listener = new ServerSocket(9999);
		System.out.println("������ ��ٸ��� �ֽ��ϴ�...");
		socket = listener.accept();
		System.out.println("����Ǿ����ϴ�.");
		//��� ����
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//������ �ְ�ޱ�
		while(true) {
			String inputMessage = in.readLine(); //Ŭ���̾�Ʈ�κ��� �� �྿ �б�
			//���� ����
			if(inputMessage.equalsIgnoreCase("bye")) { //Bye, bYe, bYE, BYE
				System.out.println("Ŭ���̾�Ʈ�κ��� bye�� ������ �����մϴ�.");
				break; //���� ����
			}
			System.out.println("Ŭ���̾�Ʈ:"+inputMessage); //Ŭ���̾�Ʈ�κ��� �� �޼��� ���
			System.out.println("������>>");
			String outputMessage = scanner.nextLine(); //Ű����κ��� �� �྿ ������
			out.write(outputMessage+"\n"); //���پ� �޵��� ����
			out.flush(); //���ۿ� �����ִ� ������ �о��
		}
	} catch (Exception e) {
		
	}finally {
		try {
			scanner.close(); socket.close(); listener.close();
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�");
		}
	}
}
}
