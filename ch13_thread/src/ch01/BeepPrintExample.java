package ch01;

import java.awt.Toolkit;

public class BeepPrintExample {
public static void main(String[] args) {
	//beep음 출려용 객체 생성
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0;i<5;i++) {
		toolkit.beep();
		try {
			Thread.sleep(500); //0.5초간 정지
		}catch(Exception e) {}
	}
	for(int i=0;i<5;i++) {
		System.out.println("띵");
		}try {
			Thread.sleep(500); //0.5초간 정지
		} catch (Exception e) {
		}
}
}
