package Homework;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class BankApplication {
	//List�� ����
	static List<Account> accountlist = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	static String omg;
	static Date today = new Date();
	static SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm");
	static String result = df.format(today);
	
	static FileWriter fout = null;

	public static void main(String[] args) throws IOException {
		boolean run=true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.��ü | 6.����");
			System.out.println("--------------------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1: createAccount(); break;
			case 2: accountList(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: transfer(); break;
			case 6: 
				fout = new FileWriter("c:\\temp\\bank.txt",true);
				fout.write(omg);
				fout.close();
				
				run=false; break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//5.��ü�ϱ�
	private static void transfer() {
		System.out.println("------");
		System.out.println("��ü");
		System.out.println("------");
		//������ ����
		System.out.println("������ ���¹�ȣ>");
		String ano1 = scanner.next();
		//�޴� ����
		System.out.println("�޴� ���¹�ȣ>");
		String ano2 = scanner.next();
		//��ü �ݾ�
		System.out.println("��ü��>");
		int amount = scanner.nextInt();
		//������ ���¿� �޴� ����
		if(findAccount(ano1)==null || findAccount(ano2)==null) {
			System.out.println("���¹�ȣ�� Ȯ���ϼ���!!");
		}else { //���¹�ȣ�� ��� ������ ��ü ó��
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2);
			//������ ��: �ܰ�-��ü��, �޴� ��: �ܰ�+��ü��
			if (a1.getBalance() - amount >= 0) {
				a1.setBalance(a1.getBalance()-amount);
				a2.setBalance(a2.getBalance()+amount);
				System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("���: �ܰ� �����մϴ�.");
			}
		}
	}
	
	//1.���»����ϱ�
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.println("������:");
		String owner = scanner.next();
		System.out.println("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();
		//���»���
		Account acc = new Account(owner, balance);
		//����Ʈ�� ���
		accountlist.add(acc);
		
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	//2.���¸�Ϻ���
	private static void accountList() {		
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		
		for(int i=0;i<accountlist.size();i++) {
			Account account = accountlist.get(i);
			System.out.println(account);
		}		
	}		
	
	
	//3.�����ϱ�
	private static void deposit() throws IOException {	
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.println("���¹�ȣ");
		String ano = scanner.next();
		System.out.println("���ݾ�");
		int amount = scanner.nextInt();
		//�ش� ���¹�ȣ ã��
		Account acc = findAccount(ano);
		System.out.println("��ȸ���:"+ano);
		//�ش���� ���� ����Ȯ��
		if(acc!=null) {
			acc.setBalance(acc.getBalance() + amount);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		System.out.print("�Ա���:");
		System.out.println(result);
		omg = result+"\n"+ano+"\n"+amount+"\n"+acc.getBalance();
		}else {
			System.out.println("���: ���¹�ȣ�� Ȯ�����ּ���.");
		}
	}
	
	//4.����ϱ�
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.println("���¹�ȣ");
		String ano = scanner.next();
		System.out.println("��ݾ�");
		int amount = scanner.nextInt();
		//�������� ��ȸ
		Account acc = findAccount(ano);
		//���� ���� Ȯ��
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
				acc.setBalance(acc.getBalance()-amount);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���: �ܰ� �����մϴ�.");
			}
		}else {
			System.out.println("���: ���¹�ȣ�� �������ּ���.");
		}
			
	}

	private static Account findAccount(String ano) {
		//list�� ����� ��ü ���� size()
		
		for(int i=0;i<accountlist.size();i++) {
			Account account  = accountlist.get(i);
			if(account.getAno().equals(ano)) return account;
		}
		return null; //�迭 ��ü�� ã�Ƶ� ������ null����
	}

}
