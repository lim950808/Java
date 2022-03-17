package ch03_Array;

public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {78,98,54,76,87};
		System.out.println("배열의 갯수:"+score.length);
		
		//총점
		int total = 0;
		for(int i=0;i<score.length;i++) {
			total+=score[i];
		}
		System.out.println("총점:"+total);
		
		//평균 - double타입 형태 출력
		double avg = 0; //0->0.0 자동 형변환
		avg = total/(double)score.length;
		System.out.println("평균:"+avg);
		
		total = 0; //값 재설정
		//향상된 for문으로 총점 구하기
		for(int s:score) {
			total += s; //score[0],score[1],...
		}
		
	}

}
