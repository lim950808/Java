package ch03_Array;

public class CharArrays {
	public static void main(String[] args) {
		final int alpha = 26;
		final int up_ascii = 65;
		final int low_ascii = 97;
		
		char[] lower  = new char[alpha];
		char[] upper = new char[alpha];
		char[] alphabets = new char[lower.length + upper.length];
		
		for(int i=0; i<alpha; i++) {
			upper[i] = (char)(i+up_ascii);
			lower[i] = (char)(i+low_ascii);
		}
		
		System.arraycopy(upper, 0, alphabets, 0, alpha);
		System.arraycopy(lower, 0, alphabets, alpha, alpha);
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=i+1; j<alphabets.length; j++) {
				if(alphabets[i] > alphabets[j]) {
					char temp = 0;
					temp = alphabets[i];
					alphabets[i] = alphabets[j];
					alphabets[j] = temp;
				}
			}
		}
		
		for(int i:alphabets) {
			System.out.print((char)i);
		}
		
	}
}