package fundamentalDS;

import java.util.Arrays;

public class CaesarCipher {
	private int charCount = 26;
	
	protected char[] encoder = new char[charCount];
	protected char[] decoder = new char[charCount];
	
	public CaesarCipher(int rotation) {
		for(int k = 0; k< charCount; k++) {
			encoder[k] = (char) ('A' + (k+rotation) % charCount);
			decoder[k] = (char) ('A' + (k-rotation + charCount) % charCount);
		}
	}
	
	public String encrypt(String message) {
		return transform(message, encoder);
	}
	
	public String decrypt(String message) {
		return transform(message, decoder);
	}
	
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for(int k =0; k< msg.length; k++) {
			if(Character.isUpperCase(msg[k])) {
				int j = msg[k] - 'A';
				msg[k] = code[j];
			}
		}
		return new String(msg);
	}
	
	public static void main(String[] args) {
//		System.out.println((int)'A');
		
		CaesarCipher cipher = new CaesarCipher(3);
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer);
	}
}
